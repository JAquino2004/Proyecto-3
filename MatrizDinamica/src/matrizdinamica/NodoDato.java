/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//esta calse contiene los nodos que son guardados en las listas de columnas y filas
package matrizdinamica;

/**
 *
 * @author Joshua
 */
public class NodoDato {

     int x,y;
    NodoDato izquierda=null;
    NodoDato derecha=null;
    NodoDato arriba=null;
    NodoDato abajo=null;
    Auto auto;

    public NodoDato(int x, int y, Auto auto) {
        this.x = x;
        this.y = y;
        this.auto = auto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public NodoDato getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoDato izquierda) {
        this.izquierda = izquierda;
    }

    public NodoDato getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoDato derecha) {
        this.derecha = derecha;
    }

    public NodoDato getArriba() {
        return arriba;
    }

    public void setArriba(NodoDato arriba) {
        this.arriba = arriba;
    }

    public NodoDato getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoDato abajo) {
        this.abajo = abajo;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
}
