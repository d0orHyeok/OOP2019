package p2;

import java.util.Arrays;
import java.util.Random;

public class MyArrayManipulations {
	public static void main(String[] args) {
		double[] doubleArray = new double[5];
		setRandomArray(doubleArray, 10);
		
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray: ");
		for (double value : doubleArray) {
			System.out.printf("%.1f ", value);
		}
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
		
		int[] intArray = new int[10];
		setRandomArray(intArray, 30);
		
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy%n", (b? "==" : "!="));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filleddIntArray%n",
				(b? "==" : "!="));
		
		int location = Arrays.binarySearch(intArray,  5);
		if (location >= 0) {
			System.out.printf("Found 5 at element %d in intArray%n", location);
		}
		else {
			System.out.println("5 not found in intArray");
		}
		
		location = Arrays.binarySearch(intArray, 8763);
		
		if(location >= 0) {
			System.out.printf("Found 8763 at element %d in intArray%n", location);
		}
		else {
			System.out.println("8763 not found in intArray");
		}
	}
	
	public static void setRandomArray(int[] array, int sizeOfValue) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int value = random.nextInt(sizeOfValue); //0~sizeOfValue-1 사이의 랜덤한 값
			array[i] = value++; // 1~sizeOfValue 사이의 랜덤한 정수 저장 
		}
	}
	
	public static void setRandomArray(double[] array, int sizeOfValue) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			double value = random.nextInt(sizeOfValue) + random.nextDouble(); 
			array[i] = value;
		}
	}
	
	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s: ", description);
		for (int value : array) {
			System.out.printf("%d ", value);
		}
	}
}
