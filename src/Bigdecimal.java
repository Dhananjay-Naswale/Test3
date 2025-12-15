import java.math.BigDecimal;

public class Bigdecimal {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(10.3);
        BigDecimal num2 = new BigDecimal(20.5);
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum);
    }
}
