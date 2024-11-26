package com.vogella.tasks.ui.parts;

import org.eclipse.swt.widgets.Composite;

import com.vogella.tasks.ui.ACustomClass;

import jakarta.annotation.PostConstruct;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class PlaygroundPart {

//	public PlaygroundPart() {
//        System.out.println(this.getClass().getSimpleName() + " constructed");
//    }
//	
	@Inject
	public PlaygroundPart(@Named("applicationContext") IEclipseContext ctx) {

		IEclipseContext localCtx = EclipseContextFactory.create();
		localCtx.set(String.class, "My object available for DI");

		// You could also connect your new local context with an existing context
		// hierarchy
//      localCtx.setParent(context);

		// Create instance via factory (DI!)
		ACustomClass p = ContextInjectionFactory.make(ACustomClass.class, localCtx);
		// persist the newly created object in the application context
		// this make the object available via DI for the whole application
		ctx.set(ACustomClass.class, p);
	}

	@PostConstruct
	public void createControls(Composite parent) {
		System.out.println(this.getClass().getSimpleName() + " @PostConstruct method called.");
	}
}
