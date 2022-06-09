package principal;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Plato plato1= new Plato("11111", "Lasaña", 15.50);
        Plato plato2=new Plato("22222", "Pizza", 9.99);
        Plato plato3=new Plato("33333", "Espaguetis", 14.25);
        Plato plato4=new Plato("44444", "Sopa", 4.99);
        System.out.println("¿Qué platos desea(n) pedir?");
        String nombre = s.next();
        System.out.println("¿Cuántos platos desea(n)?");
        int cant = s.nextInt();
    }
}