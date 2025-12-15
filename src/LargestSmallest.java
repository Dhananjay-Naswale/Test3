import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr  = {12, 45, 2, 67, 34, 89, 1};

        int second = Arrays.stream(arr)
                .boxed() //Intstream -> stream<Integer>
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst().
                get();
        System.out.println("Second Largest :"+second);

    }
}
