class ayudantiasemana3 {
    public static void main(String[] args) {
        String textoOriginal="aaaaa aaaaa";
        System.out.println(palindromo(textoOriginal));

    }
    public static boolean palindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();
        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }

}
