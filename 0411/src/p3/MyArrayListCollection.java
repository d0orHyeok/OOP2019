package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyArrayListCollection {
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red");
		items.add("orange");
		items.add("yellow");
		items.add("green");
		items.add("blue");
		items.add("indigo");
		items.add("purple");
		display(items, "Raindow Color:");
		
		findColor(items);
	}
	
	public static void display(ArrayList<String> items, String header) {
		System.out.printf(header);
		
		for (String item: items) {
			System.out.printf(" %s", item);
		}
		System.out.println();
	}
	
	public static void findColor(ArrayList<String> items) {
		Scanner sc = new Scanner(System.in);
		System.out.print("type color you want to find out: ");
		String type = sc.next();
		System.out.printf("\"%s\" is %sin the list%n", type, items.contains(type) ? "" : "not ");
	}
}