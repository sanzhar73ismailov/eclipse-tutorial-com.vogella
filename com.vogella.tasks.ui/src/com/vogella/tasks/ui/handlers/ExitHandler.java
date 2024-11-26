package com.vogella.tasks.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitHandler {
	
	@Execute
	public void execute(IWorkbench workbench) {
		System.out.println((this.getClass().getSimpleName() + " called"));
		workbench.close();
	}
}
