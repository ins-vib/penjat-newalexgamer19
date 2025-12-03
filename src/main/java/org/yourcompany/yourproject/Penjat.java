/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Alex
 */
public class Penjat {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        System.out.println("PARAULA:");


        
   
    
    int errors = 2;
    
    mostrarEstat(errors);
    }





// public static String obtenirParaula(); //– Retorna una paraula seleccionada aleatòriament.

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

// public static char[] inicialitzarEstat(String paraula); //– Crea l’estat inicial ple de '_'. El tamany d'aquest array depen de la llargada de la paraula buscada.

// public static boolean actualitzarEstat(char[] estat, String paraula, char lletra); //– Actualitza l’estat i indica si la lletra hi és.

//– Mostra les lletres descobertes i les ocultes,  char[] estat.
public static void mostrarEstat(int lletra){

        String[] PARAULES = {
            "hola","cadira","tisores","riu","fotografia","escala",
            "llibre","ordinador","ratoli","armari",
            "pati","programa","columna"
        };

        String palabra_sel = PARAULES[lletra];

        char[]palabras= palabra_sel.toCharArray();

        System.out.println("");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] = '-');
        }

    
}

// public static boolean paraulaCompletada(char[] estat); //– Comprova si ja no queden '_'.

// main();  //– Controla el funcionament general del joc.
}
