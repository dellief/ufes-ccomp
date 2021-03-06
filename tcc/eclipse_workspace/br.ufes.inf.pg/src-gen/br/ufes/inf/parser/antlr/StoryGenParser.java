/*
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.parser.antlr;

import br.ufes.inf.parser.antlr.internal.InternalStoryGenParser;
import br.ufes.inf.services.StoryGenGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class StoryGenParser extends AbstractAntlrParser {

	@Inject
	private StoryGenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStoryGenParser createParser(XtextTokenStream stream) {
		return new InternalStoryGenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Story";
	}

	public StoryGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StoryGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
