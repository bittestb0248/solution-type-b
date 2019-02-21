package problem01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				list.add(arr[i] * arr[j]);
			}
		}

		for (int i = 0; i < list.size()-1; i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					result=list.get(j);
				}
			}
		}
		System.out.println(result);
	}
}
