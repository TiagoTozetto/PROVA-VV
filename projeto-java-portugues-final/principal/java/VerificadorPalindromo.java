/**
 * Classe para verificar se uma string é um palíndromo.
 * Um palíndromo é uma palavra ou frase que se lê igual de trás para frente,
 * ignorando espaços, maiúsculas/minúsculas e pontuação.
 */
public class VerificadorPalindromo {
    /**
     * Verifica se a string fornecida é um palíndromo.
     * A verificação ignora maiúsculas/minúsculas, espaços e caracteres especiais.
     * 
     * @param str a string a ser verificada
     * @return true se for um palíndromo, false caso contrário
     */
    public static boolean ehPalindromo(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // remove caracteres especiais e converte para minúsculas
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        
        return true;
    }
}