import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ayudantiasemana3Test {

    @Test
    void pruebaCalcularPromedioConNotasCero() {
        double[] notas = {0.0, 0.0, 0.0, 0.0, 0.0};
        double resultadoEsperado = 0.0; // Todas las notas son cero, por lo que el promedio debe ser cero
        assertEquals(resultadoEsperado, ayudantiasemana3.calcularPromedio(notas), 0.0001);


    }
    @Test
    void pruebaCalcularPromedio() {
        double[] notas1 = {6.0, 5.5, 6.4, 6.2, 5.9};
        double resultadoEsperado1 = 6.0 * 0.25 + 5.5 * 0.25 + 6.4 * 0.25 + 6.2 * 0.15 + 5.9 * 0.10;
        assertEquals(resultadoEsperado1, ayudantiasemana3.calcularPromedio(notas1), 0.0001);
    }
}
