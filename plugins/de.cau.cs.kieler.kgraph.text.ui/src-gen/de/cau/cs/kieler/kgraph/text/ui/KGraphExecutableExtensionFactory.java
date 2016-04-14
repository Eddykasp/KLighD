/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kgraph.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cau.cs.kieler.kgraph.text.ui.internal.KGraphActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class KGraphExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return KGraphActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return KGraphActivator.getInstance().getInjector(KGraphActivator.DE_CAU_CS_KIELER_KGRAPH_TEXT_KGRAPH);
	}
	
}
