import java.util.Random;
import java.util.Scanner;

class AyudantiaSemana3 {
    public static void main(String[] args) {
        menu();
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
    public static double[] promedioTemperaturaDiaria(int[][] matrizTemperatura) {
        double[] promediosDiarios = new double[7];

        for (int dia = 0; dia < matrizTemperatura.length; dia++) {
            int sumaTemperaturasDiarias = 0;
            for (int hora = 0; hora < matrizTemperatura[dia].length; hora++) {
                sumaTemperaturasDiarias += matrizTemperatura[dia][hora];
            }
            promediosDiarios[dia] = (double) sumaTemperaturasDiarias / matrizTemperatura[dia].length;
        }

        return promediosDiarios;
    }
    public static double promedioTemperaturaSemana(int[][] matrizTemperatura) {
        int sumaTemperaturas = 0;
        int totalElementos = 0;

        for (int dia = 0; dia < matrizTemperatura.length; dia++) {
            for (int hora = 0; hora < matrizTemperatura[dia].length; hora++) {
                sumaTemperaturas += matrizTemperatura[dia][hora];
                totalElementos++;
            }
        }



        double promedioTemperatura = (double) sumaTemperaturas / totalElementos;
        return promedioTemperatura;
    }
    public static void menu(){
        int[][] matrizTemperatura = new int[7][24];
        matrizTemperatura = crearTemperaturaAleatoria(matrizTemperatura);
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        System.out.println("-----------------------------------------------------------");
        System.out.println("1-Mostrar día más caluroso");
        System.out.println("2-Mostrar día más frío.");
        System.out.println("3-Mostrar hora y día de la temperatura más baja");
        System.out.println("4-Mostrar hora y día de la temperatura más alta");
        System.out.println("5-Promedio de la temperatura en la semana");
        System.out.println("6-salir");
        System.out.println("-----------------------------------------------------------");
        System.out.println("ingrse una opcion:");
        int opcion = scan.nextInt();
        while (!salir) {
            System.out.println("1-Mostrar día más caluroso");
            System.out.println("2-Mostrar día más frío.");
            System.out.println("3-Mostrar hora y día de la temperatura más baja");
            System.out.println("4-Mostrar hora y día de la temperatura más alta");
            System.out.println("5-Promedio de la temperatura en la semana");
            System.out.println("6-Salir");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Ingrese una opción:");
            int opcion1 = scan.nextInt();

            switch (opcion1) {
                case 1:
                    int diaMasCaluroso = diaMasCaluroso(matrizTemperatura);
                    System.out.println("El día más caluroso fue el día " + diaMasCaluroso);
                    break;
                case 2:
                    int diaMasFrio = diaMasFrio(matrizTemperatura);
                    System.out.println("El día más frío fue el día " + diaMasFrio);
                    break;
                case 3:
                    int[] horaYDiaMasFrio = horaYDiaTemperaturaMasBaja(matrizTemperatura);
                    int horaMasFria = horaYDiaMasFrio[0];
                    int diaMasFrioCase3 = horaYDiaMasFrio[1];
                    System.out.println("La hora más fría fue a las " + horaMasFria + ":00 horas en el día " + diaMasFrioCase3);
                    break;
                case 4:
                    int[] horaYDiaMasCaluroso = horaYDiaTemperaturaMasAlta(matrizTemperatura);
                    int horaMasCalurosa = horaYDiaMasCaluroso[0];
                    int diaMasCalurosoCase4 = horaYDiaMasCaluroso[1];
                    System.out.println("La hora más calurosa fue a las " + horaMasCalurosa + ":00 horas en el día " + diaMasCalurosoCase4);
                    break;
                case 5:
                    double promedioSemana = promedioTemperaturaSemana(matrizTemperatura);
                    System.out.println("El promedio de temperatura en la semana es: " + promedioSemana + "°C");
                    break;
                case 6:
                    System.out.println("Adiós");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa una opción válida.");
                    break;
            }
        }

        scan.close();
    }
}
