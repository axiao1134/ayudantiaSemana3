import static org.junit.jupiter.api.Assertions.*;

class ayudantiasemana3Test {

    @org.junit.jupiter.api.Test
    void pruebaPalindromo() {
        assertTrue(ayudantiasemana3.palindromo("oso"));
        assertTrue(ayudantiasemana3.palindromo("reconocer"));
        assertTrue(ayudantiasemana3.palindromo("A man a plan a canal Panama"));

        assertFalse(ayudantiasemana3.palindromo("hola"));
        assertFalse(ayudantiasemana3.palindromo("programación"));
        assertFalse(ayudantiasemana3.palindromo("Esta no es un palíndromo"));
    }
}
