/*
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import br.ufes.inf.mdd.trab2.storyGenerator.World
import br.ufes.inf.mdd.trab2.storyGenerator.Story
import br.ufes.inf.mdd.trab2.storyGenerator.Attribute
import br.ufes.inf.mdd.trab2.storyGenerator.AttrType
import br.ufes.inf.mdd.trab2.storyGenerator.Event
import br.ufes.inf.mdd.trab2.storyGenerator.Condition
import br.ufes.inf.mdd.trab2.storyGenerator.BoolExp
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import br.ufes.inf.mdd.trab2.storyGenerator.BinaryBoolExp
import br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp
import br.ufes.inf.mdd.trab2.storyGenerator.BinaryQntyExp
import br.ufes.inf.mdd.trab2.storyGenerator.UnaryQuantityExp
import br.ufes.inf.mdd.trab2.storyGenerator.NegateBoolExp
import br.ufes.inf.mdd.trab2.storyGenerator.BoolOp

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StoryGeneratorGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{

		
		for (s : resource.allContents.toIterable.filter(Story))
		{

	            fsa.generateFile(	            	
		            "StoryGenerator.cs",
		            s.compile)
		}

	}
	
	def compile(World w) ''' 
    	public class World
    	{
    		«FOR a : w.attributes»«a.compile»«ENDFOR»
    	}
    '''
    
    def compile(Attribute a)
    '''
    	«IF a.attrType == AttrType.FACT»
    	bool «a.fullyQualifiedName.toString().toFirstLower»;
    	public bool Get«a.fullyQualifiedName.toString().toFirstUpper»()
    	{
    		return «a.fullyQualifiedName.toString().toFirstLower»;
    	}
    	public void Set«a.fullyQualifiedName.toString().toFirstUpper»(bool value)
    	{
    		«a.fullyQualifiedName.toString().toFirstLower» = value;
    	}
    	«ELSE»
    	int «a.fullyQualifiedName.toString().toFirstLower»;
    	public int Get«a.fullyQualifiedName.toString().toFirstUpper»()
    	{
    		return «a.fullyQualifiedName.toString().toFirstLower»;
    	}
    	public void Set«a.fullyQualifiedName.toString().toFirstUpper»(int value)
    	{
    		«a.fullyQualifiedName.toString().toFirstLower» = value;
    	}
	    «ENDIF»
    '''

    
    /*EVENT CODE GENERATION */
    def compile(EList<Event> events) ''' 
	
	public enum Event {DoNothing«FOR e : events»«IF e.abstract !== true», «e.name.toFirstUpper»«ENDIF»«ENDFOR»}
	
	public abstract class EventRules
	{
		public abstract Event EventEnum {get;}
	
		public abstract bool PreconditionsMet(World w);
	}
	
	public class DoNothingEventRules : EventRules
	{
		public override Event EventEnum
		{get{return Event.DoNothing;}}
	
		public override bool PreconditionsMet(World w){return true;}
	}
	
	«FOR e : events»«e.compile»«ENDFOR»
	
	'''
    
    
    
    def compile(Event e) '''
	public «IF e.abstract !== false»abstract «ENDIF» class «e.name»EventRules : «IF e.superType !== null && e.superType.abstract !== false  
                     »«e.superType.fullyQualifiedName»EventRules«ELSE»EventRules«ENDIF»
	{
		«IF e.abstract !== true»public override Event EventEnum
		{get{return Event.«e.name.toFirstUpper»;}}«ENDIF»
		
		public override bool PreconditionsMet(World w)
		{
			return «IF e.superType !== null && e.superType.abstract !== false
			»base.PreconditionsMet(w)
			 && «ENDIF»(«FOR c : e.conditions»(«c.compile»)
			 && «ENDFOR» true);
		}
	}
	
	'''
	
	def compile(Condition c)'''«
	c.boolExp.compile»'''
	
	def CharSequence compile(BoolExp exp)'''«
	IF exp.unaryBool !== null»«exp.unaryBool.compile»«
	ELSEIF exp.binaryBool !== null»«exp.binaryBool.compile»«
	ELSEIF exp.binaryQnty !== null»«exp.binaryQnty.compile»«
	ELSEIF exp.negateBoolExp !== null»«exp.negateBoolExp.compile»«
	ELSE»(«exp.left.compile») «exp.boolOp.compile» («exp.right.compile»)«ENDIF»'''
	
	def compile(BoolOp boolOp)
	'''
	«IF boolOp == BoolOp.AND»&&
	«ELSEIF boolOp == BoolOp.OR»||
	«ELSE»«boolOp.literal»
	«ENDIF»
	'''
	
	def compile(NegateBoolExp negateExp)
	'''
	!«negateExp.boolExp.compile»
	'''
	
	def compile(BinaryBoolExp binExp)'''«
	binExp.left.compile» «binExp.boolOp» «binExp.right.compile»'''
	
	def compile(BinaryQntyExp qntyExp)'''«
	qntyExp.left.compile» «qntyExp.numOp» «qntyExp.right.compile»'''
	
	def compile(UnaryQuantityExp unExp)'''«
	IF unExp.id !== null»w.Get«unExp.id.name.toFirstUpper»()«
	ELSE»«unExp.value»«ENDIF»'''
	
	def compile(UnaryBoolExp unExp)'''«
	IF unExp.id !== null»w.Get«unExp.id.name.toFirstUpper»()«
	ELSE»«unExp.value.literal»«ENDIF»'''
	
	
        /*STORY GENERATOR GENERATION */
	def compile(Story s)
	{
		val list = new LinkedList<Event>()
		for (element : s.events) 
		{
			if(element.abstract == false)
			{
				list.add(element);
			}			
		}
		 '''
	using System;
	using System.Collections.Generic;
	 
	namespace StoryGeneration
	{
		public class StoryGenerator
		{
			EventRules[] eventRules;
			Random random;
			
			public StoryGenerator()
			{
				random = new Random();
				eventRules = new EventRules[«list.length»];
				«{
					val charList = new LinkedList<Character>()
					for(i : 0 ..< list.size())
					{
						for(j : 0 ..< ("eventRules[" + i + "] = new " + list.get(i).name + "EventRules();").length)
						{
							charList.add(new Character(("eventRules[" + i + "] = new " + list.get(i).name + "EventRules();").charAt(j)))
						}
						charList.add('\n')
					}
					val builder = new StringBuilder(list.size());
				    for(Character ch: charList)
				    {
				        builder.append(ch);
				    }
					builder.toString()
				}»
			}
			
			public Event ChooseEvent(World w)
			{
				List<EventRules> consideredEvents = new List<EventRules>();
				for(int i = 0; i < eventRules.Length; i++)
				{
					if(eventRules[i].PreconditionsMet(w))
					{
						consideredEvents.Add(eventRules[i]);
					}
				}
				
				if(consideredEvents.Count > 0)
				{
					int r = random.Next(0,consideredEvents.Count);
					return consideredEvents[r].EventEnum;
				}
				else
				{
					return (new DoNothingEventRules()).EventEnum;
				}
			}
		}
		«s.events.compile»
		«s.world.compile»
	}
	
    '''
	}
}
