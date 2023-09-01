import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ayudantiasemana3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void palabraVisibleSinNumero() {
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero("HolaMundo")); // Cadena sin números
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero("Texto sin números.")); // Cadena sin números y con signos de puntuación
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("12345")); // Cadena que contiene solo números
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("123 456")); // Cadena que contiene números y espacios
        assertTrue(ayudantiasemana3.palabraVisibleSinNumero("")); // Cadena vacía
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("   ")); // Cadena con espacios en blanco
        assertFalse(ayudantiasemana3.palabraVisibleSinNumero("Año 2023")); // Cadena que contiene números y letras
    }

}