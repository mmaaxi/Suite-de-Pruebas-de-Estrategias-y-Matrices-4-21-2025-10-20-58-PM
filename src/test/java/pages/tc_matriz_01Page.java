package pages;

import org.openqa.selenium.WebDriver;

public class tc_matriz_01Page {
    WebDriver driver;
    int[][] matriz;

    public tc_matriz_01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void generarMatriz() {
        // Imaginemos que aquí generamos una matriz de manera correcta
        matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    public boolean validarMatrizGenerada() {
        return matriz != null;
    }

    public boolean validarContenidoDeMatriz() {
        // Validemos que la matriz contiene los elementos que esperamos
        int[][] matrizEsperada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matrizEsperada[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}