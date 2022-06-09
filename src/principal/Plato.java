package principal;

import java.io.*;
import java.util.*;

public class Plato {
    String codigo, nombre;
    double precio;
    public static String CARTA= "Carta.txt";
    public Plato(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Plato> carta= new ArrayList();

    public void fichero() throws IOException {
        RandomAccessFile entrada = null;
        try {
            entrada= new RandomAccessFile(CARTA, "rw");
            for (int i = 0; i < carta.size(); i++) {
                entrada.writeByte(Integer.parseInt(carta.get(i).getCodigo() + "\n"));
                entrada.writeByte(Integer.parseInt(carta.get(i).getNombre()+ "\n"));
                entrada.writeByte(Integer.parseInt(carta.get(i).getPrecio()+ "\n"));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            entrada.close();
        }
    }

    @Override
    public String toString() {
        return "Plato{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}