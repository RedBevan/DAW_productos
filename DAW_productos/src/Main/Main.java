package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Catalogo nuevoCatalogo = new Catalogo();

        while (true) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Tecla 'a' para aregar producto, \n'v' para visualizar catalogo, \n'g' para guardar el catalogo en un fichero, \n'l' para leer el fichero, \n's' para salir");
            String input = inputScanner.nextLine();

            if (input.equals("s")) {
                break;
            }

            if (input.equals("v")) {
                System.out.println(nuevoCatalogo.visualizaProds());
            }

            if (input.equals("a")) {
                nuevoCatalogo.introducirProds();
            }

            if (input.equals("g")) {
                nuevoCatalogo.guardaProds();
            }

            if (input.equals("l")) {
                nuevoCatalogo.leeProds();
            }
        }
    }

}