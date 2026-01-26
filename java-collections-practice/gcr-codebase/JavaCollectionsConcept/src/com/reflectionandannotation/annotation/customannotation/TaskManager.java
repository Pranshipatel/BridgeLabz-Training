package com.reflectionandannotation.annotation.customannotation;

public class TaskManager {

	@TaskInfo(priority = 1, assignedTo = "Pranshi")
	public void processTask() {
		System.out.println("Processing task...");
	}
}