class ayudantiasemana3 {
    public static void main(String[] args) {
        double[] nota1={6.0,5.5,6.4,6.2,5.9};
        System.out.println(calcularPromedio(nota1));

    }
    public static double calcularPromedio(double [] notas) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * ponderacionNotas[i]);
        }
        return promedio;
    }


}
