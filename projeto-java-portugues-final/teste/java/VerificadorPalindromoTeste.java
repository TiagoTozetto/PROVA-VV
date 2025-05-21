import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para VerificadorPalindromo.
 * Estes testes verificam se o método ehPalindromo identifica corretamente palíndromos,
 * tratando adequadamente espaços, letras maiúsculas/minúsculas e pontuação.
 */
public class VerificadorPalindromoTeste {

    @Test
    public void testPalindromoSimples() {
        // Testa um palíndromo simples sem espaços ou letras maiúsculas
        assertTrue(VerificadorPalindromo.ehPalindromo("arara"), "Palíndromo simples deve retornar true");
    }

    @Test
    public void testPalindromoComEspacosEMaiusculas() {
        // Testa um palíndromo com espaços e letras maiúsculas
        assertTrue(VerificadorPalindromo.ehPalindromo("Ame a ema"), "Palíndromo com espaços e maiúsculas deve retornar true");
    }

    @Test
    public void testNaoPalindromo() {
        // Testa uma string que não é palíndromo
        assertFalse(VerificadorPalindromo.ehPalindromo("verificacao"), "Não-palíndromo deve retornar false");
    }

    @Test
    public void testPalindromoComPontuacao() {
        // Testa um palíndromo com pontuação, espaços e caracteres acentuados
        assertTrue(VerificadorPalindromo.ehPalindromo("Socorram-me, subi no ônibus em Marrocos"), 
                   "Palíndromo com pontuação e caracteres especiais deve retornar true");
    }
    
    @Test
    public void testStringVazia() {
        // Testa string vazia, que tecnicamente é um palíndromo
        assertTrue(VerificadorPalindromo.ehPalindromo(""), "String vazia deve ser considerada um palíndromo");
    }
    
    @Test
    public void testCaractereUnico() {
        // Testa caractere único, que sempre é um palíndromo
        assertTrue(VerificadorPalindromo.ehPalindromo("a"), "Caractere único sempre deve ser um palíndromo");
    }
    
    @Test
    public void testPalindromoNumerico() {
        // Testa palíndromo com números
        assertTrue(VerificadorPalindromo.ehPalindromo("12321"), "Palíndromo numérico deve retornar true");
    }
    
    @Test
    public void testPalindromoAlfanumerico() {
        // Testa palíndromo com letras e números
        assertTrue(VerificadorPalindromo.ehPalindromo("a1b2b1a"), "Palíndromo alfanumérico deve retornar true");
    }
}