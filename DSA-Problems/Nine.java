
public class Nine {
    public static void main(String[] args) {
        int[] nums = {}; 
        int[] arrayOfRunningSum = runningSum(nums);
        printArray(arrayOfRunningSum);
    }
    /**
     * Calculate the running sum of array elements.
     * The running sum of an array is defined as the sum of all elements
     * up to the current element.
     * 
     * @param nums the array to find its running sum
     * @return the array of running sum
    */

    public static int[] runningSum(int[] nums) {

        if(nums == null || nums.length == 0){
            System.out.println("The given array is EMPTY, can't perform operation!!!");
            return new int[0]; //Early return to avoid unneccesary computation
        }

        int[]result = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            result[i] = sum;
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
