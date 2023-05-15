import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmiIndex = service.calculate(1.87, 98);
        System.out.println((int) bmiIndex);
    }
}
