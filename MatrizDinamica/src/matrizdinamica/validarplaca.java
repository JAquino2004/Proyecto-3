/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizdinamica;
import javax.swing.JOptionPane;
/**
 *
 * @author Joshua
 */
//esta clase valida si el la placa dada es correcta
public class validarplaca {
  public boolean validacion(String a){
       if(a.length() == 7){
            char caracter;
            int contador = 0;

            for(int i =0; i < 7; i++){

                caracter = a.charAt(i);
                if(i == 0){
                    //para el primer digito
                    if(caracter != 'P' && caracter != 'M' && caracter != 'O' && caracter != 'A' && caracter != 'U' && caracter != 'C') contador = 1;
                }
                if(i > 0 && i < 4){
                    if(Character.isDigit(caracter) == false) contador = 1;
                }//para las letras
                if(i > 4){
                    if(Character.isLetter(caracter) == false || (caracter == 'A' || caracter == 'a' || caracter == 'E'
                        || caracter == 'e' || caracter == 'I' || caracter == 'i' || caracter == 'O'
                        || caracter == 'o' || caracter == 'U' || caracter == 'u')) contador = 1;
            }
        }
        
        if(contador != 0){
            JOptionPane.showMessageDialog(null,"PLACA INCORRECTA");
            return false;
        }else{
            return true;
        }
        } else {
            JOptionPane.showMessageDialog(null,"PLACA INCORRECTA");
            return false;
        }
  }  
}
