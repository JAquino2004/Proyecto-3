/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizdinamica;

import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author Joshua
 */
public class MatrizDinamica {
//listas para las cabezas y columnas
    LinkedList<NodoDato> filas = null;
    LinkedList<NodoDato> columnas = null;

    public MatrizDinamica() {
        this.filas = new LinkedList<NodoDato>();
        this.columnas = new LinkedList<NodoDato>();
    }

    
    //funcion para obtener la cabeza de una columna
    private NodoDato obtenerCabeceraColumna(int x) {
    for (NodoDato n : columnas) {
        if (n.getX() == x) return n;
    }
    return null;
}
//funcion para obtener la cabeza de una fila
private NodoDato obtenerCabeceraFila(int y) {
    for (NodoDato n : filas) {
        if (n.getY() == y) return n;
    }
    return null;
}

private void insertarCabeceraColumnaOrdenada(NodoDato nuevo) {
    for (int i = 0; i < columnas.size(); i++) {
        if (nuevo.getX() < columnas.get(i).getX()) {
            columnas.add(i, nuevo);
            return;
        }
    }
    columnas.add(nuevo); 
}

private void insertarCabeceraFilaOrdenada(NodoDato nuevo) {
    for (int i = 0; i < filas.size(); i++) {
        if (nuevo.getY() < filas.get(i).getY()) {
            filas.add(i, nuevo);
            return;
        }
    }
    filas.add(nuevo);
}
//funciones para reemplazar cabezas
private void reemplazarCabeceraColumna(int x, NodoDato nuevo) {
    for (int i = 0; i < columnas.size(); i++) {
        if (columnas.get(i).getX() == x) {
            columnas.set(i, nuevo);
            return;
        }
    }
}

private void reemplazarCabeceraFila(int y, NodoDato nuevo) {
    for (int i = 0; i < filas.size(); i++) {
        if (filas.get(i).getY() == y) {
            filas.set(i, nuevo);
            return;
        }
    }
}
//funcion para obtener un nodo en base a la funcion obtenerCabeceraColumna
private NodoDato buscarNodo(int x, int y) {
    NodoDato columna = obtenerCabeceraColumna(x);
    while (columna != null) {
        if (columna.getY() == y) return columna;
        columna = columna.getAbajo();
    }
    return null;
}

    //funcion para insertar
    public void insertar(int x, int y, Auto dato) {
    NodoDato nuevo = new NodoDato(x, y, dato);

    // esta parte es para actualizar el nodo cuando se nos da la misma coordenada
    NodoDato existente = buscarNodo(x, y);
    if (existente != null) {
        existente.setAuto(dato);
        return;
    }

    // insertar en columna
    NodoDato anteriorCol = null;
    NodoDato cabezaCol = obtenerCabeceraColumna(x);

    if (cabezaCol == null) {
        insertarCabeceraColumnaOrdenada(nuevo);
    } else {
        NodoDato actual = cabezaCol;
        while (actual != null && actual.getY() < y) {
            anteriorCol = actual;
            actual = actual.getAbajo();
        }
        if (anteriorCol == null) {
            // Insertar al inicio de la columna
            nuevo.setAbajo(cabezaCol);
            cabezaCol.setArriba(nuevo);
            reemplazarCabeceraColumna(x, nuevo);
        } else {
            // Insertar entre anteriorCol y actual
            anteriorCol.setAbajo(nuevo);
            nuevo.setArriba(anteriorCol);
            nuevo.setAbajo(actual);
            if (actual != null) actual.setArriba(nuevo);
        }
    }

    
    NodoDato anteriorFila = null;
    NodoDato cabezaFila = obtenerCabeceraFila(y);

    if (cabezaFila == null) {
        insertarCabeceraFilaOrdenada(nuevo);
    } else {
        NodoDato actual = cabezaFila;
        while (actual != null && actual.getX() < x) {
            anteriorFila = actual;
            actual = actual.getDerecha();
        }
        if (anteriorFila == null) {
            // Insertar al inicio de la fila
            nuevo.setDerecha(cabezaFila);
            cabezaFila.setIzquierda(nuevo);
            reemplazarCabeceraFila(y, nuevo);
        } else {
            // Insertar entre anteriorFila y actual
            anteriorFila.setDerecha(nuevo);
            nuevo.setIzquierda(anteriorFila);
            nuevo.setDerecha(actual);
            if (actual != null) actual.setIzquierda(nuevo);
        }
    }
} 
   

}
