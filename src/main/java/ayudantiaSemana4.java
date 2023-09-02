public class ayudantiaSemana4 {
import java.util.Random;

    public class AyudantiaSemana3 {
        public static void main(String[] args) {
            int[][] matrizTemperatura = new int[7][24];
            matrizTemperatura = crearTemperaturaAleatoria(matrizTemperatura);

            // Puedes imprimir la matriz para verificar los valores generados
            for (int dia = 1; dia <= 7; dia++) {
                for (int hora = 1; hora <= 24; hora++) {
                    System.out.print(matrizTemperatura[dia][hora] + " ");
                }
                System.out.println(); // Salto de línea después de cada fila de horas
            }
        }

        public static int[][] crearTemperaturaAleatoria(int[][] matrizTemperatura) {
            int temMax = 50;
            int temMin = -20;
            Random ran = new Random();

            for (int dia = 1; dia <= 7; dia++) {
                for (int hora = 1; hora <= 24; hora++) {
                    matrizTemperatura[dia][hora] = ran.nextInt(temMax - temMin + 1) + temMin;
                }
            }

            return matrizTemperatura;
        }
    }

}
