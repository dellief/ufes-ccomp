/*
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StoryGeneratorStandaloneSetup extends StoryGeneratorStandaloneSetupGenerated {

	def static void doSetup() {
		new StoryGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}