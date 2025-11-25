package es.cursojava.utils;

import java.util.Scanner;

/**
 * Utilidades de consola usadas en los ejemplos del curso.
 *
 * Contiene métodos para mostrar menús y pedir datos por teclado (enteros,
 * decimales y cadenas). Los métodos que leen datos esperan y vuelven a pedir
 * la entrada hasta que el usuario introduce un valor válido.
 *
 * Mejoras realizadas: uso de un único {@code Scanner} estático para System.in,
 * lectura de líneas completas y parseo manual para evitar problemas con el
 * consumo de nueva línea, y reemplazo de recursión por bucles iterativos.
 *
 * @author CursoJava
 * @version 1.2
 */
public class Utilidades {

    // Scanner compartido para evitar crear múltiples instancias sobre System.in
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Calcula la edad a partir del año de nacimiento.
     *
     * Nota: el cálculo usa un año fijo (2025) porque así estaba en la
     * implementación original; si quieres que use el año actual se puede
     * actualizar para obtenerlo dinámicamente.
     *
     * @param anioNacimiento año de nacimiento (por ejemplo, 1990)
     * @return edad calculada como (2025 - anioNacimiento)
     */
    public static int calcularEdad (int anioNacimiento) {
        int edad = 0;

        edad = 2025 - anioNacimiento;

        return edad;
    }

    /**
     * Muestra por consola las opciones del menú y el texto por defecto
     * "Introduce una opción".
     *
     * Este método delega en {@link #pintaMenu(String[], String)}.
     *
     * @param opciones array de cadenas con las opciones a mostrar
     */
    public static void pintaMenu (String[] opciones) {
        pintaMenu(opciones,"Introduce una opción");
    }

    /**
     * Muestra por consola las opciones del menú y un texto final (por ejemplo
     * una indicación para el usuario).
     *
     * @param opciones array de cadenas con las opciones a mostrar
     * @param texto    texto que se muestra después de las opciones (por ejemplo
     *                 "Introduce una opción")
     */
    public static void pintaMenu (String[] opciones, String texto) {
        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        System.out.println(texto);
    }

    /**
     * Pide al usuario por consola un número entero y lo devuelve.
     *
     * Lectura robusta: se lee una línea completa y se intenta parsear con
     * {@link Integer#parseInt}; en caso de fallo se vuelve a pedir la entrada
     * hasta obtener un entero válido. Evita el uso de Scanner.nextInt() que
     * puede dejar caracteres pendientes en el buffer.
     *
     * @param texto texto que se muestra al pedir el dato (por ejemplo
     *              "Introduce tu edad")
     * @return el número entero introducido por el usuario
     */
    public static int pideDatoNumerico (String texto) {
        while (true) {
            System.out.println(texto);
            String linea = SCANNER.nextLine();
            if (linea == null) {
                System.out.println("Entrada nula, vuelva a intentarlo");
                continue;
            }
            linea = linea.trim();
            if (linea.isEmpty()) {
                System.out.println("No ha introducido ningún valor. Inténtelo de nuevo.");
                continue;
            }
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un número entero válido. Inténtalo otra vez.");
            }
        }
    }

    /**
     * Pide al usuario por consola un número decimal (double) y lo devuelve.
     *
     * Lectura robusta: se lee una línea completa y se intenta parsear con
     * {@link Double#parseDouble}; en caso de fallo se vuelve a pedir la entrada
     * hasta obtener un double válido.
     *
     * @param texto texto que se muestra al pedir el dato (por ejemplo
     *              "Introduce un precio")
     * @return el número decimal introducido por el usuario
     */
    public static double pideDatoDecimal (String texto) {
        while (true) {
            System.out.println(texto);
            String linea = SCANNER.nextLine();
            if (linea == null) {
                System.out.println("Entrada nula, vuelva a intentarlo");
                continue;
            }
            linea = linea.trim();
            if (linea.isEmpty()) {
                System.out.println("No ha introducido ningún valor. Inténtelo de nuevo.");
                continue;
            }
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un número decimal válido. Usa el punto como separador decimal y vuelve a intentarlo.");
            }
        }
    }

    /**
     * Pide al usuario por consola una cadena (línea completa) y la devuelve.
     *
     * @param texto texto que se muestra al pedir la cadena (por ejemplo
     *              "Introduce tu nombre")
     * @return la línea introducida por el usuario (puede estar vacía si el
     *         usuario pulsa sólo Enter)
     */
    public static String pideDatoCadena (String texto) {
        System.out.println(texto);
        String dato = SCANNER.nextLine();
        return dato == null ? "" : dato;
    }

    /**
     * Pide al usuario por consola una cadena no vacía. Si el usuario introduce
     * sólo espacios o una línea vacía se vuelve a pedir hasta obtener una
     * cadena con contenido.
     *
     * @param texto texto que se muestra al pedir la cadena (por ejemplo
     *              "Introduce tu nombre")
     * @return la línea no vacía introducida por el usuario
     */
    public static String pideDatoCadenaNoVacia (String texto) {
        while (true) {
            System.out.println(texto);
            String dato = SCANNER.nextLine();
            if (dato == null) {
                System.out.println("Entrada nula, vuelva a intentarlo");
                continue;
            }
            if (dato.trim().isEmpty()) {
                System.out.println("El valor no puede estar vacío. Inténtalo de nuevo.");
                continue;
            }
            return dato;
        }
    }

}