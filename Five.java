public class Five{
    public static void main(String[] args){
        int[] arr = {6,7,8,9};

        findPairsInArray(arr);

    } 

    /**
     * Finds and prints all possible pairs in given array 
     * @param arr the array from which to find all pairs
    */
    public static void findPairsInArray(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("The array is EMPTY!!!");
            return; //Early return to avoid the unnecessary computaion
        }

        if (arr.length == 1) {
            System.out.println("It's not possible to get pair with only one array element!!!");
            return;//Early return to avoid the unnecessary computaion
        }

        
        int totalPairs = 0; // Initialization of totalPairs to get the number of possible pairs
        StringBuilder result = new StringBuilder();

        // Iterating through array to get possible pairs
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                result.append("(").append(arr[i]).append(",").append(arr[j]).append(")");
                totalPairs++; // Incrementing with each pair
            }
            result.append("\n");
        }
        System.out.print(result.toString());
        System.out.println("The total pairs can be formed in the given array is: "+totalPairs);
    }
}