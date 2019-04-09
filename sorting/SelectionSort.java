/**
 * 
 */
package sorting;


/**
 * @author ravi
 *
 * The selection sort algorithm sorts an array by repeatedly finding the 
 * minimum element from unsorted part and putting it at the beginning
 */
public class SelectionSort {

	/**
	 * Find the minimum element from the unsorted subarray and put it
	 * at the beginning of the sorted subarray
	 *
	 * @param a The array to be sorted
	 */
	public static void selectionSort(int[] a) {
		int n = a.length;
		

		for(int i = 0; i < n-1; i++){
			int min = i;
			//Find the min element of the unsorted array
			for(int j = i+1; j < n; j++){
				if(a[j] < a[i]){
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}


	/**
	 * Print an array
	 *
	 * @param a The array to be printed
	 */
	public static void printArray(int[] a){
		for(int i = 0; i < a.length; i++){
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
		int[] actual = { 3, 1, 4, 5, 7, 9, 1000, 8 };
		SelectionSort.selectionSort(actual);  
		SelectionSort.printArray(actual);
	}

}
