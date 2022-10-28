/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionarreglos;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class IntroduccionArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo: ");
        for (int i=0;i<nElementos; i++){
            System.out.print((i+1)+". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("\nLos elementos del arreglo son: ");
        for (int i=0;i<nElementos;i++){ //Mientras que i sea menor que el numero de elementos 
            System.out.print(letras[i]+" "); //se imprime i
        }
        
        
    }
    
}
