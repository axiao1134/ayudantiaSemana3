import java.util.Random;

class AyudantiaSemana3 {
    public static void main(String[] args) {
        int[][] matrizTemperatura = new int[7][24];
        matrizTemperatura = crearTemperaturaAleatoria(matrizTemperatura);
        int diaMasCaluroso = diaMasCaluroso(matrizTemperatura);
        int diaMasFrio = diaMasFrio(matrizTemperatura);

        System.out.println("El día más caluroso fue el día " + diaMasCaluroso);
        System.out.println("El día más frío fue el día " + diaMasFrio);

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
}
