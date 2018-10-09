/**
 * 
 */
package sorting;

import java.util.Arrays;


/**
 * @author ravi
 *
 */
public class MergeSort {

	/**
	 * Divide the input array into 2 halves, the pivot being 
	 * the midpoint of the array. Repeat recursively for all half 
	 * arrays until there are no more half arrays to divide.
	 * 
	 * @param a The array to be sorted
	 * @param n The size of the array
	 */
	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	/**
	 * 
	 * Compares the elements of both sub-arrays one by one and places 
	 * the smaller element into the input array.
	 * 
	 * @param a 	The array to be sorted
	 * @param l 	The left half of the array
	 * @param r 	The right half of the array
	 * @param left 	Size of the left half array
	 * @param right Size of the right half array
	 */
	public static void merge(
			int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] < r[j]) {
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] actual = { 3, 1, 4, 5, 7, 9, 1000, 8 };
	    int[] expected = { 1, 3, 4, 5, 7, 8, 9, 1000 };
	    MergeSort.mergeSort(actual, actual.length);
	    
	    System.out.println(Arrays.equals(actual, expected));
	    System.out.println(Arrays.toString(actual));
	}

}
