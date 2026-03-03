/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author ronal
 */
public class Asignatura {
    
    private String Codigo;
    private String nombre;
    private int creditos;
    private String codigo;
    
    // 🔹 CONSTRUCTOR
    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // 🔹 GETTERS Y SETTERS
    public String getCodigo() { 
        return codigo; 
    }

    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getCreditos() { 
        return creditos; 
    }

    public void setCreditos(int creditos) { 
        this.creditos = creditos; 
    }

     @Override
    public String toString() {
        String codigo = null;
        return "Codigo: " + codigo +
               ", Nombre: " + nombre +
               ", Creditos: " + creditos;
    }
}

