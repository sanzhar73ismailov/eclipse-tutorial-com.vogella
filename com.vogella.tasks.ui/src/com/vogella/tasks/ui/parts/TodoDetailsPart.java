package com.vogella.tasks.ui.parts;

import org.eclipse.swt.widgets.Composite;

import com.vogella.tasks.ui.ACustomClass;

import jakarta.annotation.PostConstruct;

import org.eclipse.e4.core.di.annotations.Optional;

import jakarta.inject.Inject;

public class TodoDetailsPart {

	public TodoDetailsPart() {
		System.out.println(this.getClass().getSimpleName() + " constructed");
	}

	@PostConstruct
	public void createControls(Composite parent) {
		System.out.println(this.getClass().getSimpleName() + " @PostConstruct method called.");
	}

	@Inject
	@Optional
	public void createControls(ACustomClass customObject) {
		System.out.println("Received: " + customObject);
	}

}
