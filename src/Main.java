import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Arra//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //List<Integer> list = new ArrayList<>(1,2,3,2,4,4,5);
        List<Integer> list = Arrays.asList(1,2,3,2,4,4,5);
        ArrayList<Integer> uniquelist = new ArrayList<>();
        for(Integer num: list){
            if(!uniquelist.contains(num)){
                uniquelist.add(num);
            }
        }
        System.out.println("List without dupliicates:"+uniquelist);
    }
}