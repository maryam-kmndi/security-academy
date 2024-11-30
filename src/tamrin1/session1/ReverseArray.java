package tamrin1.session1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(list1));
		int[] list2 = reverse(list1);
		System.out.println(Arrays.toString(list2));
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];	//Creates a new array with the same length as list. The contents of result are independent of list.
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}
}

// new int[5] initializes an integer array with a length of 5. All elements are set to 0 by default.