import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ayudantiasemana3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void juegoPuntajeTest() {
        int[] puntajes={12,13};
        String  resultadoEsperado="Jugador 2 ganó.";
        Assertions.assertEquals(ayudantiasemana3.juegoPuntaje(puntajes),resultadoEsperado);

    }
}