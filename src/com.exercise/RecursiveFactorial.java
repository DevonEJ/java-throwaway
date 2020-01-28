
public class RecursiveFactorial {


    public int Calculate(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * Calculate(input - 1);
        }
    }


    public static void main(String[] agrs) {

        RecursiveFactorial recursiveFactorial = new RecursiveFactorial();

        System.out.println(recursiveFactorial.Calculate(5));

    }
}