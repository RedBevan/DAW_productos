package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public void introducirProds() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Codigo?");
        int codigo = Integer.parseInt(inputScanner.nextLine());

        System.out.println("Descripcion?");
        String descripcion = inputScanner.nextLine();

        System.out.println("Peso?");
        Double peso = Double.parseDouble(inputScanner.nextLine());

        productos.add(new Producto(codigo, descripcion, peso));
        System.out.println("Nuevo producto agregado.");

    }

    public String visualizaProds() {
        String visualizacion = "Productos en el catalogo:";
        for (int i = 0; i < productos.size(); i++)
        {
            visualizacion = visualizacion + "\n" + String.valueOf(i+1) + ": " + productos.get(i);
        }
        return visualizacion;
    }

    public void guardaProds() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("productos.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String line = "";
        for (int i = 0; i < productos.size(); i++) {
            try {
                writer.write(line + "\n" + String.valueOf(i + 1) + ": " + productos.get(i));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fichero listo.");
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leeProds() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("productos.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                if (!(reader.readLine() != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                System.out.println(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        String listString = "Productos en el catalogo:";
        for (Object producto : productos) {
            listString += "\n"+ producto;
        }
        return listString;
        }

    public Catalogo() {
        productos = new ArrayList<>();
    }

//    public void anadirProducto() {
//
//        Scanner inputScanner = new Scanner(System.in);
//
//        Producto nuevoProducto = new Producto();
//
//        System.out.println("Codigo?");
//        int codigo = Integer.parseInt(inputScanner.nextLine());
//        nuevoProducto.setCodigo(codigo);
//
//        System.out.println("Descripcion?");
//        String descripcion = inputScanner.nextLine();
//        nuevoProducto.setDescripcion(descripcion);
//
//        System.out.println("Peso?");
//        double peso = Double.parseDouble(inputScanner.nextLine());
//        nuevoProducto.setPeso(peso);
//
//        System.out.println("Nuevo producto anadido");
//        this.productos.add(nuevoProducto);
//    }
}
