class ayudantiasemana3 {
    public static void main(String[] args) {

    }
    private static String metodo3(int [] puntajes) {
        int jugador1 = 20 - puntajes[0];
        int jugador2 = 20 - puntajes[1];
        if((jugador1 < 0 && jugador2 < 0) || jugador1 == jugador2) {
            return "Empate.";
        } else if((jugador1 < 0 || jugador2 < jugador1) && jugador2 >= 0) {
            return "Jugador 2 ganó.";
        } else {
            return "Jugador 1 ganó.";
        }
    }

}