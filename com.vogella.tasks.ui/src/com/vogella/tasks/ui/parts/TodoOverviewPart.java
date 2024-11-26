package com.vogella.tasks.ui.parts;

import org.eclipse.swt.widgets.Composite;
import jakarta.annotation.PostConstruct;

public class TodoOverviewPart {
	
	public TodoOverviewPart() {
		System.out.println(this.getClass().getSimpleName() + " constructed");
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	    System.out.println(this.getClass().getSimpleName()
	    + " @PostConstruct method called.");
	}
}
