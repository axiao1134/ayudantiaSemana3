import static org.junit.jupiter.api.Assertions.*;

class ayudantiaSemana4Test {

    @org.junit.jupiter.api.Test
    void pruebaPalindromo() {
        assertTrue(ayudantiaSemana4.palindromo("oso"));
        assertTrue(ayudantiaSemana4.palindromo("reconocer"));
        assertTrue(ayudantiaSemana4.palindromo("A man a plan a canal Panama"));

        assertFalse(ayudantiaSemana4.palindromo("hola"));
        assertFalse(ayudantiaSemana4.palindromo("programación"));
        assertFalse(ayudantiaSemana4.palindromo("Esta no es un palíndromo"));
    }
}
