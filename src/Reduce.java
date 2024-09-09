public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int step_number = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                n -= 1;
            }
            else {
                n = n / 2;
            }
            step_number += 1;
        }
        System.out.println(step_number);
    }
}
