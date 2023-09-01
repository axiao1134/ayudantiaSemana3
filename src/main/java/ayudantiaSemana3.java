class ayudantiasemana3 {
    public static void main(String[] args) {
    }


    public static boolean palabraVisibleSinNumero(String palabraIngresada) {
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i)) ||
                    palabraIngresada.isBlank()) {
                return false;
            }
        }
        return true;
    }
}