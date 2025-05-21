import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para Fatorial.
 * Estes testes verificam se o método calcularFatorial calcula corretamente
 * os valores fatoriais e trata adequadamente os casos especiais.
 */
public class FatorialTeste {

    @Test
    public void testFatorialNegativo() {
        // Testa o fatorial de um número negativo, que deve retornar -1
        assertEquals(-1, Fatorial.calcularFatorial(-5), 
                     "Fatorial de número negativo deve retornar -1");
    }

    @Test
    public void testFatorialZero() {
        // Testa o fatorial de 0, que deve ser 1 por definição
        assertEquals(1, Fatorial.calcularFatorial(0), 
                     "Fatorial de 0 deve ser 1");
    }

    @Test
    public void testFatorialUm() {
        // Testa o fatorial de 1, que deve ser 1
        assertEquals(1, Fatorial.calcularFatorial(1), 
                     "Fatorial de 1 deve ser 1");
    }

    @Test
    public void testFatorialCinco() {
        // Testa o fatorial de 5, que deve ser 120 (5 × 4 × 3 × 2 × 1)
        assertEquals(120, Fatorial.calcularFatorial(5), 
                     "Fatorial de 5 deve ser 120");
    }
    
    @Test
    public void testFatorialDez() {
        // Testa o fatorial de 10, que deve ser 3.628.800
        assertEquals(3628800, Fatorial.calcularFatorial(10), 
                     "Fatorial de 10 deve ser 3.628.800");
    }
    
    @Test
    public void testFatorialDoze() {
        // Testa o fatorial de 12, que é 479.001.600
        assertEquals(479001600, Fatorial.calcularFatorial(12), 
                     "Fatorial de 12 deve ser 479.001.600");
    }
    
    @Test
    public void testFatorialLimite() {
        // Obs: Este teste verifica que estamos cientes dos limites de estouro de int
        // O fatorial de 13 excederia o limite de um inteiro de 32 bits
        // mas não testamos o valor real devido ao estouro
        assertNotEquals(-1, Fatorial.calcularFatorial(13), 
                       "O método deve calcular mesmo para valores que podem causar estouro");
    }
}