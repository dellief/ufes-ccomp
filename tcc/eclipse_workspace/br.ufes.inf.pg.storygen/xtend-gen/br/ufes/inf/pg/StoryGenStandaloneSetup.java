/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg;

import br.ufes.inf.pg.StoryGenStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StoryGenStandaloneSetup extends StoryGenStandaloneSetupGenerated {
  public static void doSetup() {
    new StoryGenStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
