/*
 * generated by Xtext 2.23.0
 */
package org.lflang.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.generator.IShouldGenerate;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.template.DefaultTemplateProjectCreator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class LFUiModule extends LFUiModuleImpl {

	public LFUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
    /** The rebuild checker that considers markers by error reporter. */
	@Override
    public Class<? extends IShouldGenerate> bindIShouldGenerate() {
        return EclipseBasedShouldGenerateLF.class;
    }
	
    /**
     * Manually activate project template support.
     * This would be added by the TemplateProjectWizardFragment (in mwe file) to the AbstractLFUiModule 
     * but we do not want this fragment to create xtend files.
     */
    @SuppressWarnings("restriction")
    public Class<? extends IProjectCreator> bindIProjectCreator() {
        return DefaultTemplateProjectCreator.class;
    }
}
