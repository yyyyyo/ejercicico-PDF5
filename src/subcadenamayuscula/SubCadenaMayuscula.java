/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subcadenamayuscula;

import java.util.Scanner;

/**
 *
 * @author yojar
 */
public class SubCadenaMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
		String cadena, subcadena, subcadenaUpper;
		int posicion;
		System.out.println("Introduzca la cadena en la que buscar");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		subcadena = scan.nextLine();
               System.out.println(" la subcadena  buscada es");
               
		subcadenaUpper = subcadena.toUpperCase();
		cadena = cadena.replace(subcadena, subcadenaUpper);
		System.out.println(cadena);
	}
}

    
 