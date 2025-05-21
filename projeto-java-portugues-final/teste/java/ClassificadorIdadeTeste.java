import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para ClassificadorIdade.
 * Estes testes verificam se o método classificarIdade classifica corretamente as idades
 * em suas respectivas categorias (menor de idade, adulto, idoso).
 */
public class ClassificadorIdadeTeste {

    @Test
    public void testMenorIdade() {
        // Testa uma idade que deve ser classificada como menor de idade
        assertEquals("Menor de idade", ClassificadorIdade.classificarIdade(12), 
                     "Idade 12 deve ser classificada como 'Menor de idade'");
    }

    @Test
    public void testIdadeAdulto() {
        // Testa uma idade que deve ser classificada como adulto
        assertEquals("Adulto", ClassificadorIdade.classificarIdade(30), 
                     "Idade 30 deve ser classificada como 'Adulto'");
    }

    @Test
    public void testIdadeIdoso() {
        // Testa uma idade que deve ser classificada como idoso
        assertEquals("Idoso", ClassificadorIdade.classificarIdade(70), 
                     "Idade 70 deve ser classificada como 'Idoso'");
    }

    @Test
    public void testCasosLimite() {
        // Testa casos limite para cada categoria de idade
        assertEquals("Menor de idade", ClassificadorIdade.classificarIdade(0), 
                     "Idade 0 deve ser classificada como 'Menor de idade'");
        assertEquals("Menor de idade", ClassificadorIdade.classificarIdade(17), 
                     "Idade 17 deve ser classificada como 'Menor de idade'");
        assertEquals("Adulto", ClassificadorIdade.classificarIdade(18), 
                     "Idade 18 deve ser classificada como 'Adulto'");
        assertEquals("Adulto", ClassificadorIdade.classificarIdade(64), 
                     "Idade 64 deve ser classificada como 'Adulto'");
        assertEquals("Idoso", ClassificadorIdade.classificarIdade(65), 
                     "Idade 65 deve ser classificada como 'Idoso'");
    }
    
    @Test
    public void testIdadesExtremas() {
        // Testa valores de idade muito altos
        assertEquals("Idoso", ClassificadorIdade.classificarIdade(100), 
                     "Idade 100 deve ser classificada como 'Idoso'");
        assertEquals("Idoso", ClassificadorIdade.classificarIdade(Integer.MAX_VALUE), 
                     "Valor máximo de inteiro deve ser classificado como 'Idoso'");
    }
    
    @Test
    public void testIdadesNegativas() {
        // Testa valores de idade negativos (embora biologicamente impossíveis)
        // A implementação atual trata idades negativas como adultos (pode ser melhorado)
        assertEquals("Adulto", ClassificadorIdade.classificarIdade(-1), 
                     "A implementação atual trata idades negativas como adulto");
    }
}