import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ayudantiasemana3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void matrizTraspuestaTest() {
        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrizEsperada = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        int [][] resultado=ayudantiasemana3.matrizTraspuesta(matrizOriginal);

        assertArrayEquals(matrizEsperada,resultado);


    }
}