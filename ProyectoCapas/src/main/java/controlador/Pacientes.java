/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author kenph
 */
public class Pacientes {
    private String id_paciente;
    private String nombre_paciente;
    private String apellido_paciente;
    private String genero_paciente;
    private String direccion_paciente;
    private String telefono_paciente;
    private String estatus_paciente;

    @Override
    public String toString() {
        return "Pacientes{" + "id_paciente=" + id_paciente + ", nombre_paciente=" + nombre_paciente + ", apellido_paciente=" + apellido_paciente + ", genero_paciente=" + genero_paciente + ", direccion_paciente=" + direccion_paciente + ", telefono_paciente=" + telefono_paciente + ", estatus_paciente=" + estatus_paciente + '}';
    }

    public Pacientes(){
        
    }
    
    public Pacientes(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Pacientes(String id_paciente, String nombre_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
    }

    public Pacientes(String id_paciente, String nombre_paciente, String apellido_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
    }

    public Pacientes(String id_paciente, String nombre_paciente, String apellido_paciente, String genero_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.genero_paciente = genero_paciente;
    }

    public Pacientes(String id_paciente, String nombre_paciente, String apellido_paciente, String genero_paciente, String direccion_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.genero_paciente = genero_paciente;
        this.direccion_paciente = direccion_paciente;
    }

    public Pacientes(String id_paciente, String nombre_paciente, String apellido_paciente, String genero_paciente, String direccion_paciente, String telefono_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.genero_paciente = genero_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telefono_paciente = telefono_paciente;
    }
    
    

    public Pacientes(String id_paciente, String nombre_paciente, String apellido_paciente, String genero_paciente, String direccion_paciente, String telefono_paciente, String estatus_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.genero_paciente = genero_paciente;
        this.direccion_paciente = direccion_paciente;
        this.telefono_paciente = telefono_paciente;
        this.estatus_paciente = estatus_paciente;
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public String getGenero_paciente() {
        return genero_paciente;
    }

    public String getDireccion_paciente() {
        return direccion_paciente;
    }

    public String getTelefono_paciente() {
        return telefono_paciente;
    }

    public String getEstatus_paciente() {
        return estatus_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public void setGenero_paciente(String genero_paciente) {
        this.genero_paciente = genero_paciente;
    }

    public void setDireccion_paciente(String direccion_paciente) {
        this.direccion_paciente = direccion_paciente;
    }

    public void setTelefono_paciente(String telefono_paciente) {
        this.telefono_paciente = telefono_paciente;
    }

    public void setEstatus_paciente(String estatus_paciente) {
        this.estatus_paciente = estatus_paciente;
    }
    
}
