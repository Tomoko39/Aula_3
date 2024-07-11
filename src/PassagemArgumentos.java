public class PassagemArgumentos {
    /**
     * Duas tecnicas para passar argumentos:
     *  - passagem por valor (somente os tipos primitivos)
     *  - passagem por referencia (somente os tipos de referencia (objetos))
     */

     public static int f(int a, int b) {
        a++;
        b++;

        return a + b;
     }

     public static void incrementa(int[] v) {
        for(int i = 0; i < v.length; i++) {
            v[i]++;
        }
     }
     public static void testaPorValor() {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        f(a, b);
        System.out.printf("a = %d, b = %d\n", a, b);
     }

     public static void main(String[] args) {
        
     }
}