/**
 * Implementing linear, non-recursive and recursive binary search
 * 
 * @author ravi
 *
 */
public class Search {

    /**
     * Linear search
     * 
     * @param array     The array to be searched
     * @param key       The element to be searched for
     * @param start     The starting index of the array
     * @param end       The ending index of the array
     * @return          The index if the element is found, else -1
     */
    public static int linearSearch(int[] array, int key, int start, int end){
        for (int i = start ; i <= end; i++){
            if (array[i] == key){ 
                return i;
            }
        }
        return -1;
    }

    /**
     * Non-recursive binary search
     * 
     * @param sortedArray   The sorted array to be searched
     * @param key           The element to be searched for
     * @param left          The starting index for binary search
     * @param right         The ending index for binary search
     * @return              The index if the element is found, else -1
     */
    public static int binarySearch(int[] sortedArray, int key, int left, int right){
        while (left <= right){
            int middle = (left + right )/2 ;
            if (sortedArray[middle] < key){
                left = middle + 1;
            }
            else if (sortedArray[middle] > key){
                right = middle - 1;
            }
            else{ 
                //sortedArray[middle] == key
                return middle;
            }
        }
        return -1;

    }
    
    /**
     * Recursive binary search
     * 
     * @param sortedArray   The sorted array to be searched
     * @param key           The element to be searched for
     * @param left          The starting index for binary search
     * @param right         The ending index for binary search
     * @return              The index if the element is found, else -1
     */
    public static int recursiveBinarySearch(int[] sortedArray, int key, int left, int right){
        while (left <= right){
            int middle = (left + right )/2 ;
            
            if (sortedArray[middle] == key){
                return middle;
            }
            else if (sortedArray[middle] < key){
                left = middle + 1;
                recursiveBinarySearch(sortedArray, key, left, right);                
            }
            else{
                //sortedArray[middle] > key
                right = middle - 1;
                recursiveBinarySearch(sortedArray, key, left, right);                
            }           
        }
        return -1;
    }
    
    /**
     * Print the results
     * 
     * @param result        The index of the element being searched for, else -1
     * @param searchKey     The element being searched for
     */
    public static void printResult(int result, int searchKey){
        if(result == -1){
            System.out.println("The key: " + searchKey + " cannot be found.");
        }
        else{
            System.out.println("The key: " + searchKey + " can be found at index: " + result);
        }
    }

    /**
     * 
     * @param args      None
     */
    public static void main(String[] args){
        int[] sortedSearchArray = {1,2,3,4,5,8,9,159,200,999};   
        
        int searchKey = 1;
        int result = linearSearch(sortedSearchArray, searchKey, 0, sortedSearchArray.length-1);
        printResult(result, searchKey);
        
        searchKey = 0;
        result = binarySearch(sortedSearchArray, searchKey, 0, sortedSearchArray.length-1);
        printResult(result, searchKey);
        
        searchKey = 999;
        result = recursiveBinarySearch(sortedSearchArray, searchKey, 0, sortedSearchArray.length-1);
        printResult(result, searchKey);
        
        searchKey = 1000;
        result = binarySearch(sortedSearchArray, searchKey, 0, sortedSearchArray.length-1);
        printResult(result, searchKey);
        
        searchKey = 200;
        result = recursiveBinarySearch(sortedSearchArray, searchKey, 0, sortedSearchArray.length-1);
        printResult(result, searchKey);
    }

}