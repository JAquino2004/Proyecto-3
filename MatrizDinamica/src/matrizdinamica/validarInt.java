/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizdinamica;

/**
 *
 * @author Joshua
 */
//esta clase tiene un metodo que valida si el string dado es un numero
public class validarInt {
    public boolean validar(String a){
        if (a == null || a.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
