public class One {
    
    public static void main(String args[]){
        int arr[] = {};
        int key = 4;

        int n = linearSearch(arr, key);
        if (n == -1) {
            System.out.println("The array is EMPTY or Key is NOT FOUND in given array");
        }else {
            System.out.println("Key is FOUND at index: " + n);      
        }
        
    }

    /**
     * Performs a linear search on the given array for the specified key.
     *
     * @param arr the array to search
     * @param key the value to search for
     * @return the index of the key if found, otherwise -1
     */

    public static int linearSearch(int arr[], int key){

        if(arr == null || arr.length == 0){
            return -1; // Returns -1 if array is empty or null
        }

        for(int i = 0; i < arr.length; i++){
            if(key == arr[i]){
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
}
