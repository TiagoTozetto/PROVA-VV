/**
 * Classe para calcular o fatorial de um número.
 */
public class Fatorial {
    /**
     * Calcula o fatorial de um número.
     * O fatorial de um número inteiro não-negativo n é o produto de todos os inteiros positivos menores ou iguais a n.
     * Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120.
     * 
     * @param n o número para calcular o fatorial
     * @return o valor do fatorial, ou -1 se n for negativo
     */
    public static int calcularFatorial(int n) {
        int resultado = 1;
        
        if (n < 0) {
            return -1;
        }
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}