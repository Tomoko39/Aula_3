public class NumeroPerfeito {
    public static boolean isPerfectNumber(long number) {
        int soma = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                soma = soma + i;
            }
        }
        if (soma == number){
            return true;
        }
        else {
            return false;
        }
}
public static void main(String[] args) {
    System.out.println(isPerfectNumber(1024));
}
}
