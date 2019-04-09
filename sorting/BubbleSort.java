package sorting;

/**
 * Using bubble sort to sort an integer array
 * 
 * @author ravi
 *
 */
public class BubbleSort {
	
	/**
	 * Repeatedly swap adjacent elements if they are in the wrong order
	 * 
	 * @param a The array to sort
	 */
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * Print the given array
	 * 
	 * @param a The array to print
	 */
	public static void printArray(int[] a) {
	  for(int i = 0; i < a.length; i++) {
		  System.out.print(a[i] + " ");
	  }
	  System.out.println();
	}
	
	
	/**
	 * Main driver
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	  int a[] = {10, 34, 98, 1, 22, 56, 4};
	  BubbleSort.bubbleSort(a);
	  BubbleSort.printArray(a);
	}

}
