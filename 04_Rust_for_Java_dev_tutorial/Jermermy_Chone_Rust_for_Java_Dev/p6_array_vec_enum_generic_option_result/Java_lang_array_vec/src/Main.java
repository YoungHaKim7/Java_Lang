import java.util.ArrayList;

class Foo {
}

public class Main {
	public static void main(String[] args) {
		// 1) Array
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println("item : " + arr1[3]);

		int[] arr2 = new int[10];
		System.out.println("item : " + arr2);
		System.out.println("item : " + arr2[3]);
		System.out.println("item : " + arr2[2]); // This is correct.
		for (int item : arr2) {
			System.out.println(item);
		}

		// item : null
		Foo[] arr3 = new Foo[10];
		System.out.println("item : " + arr3[3]);

		// 2) Tuple (n/a)
		// Not in Lang (org.javatuple, Pair, Triplet, ...)

		// 3) Vec (ArrayList)
		ArrayList arr_vec1 = new ArrayList<Integer>();
		arr_vec1.add(123);
		System.out.println("arr_vec1 : " + arr_vec1.get(0));

		arr_vec1.add(new Foo());
		System.out.println("arr_vec1 : " + arr_vec1.get(0));

		// out of bound Exception in thread "main" java.lang.IndexOutOfBoundsException:
		// Index: 3, Size: 2
		// System.out.println("arr_vec1 : " + arr_vec1.get(3));

	}
}
