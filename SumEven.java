 public class SumEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * 2;
        }
        System.out.println("The sum of 100 even numbers is: " + sum);
    }
}