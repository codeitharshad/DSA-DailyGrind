public class Three{
    public static void main (String args[]){
        int arr[] = {1,3,10,45};
        int key = 10;

        int n = binarySearch(arr, key);
        if (n == -1) {
            System.out.println("The array is EMPTY or key NOT FOUND");
        }else{
            System.out.println("The key present at index: "+ n);
        }
    }

    /**
     * Performs a binary search on a sorted array to find the index of given key
     * 
     * @param arr is a sorted array in which to search for the key
     * @param key is a value to search for
     * @returns the index value of key if found, otherwise -1
    */

    public static int binarySearch(int arr[], int key){
        // check for null or empty array
        if (arr == null || arr.length == 0) {
            // returns -1 if array is null or empty
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            // calculate mid to avoid integer overflow
            int mid = start + (end - start) / 2;

            if (key == arr[mid]) {
                return mid;
            }else if (key < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        // return -1 if the key is not found
        return -1;
    }
}