// naive approach 
import java.util.Arrays;
public class secondlargestelement {
   // function to find second largest element
   static int getsecondlargest(int[] arr){
    int n = arr.length;
    //sort
    Arrays.sort(arr);
    // start from second last
    for(int i = n-2; i>=0; i--){
        if(arr[i] != arr[n-1]){
            return arr[i];
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9};
        System.out.println(getsecondlargest(arr));
    }
}
