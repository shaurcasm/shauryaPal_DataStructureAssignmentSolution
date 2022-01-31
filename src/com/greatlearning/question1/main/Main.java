package com.greatlearning.question1.main;

import java.util.Scanner;
import java.util.Stack;

import com.greatlearning.question1.service.Construction;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Construction construction = new Construction();
		
		Stack<Integer> floors_to_make = new Stack<>();
		Stack<Integer> floors_made = new Stack<>();
		
		String emptyString = "";
		int no_of_floors;
		System.out.println("Enter the total no of floors in the building");
		no_of_floors = sc.nextInt();
		
		int floor;
		
		for(int i = 1; i <= no_of_floors; i++) {
			floors_to_make.push(i);
		}
		
		for(int i = 1; i <= no_of_floors; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			floor = sc.nextInt();
			
			if (floor < 1 || floor > no_of_floors) {
				System.out.println("Invalid Floor Made");
				sc.close();
				return;
			}
			
			construction.insertFloorsMade(floors_made, floor);
			construction.construct(floors_made, floors_to_make, emptyString);
		}
		
		construction.displayConstruction();
		sc.close();
	}

}
