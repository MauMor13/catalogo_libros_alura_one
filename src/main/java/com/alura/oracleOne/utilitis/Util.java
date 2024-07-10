package com.alura.oracleOne.utilitis;
import java.util.Scanner;

public class Util {
    private static final Scanner scn = new Scanner(System.in);

    //impresion de menu reutilizable
    public static void mainMenu() {
        System.out.print("""
                ****************************************************************
                *             Ingresa la opción a realizar:                    *
                * 1_ Búsqueda de libro por título                              *
                * 2_ Lista de todos los libros                                 *
                * 3_ Exhibir cantidad de libros en un determinado idioma       *
                * 4_ Top 10 libros más descargados                             *
                * 5_ Generacion de estadísticas                                *
                * 6_ Salir                                                     *
                ****************************************************************
                """);
    }

    //validación de un string ingresado
    public static String validationString() {
        String entryString;
        boolean valControl = true;
        do {
            while (!scn.hasNext()) {
                System.out.println("! El valor ingresado es incorrecto vuelva a intentarlo ¡");
                scn.next();
            }
            entryString = scn.next();
            if (!entryString.isEmpty()) {
                valControl = false;
            }
        } while (valControl);
        return entryString;
    }

}
