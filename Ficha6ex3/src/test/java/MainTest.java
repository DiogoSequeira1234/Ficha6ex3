import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest
{
    @Test
    public void testAreaCaso1() {
        Main ret = new Main();
        assertEquals(40, ret.area(5, 8), "A área deve ser 15");
    }

    @Test
    public void testPerimetroCaso1() {
        Main ret = new Main();
        assertEquals(26, ret.perimetro(5, 8), "O perímetro deve ser 16");
    }

    @Test
    public void testIsTriangle() {
        Main retangulo = new Main();

        // Teste 1: Triângulo possível (3, 4, 5) - Este é um triângulo válido
        int resultado1 = retangulo.isTriangle(3, 4, 5);
        assertEquals(1, resultado1);
    }
}
