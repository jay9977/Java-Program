package com.getterSetter;

public class Student {
	private int rollNumber;
	private String name;
	private float marks;
	private static int[] rollNumbers = new int[60];

	// Setter method
	public void setRollnumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber <= 60) {
			boolean isRollNumberPresent = false;

			for (int i = 0; i < rollNumbers.length; i++) {
				if (rollNumbers[i] == rollNumber) {
					isRollNumberPresent = true;
					System.err.println("Student already exists, please enter another rollNumber.");
					break;
				}
			}

			if (!isRollNumberPresent) {
				this.rollNumber = rollNumber; // Set the instance variable rollNumber
				// Store the rollNumber in the array at an empty position
				for (int i = 0; i < rollNumbers.length; i++) {
					if (rollNumbers[i] == 0) { // find an empty slot (assuming roll numbers start from 1)
						rollNumbers[i] = rollNumber;
						break;
					}
				}
			}
		} else {
			System.out.println("Roll number is invalid.");
		}
	}

	// Getter method
	public int getRollnumber() {
		return rollNumber;
	}
}
