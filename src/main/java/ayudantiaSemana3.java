class ayudantiasemana3 {
    public static void main(String[] args) {
    }


    public static int[][] matrizTraspuesta(int[][] matrizOriginal) {
        int[][] t = new int[matrizOriginal[0].length][matrizOriginal.length];
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                t[j][i] = matrizOriginal[i][j];
            }
        }
        return t;
    }

}