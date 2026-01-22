package com.collections.queue;

import java.util.PriorityQueue;

class Patient {

	String name;
	int severity; // Higher value = more critical

	// Constructor
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}
}

public class HospitalTriage {
	public static void main(String[] args) {

		// PriorityQueue with custom comparator (Max-Heap)
		PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

		// Adding patients
		queue.add(new Patient("John", 3));
		queue.add(new Patient("Alice", 5));
		queue.add(new Patient("Bob", 2));

		// Treat patients based on severity
		System.out.println("Treatment Order:");
		while (!queue.isEmpty()) {
			Patient p = queue.poll();
			System.out.println(p.name + " (Severity: " + p.severity + ")");
		}
	}

}
