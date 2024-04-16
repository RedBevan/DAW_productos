package Main;

import java.util.ArrayList;

public class Producto {
    private int codigo;
    private String descripcion;
    private double peso;

    public Producto() {
        int codigo;
        String descripcion;
        double peso;
    }

    public Producto(int codigo, String descripcion, double peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
    }

public int getCodigo() {
        return this.codigo;
}

public void setCodigo(int codigo) {
        this.codigo = codigo;
}

public String getDescripcion() {
        return this.descripcion;
}

public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
}

public double getPeso() {
        return this.peso;
}

public void setPeso(double peso) {
        this.peso = peso;
}

    public String toString() {
        return "Codigo: " + this.codigo + ", descripcion: '" + this.descripcion + "', peso: " + peso;
    }

}
