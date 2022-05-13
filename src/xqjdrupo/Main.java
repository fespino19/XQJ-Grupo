package xqjdrupo;

import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.XQException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException, XMLStreamException {
        Scanner sc = new Scanner(System.in);
        GestorDB gestorDB = new GestorDB();

        gestorDB.getAyuntamientosTotal();
        System.out.println("***************************************");

        System.out.println("Escribe cuantos record hay del siguiente ayuntamiento: ");
        String author = sc.nextLine();
        gestorDB.getAyuntamientos(author);


        System.out.println("***************************************");
        System.out.println("Escribe la fecha  de los articulos creados: ");
        String fechacreate = sc.nextLine();
        gestorDB.getDataCreate(fechacreate);

        System.out.println("***************************************");


    }
}
