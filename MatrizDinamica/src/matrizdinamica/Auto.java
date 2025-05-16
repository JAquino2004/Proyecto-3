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
//esta calse es para el objeto que guarda los atributos del auto
public class Auto {
    String placa;
    String color;
    String linea;
    String modelo;
    String propietario;
    
    public void limpiar(){
        this.placa="";
        this.color="";
        this.linea="";
        this.modelo="";
        this.propietario="";
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Auto(String placa, String color, String linea, String modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario=propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        if(this.placa.isEmpty() && this.color.isEmpty() && this.linea.isEmpty() && this.modelo.isEmpty() && this.placa.isEmpty() && this.propietario.isEmpty()){
            return "";
        }else{
             return    placa + " " + color + " " + linea + " " + modelo + " " + propietario;
        }
       
    }
    
   
}
