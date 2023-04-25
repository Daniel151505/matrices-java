public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15,2023, 14, 6},
                {544, 678, 22, 54}
        };

        int elementoBuscar = 1978;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        } else {
            System.out.println(elementoBuscar + " no se encontró en la matriz!");
        }

    }
}
