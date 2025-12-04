/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Penjat {
    Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
    

    main();
    }


public static void main() {
        String paraula = obtenirParaula();
        char[] estat = inicialitzarEstat(paraula);
        int errors = 0;
        String lletresUsades = "";
        int max_errors = 6;
        while (errors < max_errors && !paraulaCompletada(estat)) {
            mostrarNinot(errors);
            mostrarEstat(estat);
            System.out.println("Errors: " + errors + "/" + max_errors);
            System.out.println("Lletres usades: " + lletresUsades);
            
            char lletra = demanarLletra(lletresUsades);
            lletresUsades += lletra + " ";

            if (!actualitzarEstat(estat, paraula, lletra)) {
                errors++;
            }
        }

        mostrarNinot(errors);

        if (paraulaCompletada(estat)) {
            System.out.println("Felicitats! Has guanyat!");
            System.out.println("La paraula era: " + paraula);
        } else {
            System.out.println("Has perdut! La paraula era: " + paraula);
        }
    }


public static void mostrarEstat(int lletra) {

    String[] PARAULES = {
        "hola","cadira","tisores","riu","fotografia","escala",
        "llibre","ordinador","ratoli","armari",
        "pati","programa","columna"
    };

    String palabra_sel = PARAULES[lletra];  // Aquí usas el parámetro que te pasan
    char[] estat = inicialitzarEstat(palabra_sel);  // Creamos el estado inicial

    System.out.print("PARAULA: ");
    for (int i = 0; i < estat.length; i++) {
        System.out.print(estat[i] + " ");
    }
    System.out.println("");
}


// public static String obtenirParaula(); //– Retorna una paraula seleccionada aleatòriament.
public static String obtenirParaula() {
        String[] PARAULES = {
            "hola", "cadira", "tisores", "riu", "fotografia", "escala",
            "llibre", "ordinador", "ratoli", "armari",
            "pati", "programa", "columna", "java", "programacio"
        };
        Random rand = new Random();
        return PARAULES[rand.nextInt(PARAULES.length)].toLowerCase();
    }


//– Mostra el dibuix del penjat segons el nombre d’errors.
public static void mostrarNinot(int errors){
        String[] DIBUIXOS = {
        """
        +---+
            |
            |
            |
            ===
        """,
        """
        +---+
        O   |
            |
            |
            ===
        """,
        """
        +---+
        O   |
        |   |
            |
            ===
        """,
        """
        +---+
        O   |
        /|   |
            |
            ===
        """,
        """
        +---+
        O   |
        /|\\  |
            |
            ===
        """,
        """
        +---+
        O   |
        /|\\  |
        /    |
            ===
        """,
        """
        +---+
        O   |
        /|\\  |
        / \\  |
            ===
        """
    }; 
    System.out.println(DIBUIXOS[errors]);

} 

// public static char demanarLletra(); //– Demana una lletra vàlida a l’usuari. Demana la lletra de forma repetida fins que la lletra sigui correcta.
public static char demanarLletra(String usades) {
    Scanner teclat = new Scanner(System.in);
        while (true) {
            System.out.print("Introdueix una lletra: ");
            String input = teclat.next().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Error: has d'introduir exactament una lletra."); 
            }

            char lletra = input.charAt(0);

            if (lletra < 'a' || lletra > 'z') {
                System.out.println("Error: només lletres de la a la z.");
    
            }

            if (usades.contains(String.valueOf(lletra))) {
                System.out.println("Ja has provat aquesta lletra!");
            }

            return lletra;
        }
    }


// public static char[] inicialitzarEstat(String paraula); //– Crea l’estat inicial ple de '_'. El tamany d'aquest array depen de la llargada de la paraula buscada.
public static char[] inicialitzarEstat(String paraula) {
        char[] estat = new char[paraula.length()];
        for (int i = 0; i < estat.length; i++) {
            estat[i] = '_';
        }
        return estat;
    }



// public static boolean actualitzarEstat(char[] estat, String paraula, char lletra); //– Actualitza l’estat i indica si la lletra hi és.
public static boolean actualitzarEstat(char[] estat, String paraula, char lletra) {
        boolean encert = false;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) {
                estat[i] = lletra;
                encert = true;
            }
        }
        return encert;
    }


//– Mostra les lletres descobertes i les ocultes,  char[] estat.
    public static void mostrarEstat(char[] estat) {
        System.out.print("PARAULA: ");
        for (char c : estat) {
            System.out.print(c + " ");
        }
        System.out.println();
    }




//– Comprova si ja no queden '_'.
public static boolean paraulaCompletada(char[] estat) {
        for (char c : estat) {
            if (c == '_') return false;
        }
        return true;
    }


}
