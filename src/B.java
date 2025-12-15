import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//use Java8 stream for manipulation
//
//input is list of string ["apple","banana","grapes"]
//
//reverse each string    ["elppa","ananab","separg"]
//
//and reverse entire list
//
//final output= ["separg","ananab","elppa"]
public class B {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","grapes");
        ArrayList<String> revstrings = new ArrayList<>(fruits);
        Collections.reverse(revstrings);
        System.out.println("reverse: "+revstrings);
    }
}
