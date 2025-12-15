import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Create a method which will take two parameters, an array and a integer k. method will rotate the array k times
//Example Input: array [1,2,3,4,5,6], K = 2
//first rotation = [2,3,4,5,6,1]
//second rotation = [3,4,5,6,1,2]
//Output [3,4,5,6,1,2]



public class LambdaExample {
    public static void rotate(int [] arr,int k) {
        int n = arr.length;
        k = k%n;

        for(int i=0;i<k;i++){
            rotateOnce(arr);
            System.out.println("Rotation : "+(i+1)+ " "+Arrays.toString(arr));
        }
    }
   public static void rotateOnce(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        for(int i = 0;i<n-1;i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = temp;
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6};
        int k= 2;

        System.out.println("Array: "+Arrays.toString(arr));
        rotate(arr,k);
   }
}
