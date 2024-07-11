public class EscopoVariaveis {
    // escopo lexico: {}
    public static void main(String[] args) {
        int a = 10;

        if (a == 10) {
            int b = 20;

            System.out.printf("a = %d, b = %d\n", a, b);
        }
        // System.out.printf("a = %d, b = %d\n", a, b);
    }
}