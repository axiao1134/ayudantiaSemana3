import java.util.Random;

class AyudantiaSemana3 {
    public static void main(String[] args) {
        int[][] matrizTemperatura = new int[7][24];
        matrizTemperatura = crearTemperaturaAleatoria(matrizTemperatura);

        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                System.out.print(matrizTemperatura[dia][hora] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] crearTemperaturaAleatoria(int[][] matrizTemperatura) {
        int temMax = 50;
        int temMin = -20;
        Random ran = new Random();

        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                matrizTemperatura[dia][hora] = ran.nextInt(temMax - temMin + 1) + temMin;
            }
        }

        return matrizTemperatura;
    }
}
