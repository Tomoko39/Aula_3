public class RaizQuadrada {
    public static double sqrt(double n, double epsilon) {
        double x_anterior = 0;
        double x_atual = n/2;
        while (x_atual - x_anterior > epsilon || x_anterior - x_atual > epsilon) {
            x_anterior = x_atual;
            x_atual = 0.5*(x_atual + (n/x_atual));
        }
        double x_1 = x_atual/epsilon;
        int x_arredondado = (int)x_1;
        return x_arredondado*epsilon;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.println(sqrt(i, 0.01));
        }
        
    }
    
}