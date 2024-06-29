

public class Seven {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int[] result = concatenateArray(arr);

        if(result != null){
            printArray(result);
        }
    }

    /**
     * Concatenates the array with itself
     * @param arr arr the array to concatenate with itself
     * @return the concatenated array, or null if the input array is empty or null
    */
    public static int[] concatenateArray(int[] arr){

        if(arr == null || arr.length == 0){
            System.out.println("Array is EMPTY, can't perform the operation");
            return null; // Early return to avoid unneccesary computation
        }

        int n = arr.length;
        int[] result = new int[n*2];

        // Iterate through array to concate
        for(int i=0; i<n; i++){
            result[i] = arr[i];
            result[n + i] = arr[i];
        }
        return result;
    } 

    /**
     * Prints the array 
     * @param arr the array to print
    */
    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
