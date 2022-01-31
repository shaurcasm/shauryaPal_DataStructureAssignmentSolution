package com.greatlearning.question1.service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Construction {
	
	Queue<String> construction_days = new LinkedList<>();

	public void insertFloorsMade(Stack<Integer> stack, int value) {
		int top_of_stack;
		
		if(stack.isEmpty() || value > stack.peek()) {
			stack.push(value);
			return;
		} else if (value < stack.peek()) {
			top_of_stack = stack.pop();
			insertFloorsMade(stack, value);
			stack.push(top_of_stack);
		} else {
			System.out.println("Floor repeated.");
		}
	}
	
	public void construct(Stack<Integer> floors_made, Stack<Integer> floors_to_make, String day_of_work) {
		if (floors_to_make.isEmpty() || floors_made.isEmpty()) {
			construction_days.add(day_of_work);
			return;
		}
		
		if (floors_made.peek() != floors_to_make.peek()) {
			construction_days.add(day_of_work);
			return;
		} else {
			floors_to_make.pop();
			day_of_work += floors_made.pop() + " ";
			construct(floors_made, floors_to_make, day_of_work);
		}
	}
	
	public void displayConstruction() {
		System.out.println("The order of construction is as follows");
		int i = 1;
		
		while (!construction_days.isEmpty()) {
			System.out.println("Day: " + i++);
			System.out.println(construction_days.remove());
		}
	}
}
