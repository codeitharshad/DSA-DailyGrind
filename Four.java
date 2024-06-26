public class Four {
    public static void main(String[] args){
        int[] arr = {23,54,2,4,6,7};

        reverseArray(arr);
        printArray(arr);
    }
    
    /**
     * Reverse the given array
     * @param arr is the array to get reversed.
     */
    public static void reverseArray(int[] arr){

        // Checking array is empty or null and handle appropriately
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is EMPTY!!");
            return; // Early return to avoid unnecesasry computation
        }

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            //swap the elements at left and right indices
            int temp = arr[left]; 
            arr[left] = arr[right];
            arr[right] = temp;

            //Moves the pointers towards centre
            left++; //updating left to next index
            right--; //updating right to previous index
        }
    }

    /**
     * Prints the elements of array
     * @param arr the array to be printed
    */

    public static void printArray(int[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); // For a new line after the array is printed
    }
}

