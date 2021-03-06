/*
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import br.ufes.inf.pg.storyGen.Existent
import br.ufes.inf.pg.storyGen.ExistentAttributeTerm
import br.ufes.inf.pg.storyGen.ExistentChange
import br.ufes.inf.pg.storyGen.StoryAttributeTerm
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.pg.storyGen.Story
import org.eclipse.emf.common.util.EList
import br.ufes.inf.pg.storyGen.StoryDataChange
import br.ufes.inf.pg.storyGen.Change

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class StoryGenScopeProvider extends AbstractDeclarativeScopeProvider {

	//
	def IScope scope_ExistentAttributeTerm_attribute(ExistentAttributeTerm ctx, EReference ref) {
		return scope_AttributesOfExistent(ctx.existent);
	}
	
	def IScope scope_StoryAttributeTerm_attribute(StoryAttributeTerm ctx, EReference ref) {
//		return scope_AttributesOfStoryData(ctx);
	}
	
	def IScope scope_Change_attribute(Change ctx, EReference ref) {
		if(ctx instanceof ExistentChange) {
			return scope_AttributesOfExistent(ctx.existent);
		}
		else if(ctx instanceof StoryDataChange) {
			return scope_AttributesOfStoryData(ctx);
		}
	}
	
//	def IScope scope_ExistentChange_attribute(ExistentChange ctx, EReference ref) {
//		return scope_AttributesOfExistent(ctx.existent);
//	}
//	
//	def IScope scope_StoryDataChange_attribute(StoryDataChange ctx, EReference ref) {
//		return scope_AttributesOfStoryData(ctx);
//	}
	
	
	//
	def IScope scope_AttributesOfExistent(Existent ex) {
		var existent = ex;
		
		if (existent !== null) {
			var attributes = existent.attributes;

//			while (existent.superType !== null) {
//				attributes.addAll(existent.superType.attributes);
//				existent = existent.superType;
//			}

			return Scopes.scopeFor(attributes)
		}
	}
	
	//
	def IScope scope_AttributesOfStoryData(EObject ctx) {
		var story = EcoreUtil2.getRootContainer(ctx) as Story;
		var EList<br.ufes.inf.pg.storyGen.Attribute> attributes;
		
		for (attribute : story.data.attributes) {
			attributes.add(attribute);
		}

		return Scopes.scopeFor(attributes)
	}
	

}
