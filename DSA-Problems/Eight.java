public class Eight {
    // READY TO PUSH
    // 1470 Shuffle the Array
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,2,3,4};
        int n = 4;
        int[] result = shuffledArray(arr, n); 
        printArray(result);
    }

    /**
     * Shuffles the array in a specific order.
     * The first n elements are alternated with the last n elements.
     * @param nums the array to be shuffled
     * @param n the number of elements to interleave from the start and the end
     * @return the shuffled array or an empty array if input is invalid
     */
    public static int[] shuffledArray(int[] nums, int n){

        if (nums == null || nums.length == 0) {
            System.out.println("Input array cannot be null.");
            return new int[0]; // Early return to avoid unnecessary computation
        }
        if (nums.length != 2 * n) {
            System.out.println("Array length must be twice the value of n.");
            return new int[0];  // Early return to avoid unnecessary computation
        }

        int[] shuffledArray = new int[n*2];

        for (int i = 0; i < n; i++) {
            shuffledArray[2 * i] = nums[i];
            shuffledArray[2 * i + 1] = nums[n + i];
        }
        return shuffledArray;
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
        System.out.println("]");
    }
}