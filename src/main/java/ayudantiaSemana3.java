import java.util.Random;

class AyudantiaSemana3 {
    public static void main(String[] args) {
        int[][] matrizTemperatura = new int[7][24];
        matrizTemperatura = crearTemperaturaAleatoria(matrizTemperatura);
        int diaMasCaluroso = diaMasCaluroso(matrizTemperatura);
        int diaMasFrio = diaMasFrio(matrizTemperatura);

        System.out.println("El día más caluroso fue el día " + diaMasCaluroso);
        System.out.println("El día más frío fue el día " + diaMasFrio);
        int[] horaYDiaMasFrio = horaYDiaTemperaturaMasBaja(matrizTemperatura);
        int horaMasFria = horaYDiaMasFrio[0];

        System.out.println("La hora más fría fue a las " + horaMasFria + ":00 horas en el día " + diaMasFrio);
        int[] horaYDiaMasCaluroso = horaYDiaTemperaturaMasAlta(matrizTemperatura);
        int horaMasCalurosa = horaYDiaMasCaluroso[0];

        System.out.println("La hora más calurosa fue a las " + horaMasCalurosa + ":00 horas en el día " + diaMasCaluroso);
    }

    public static int[][] crearTemperaturaAleatoria(int[][] matrizTemperatura) {
        int temMax = 50;
        int temMin = -20;
        Random ran = new Random();

        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora <24; hora++) {
                matrizTemperatura[dia][hora] = ran.nextInt(temMax - temMin + 1) + temMin;
            }
        }

        return matrizTemperatura;
    }
    public static int diaMasCaluroso(int[][] matrixTemperatura){
        int elDiaMasCaluroso=0;
        int elGradoCelsiu=0;
        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora <24; hora++) {
                int diaYHora= matrixTemperatura[dia][hora];
                if (elGradoCelsiu<diaYHora){
                    elGradoCelsiu=matrixTemperatura[dia][hora];
                    elDiaMasCaluroso=dia+1;

                }

            }
        }

    return elDiaMasCaluroso;
    }
    public static int diaMasFrio(int[][] matrixTemperatura){
        int elDiaMasFrio=0;
        int elGradoCelsiu=50;
        for (int dia = 0; dia < 7; dia++) {
            for (int hora = 0; hora <24; hora++) {
                int diaYHora= matrixTemperatura[dia][hora];
                if (elGradoCelsiu>diaYHora){
                    elGradoCelsiu=matrixTemperatura[dia][hora];
                    elDiaMasFrio=dia+1;

                }

            }
        }

        return elDiaMasFrio;

    }
    public static int[] horaYDiaTemperaturaMasBaja(int[][] matrizTemperatura) {
        int diaMasFrio = 0;
        int horaMasFria = 0;
        int temperaturaMasBaja = matrizTemperatura[0][0]; // Inicializamos con el primer valor

        for (int dia = 0; dia < matrizTemperatura.length; dia++) {
            for (int hora = 0; hora < matrizTemperatura[dia].length; hora++) {
                int temperaturaActual = matrizTemperatura[dia][hora];
                if (temperaturaActual < temperaturaMasBaja) {
                    temperaturaMasBaja = temperaturaActual;
                    diaMasFrio = dia + 1;
                    horaMasFria = hora;
                }
            }
        }

        int[] horaYDiaMasFrio = {horaMasFria, diaMasFrio};
        return horaYDiaMasFrio;
    }
    public static int[] horaYDiaTemperaturaMasAlta(int[][] matrizTemperatura) {
        int diaMasCaluroso = 0;
        int horaMasCalurosa = 0;
        int temperaturaMasAlta = matrizTemperatura[0][0]; // Inicializamos con el primer valor

        for (int dia = 0; dia < matrizTemperatura.length; dia++) {
            for (int hora = 0; hora < matrizTemperatura[dia].length; hora++) {
                int temperaturaActual = matrizTemperatura[dia][hora];
                if (temperaturaActual > temperaturaMasAlta) {
                    temperaturaMasAlta = temperaturaActual;
                    diaMasCaluroso = dia + 1;
                    horaMasCalurosa = hora;
                }
            }
        }

        int[] horaYDiaMasCaluroso = {horaMasCalurosa, diaMasCaluroso};
        return horaYDiaMasCaluroso;

    }
}
