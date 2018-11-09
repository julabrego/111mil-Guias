package Examen1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploMain {
    public static void main (String [] args){
        Notebook notebook1 = new Notebook("Lenvo", "Lala 10", "I7", 340.5f);
        Notebook notebook2 = new Notebook("HP", "Pavo", "Pentium 8", 200f);
        Notebook notebook3 = new Notebook("Acer", "Pingo 29", "486", 1000f);
        Notebook notebook4 = new Notebook("Apple", "Chorro", "I2000", 358f);
        Notebook notebook5 = new Notebook("Commodore", "64", "FX3238", 10.8f);
        
        Cliente cliente1 = new Cliente("María", 12121212);
        Cliente cliente2 = new Cliente("Juan", 30321123);
        Cliente cliente3 = new Cliente("Peppa", 16546879);
        Cliente cliente4 = new Cliente("Papá Cerdito", 12354896);
        Cliente cliente5 = new Cliente("Cacho", 14879621);
        
        String fechaCreacion1 = "2018-11-10";
        String fechaCreacion2 = "2017-01-08";
        String fechaCreacion3 = "2015-08-10";
        String fechaCreacion4 = "2018-10-10";
        
        /* ###
        Date fechaCreacion1 = new Date("2018-11-10"); // ¿Como hacer que no sea deprecated?
        Date fechaCreacion2 = new Date("2017-10-21");
        Date fechaCreacion3 = new Date("2015-08-01");
        Date fechaCreacion4 = new Date("2012-07-05");*/

        DetalleOrden detalleOrden1 = new DetalleOrden(notebook1, 2000, 1);
        DetalleOrden detalleOrden2 = new DetalleOrden(notebook2, 5000, 3);
        DetalleOrden detalleOrden3 = new DetalleOrden(notebook4, 4000, 1);
        DetalleOrden detalleOrden4 = new DetalleOrden(notebook5, 1000, 8);
        DetalleOrden detalleOrden5 = new DetalleOrden(notebook3, 7000, 2);
        
        Orden orden1 = new Orden(0, fechaCreacion1);
        Orden orden2 = new Orden(1, fechaCreacion2);
        Orden orden3 = new Orden(2, fechaCreacion3);
        Orden orden4 = new Orden(3, fechaCreacion4);
        
         // Órdenes hechas por clientes
        
        orden1.agregarItem(detalleOrden1);
        orden2.agregarItem(detalleOrden2);
        orden3.agregarItem(detalleOrden3);
        orden4.agregarItem(detalleOrden4);
        orden4.agregarItem(detalleOrden5);
       
        cliente1.addOrden(orden1);
        cliente2.addOrden(orden2);
        cliente3.addOrden(orden2);
        cliente3.addOrden(orden3);
        cliente4.addOrden(orden4);
        cliente4.addOrden(orden2);
        cliente5.addOrden(orden4);
        
        System.out.println("Total de la orden realizada por cada orden: ");
        System.out.println(orden1.CalcularTotalOrden());
        System.out.println(orden2.CalcularTotalOrden());
        System.out.println(orden3.CalcularTotalOrden());
        System.out.println(orden4.CalcularTotalOrden());
        
    }
}
