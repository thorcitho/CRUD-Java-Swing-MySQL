/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historiaclinica2;

/**
 *
 * @author HP
 */
public class Persona {
    private String dni;
    private String nombres;
    private String apellidoPa;
    private String apellidoMa;

    // Constructor
    public Persona() {}

    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getApellidoPa() { return apellidoPa; }
    public void setApellidoPa(String apellidoPa) { this.apellidoPa = apellidoPa; }
    public String getApellidoMa() { return apellidoMa; }
    public void setApellidoMa(String apellidoMa) { this.apellidoMa = apellidoMa; }
}