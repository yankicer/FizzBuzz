public class Multiples {
    public static void main(String[] args) {
        int non_negative_multiples = 0;
        for (int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                non_negative_multiples += 1;
            }
        }
        System.out.println(non_negative_multiples);
    }
}
