package com.vogella.tasks.ui;

import jakarta.inject.Inject;

public class ACustomClass {

	@Inject
	public String string;

	//
	@Override
	public String toString() {
		return string;
	}
}
