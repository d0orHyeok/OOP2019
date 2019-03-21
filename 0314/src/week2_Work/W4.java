package week2_Work;

public class W4 {
	public static void main(String[] args) {
		int n = 6;
		
		int arr1[] = {46, 33, 33, 22, 31, 50};
		int arr2[] = {27, 56, 19, 14, 14, 10};
		
		int[] arr3 = new int[n];
		for(int i = 0; i < n; i++) {
			arr3[i] = arr1[i]|arr2[i];
		}
		
		for(int i = 0; i < n; i++) {
			String x = Integer.toBinaryString(arr3[i]);
			int len = x.length();
			for (int j = 0; j < n-len; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < len; j++) {
				char c = x.charAt(j);
				if(c == '1')
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
