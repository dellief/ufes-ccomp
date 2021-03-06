/*
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.ide

import br.ufes.inf.pg.StoryGenRuntimeModule
import br.ufes.inf.pg.StoryGenStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StoryGenIdeSetup extends StoryGenStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StoryGenRuntimeModule, new StoryGenIdeModule))
	}
	
}
