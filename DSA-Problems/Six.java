public class Six {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        findSubArraysInArray(arr);
    }

    /**
     * Finds and prints all possible sub-arrays in the given array
     * @param arr the array to prints it's all possible sub-arrays
     */
    public static void findSubArraysInArray(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is empty!!!");
            return;//Early return to avoid the unnecessary computation
        }

        if (arr.length == 1) {
            System.out.println("Not possible to find sub-arrays of array with only one element!!");
            return; //Early return to avoid the unnecessary computation
        }

        // iterate over the array to get
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("[ ");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");  
                System.out.println();
            }
        }
    }
}
