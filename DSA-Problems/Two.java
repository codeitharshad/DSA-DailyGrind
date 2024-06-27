public class Two {

    public static void main(String args[]){

        int arr[] = {-3,-65,0};
        int n = largestInArray(arr);

        if (n==-1) {
            System.out.println("The given array is EMPTY!!!");
        }else{
            System.out.println("The largest element in given array is: "+n);
        }
    }

     /**
     * Finds the largest element in the given array.
     * 
     * @param arr the array of integers
     * @return the largest element in the array, or -1 if the array is null or empty
     */

    public static int largestInArray(int arr[]){
        if (arr == null || arr.length == 0) { // Return -1 if the array is null or empty
            return -1;
        }

        int largest = arr[0]; // Initialize largest with the first element of array

        for(int i=1;i<arr.length;i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        
        return largest; // Returns largest element in the given array if array is not empty
    }
}
