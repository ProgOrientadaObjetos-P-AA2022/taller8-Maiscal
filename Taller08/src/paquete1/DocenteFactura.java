/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class DocenteFactura extends Docente{
    private double valorSueldo;
    private double valorPorHora;
    private int numHoras;
    private double sueldo;
    
    public void establecerValorSueldo(double vs){
        valorSueldo = vs;
    }
    public void establecerValorPorHora(double valorxH){
        valorPorHora = valorxH;
    }
    public void establecerNumHoras(int num){
        numHoras = num;
    }
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public double obtenerValorSueldo(){
        return valorSueldo;
    }
    public double obtenerValorPorHora(){
        return valorPorHora;
    }
    public int obtenerNumHoras(){
        return numHoras;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
}
