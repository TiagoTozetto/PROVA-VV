/**
 * Classe para classificar idades em diferentes categorias.
 */
public class ClassificadorIdade {
    /**
     * Classifica a idade fornecida em uma das três categorias:
     * - "Menor de idade" para idades de 0 a 17 anos
     * - "Adulto" para idades de 18 a 64 anos
     * - "Idoso" para idades a partir de 65 anos
     * 
     * @param idade a idade a ser classificada
     * @return uma string com a classificação da idade
     */
    public static String classificarIdade(int idade) {
        if (idade >= 0 && idade <= 17) {
            return "Menor de idade";
        } else if (idade <= 64) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}