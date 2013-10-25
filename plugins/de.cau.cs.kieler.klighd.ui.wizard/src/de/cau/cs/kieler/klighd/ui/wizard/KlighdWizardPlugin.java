/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klighd.ui.wizard;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author uru
 * @author chsch
 */
public class KlighdWizardPlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.klighd.ui.wizard"; //$NON-NLS-1$

    private Injector injector;
    
    // The shared instance
    private static KlighdWizardPlugin plugin;
    
    private Map<String, Injector> injectors = Collections.synchronizedMap(Maps
            .<String, Injector>newHashMapWithExpectedSize(1));

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext bundleContext) throws Exception {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext bundleContext) throws Exception {
        injectors.clear();
        plugin = null;
    }

    /**
     * Getter.
     * 
     * @return the singleton instance
     */
    public static KlighdWizardPlugin getInstance() {
        return plugin;
    }

    /**
     * Provides the {@link Injector} used within this {@link AbstractUIPlugin plug-in}.
     * 
     * @return the injector
     */
    public Injector getInjector() {
        if (injector == null) {
            injector = createInjector("");
        }
        return injector;
    }

    private Injector createInjector(final String language) {
        try {
            Module runtimeModule = new AbstractGenericModule() {
                @Override
                public void configure(final Binder binder) {
                    super.configure(binder);

                    binder.bind(IProjectCreator.class).to(KlighdProjectCreator.class);
                    binder.bind(IWorkspace.class).toProvider(new Provider<IWorkspace>() {
                        public IWorkspace get() {
                            return ResourcesPlugin.getWorkspace();
                        }
                    });
                }

            };
            return Guice.createInjector(runtimeModule);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create injector for " + language, e);
        }
    }
}
