import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ayudantiasemana3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void palabraVisibleSinNumero() {
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero("HolaMundo"));
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero("Texto sin números."));
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("12345"));
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("123 456"));
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero(""));
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("   "));
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("Año 2023"));
    }

}