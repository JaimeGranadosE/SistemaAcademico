/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author ronal
 */
public class Nota {

    private String codigoEstudiante;
    private String codigoAsignatura;
    private double valor;

    public Nota(String codigoEstudiante, String codigoAsignatura, double valor) {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoAsignatura = codigoAsignatura;
        this.valor = valor;

   
    

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Codigo Estudiante: " + codigoEstudiante
                + ", Codigo Asignatura: " + codigoAsignatura
                + ", Valor: " + valor;
    }
}
}
