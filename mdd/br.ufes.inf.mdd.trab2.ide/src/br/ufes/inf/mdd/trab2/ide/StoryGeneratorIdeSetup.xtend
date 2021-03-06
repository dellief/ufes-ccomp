/*
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.ide

import br.ufes.inf.mdd.trab2.StoryGeneratorRuntimeModule
import br.ufes.inf.mdd.trab2.StoryGeneratorStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StoryGeneratorIdeSetup extends StoryGeneratorStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StoryGeneratorRuntimeModule, new StoryGeneratorIdeModule))
	}
	
}
