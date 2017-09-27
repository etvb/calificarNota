/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
Suficiente, Bien, Notable, Sobresaliente
*/
package pats.pkg25.pkg12.calificanota;

import javax.swing.JOptionPane;

public class PATS2512CalificaNota {

    public static void main(String[] args) {
        
        short nota;
        
        nota = Short.parseShort(JOptionPane.showInputDialog("ingresa la Calificacion"));
        
        switch(nota){
            case 10:
                JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "NOTABLE");
                break;
            case 8: case 7:
                JOptionPane.showMessageDialog(null, "BIEN");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "SUFICIENTE");
                break;
            case 5: case 4: case 3: case 2: case 1:
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO es un numero entre 1 y 10");
                break; //este break pude o no puede ir.
        }
        
    }
    
}
