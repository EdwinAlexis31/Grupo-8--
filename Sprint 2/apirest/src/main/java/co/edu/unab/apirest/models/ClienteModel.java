package co.edu.unab.apirest.models;

import java.time.LocalDate;
import java.util.concurrent.PriorityBlockingQueue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "clientes")
public class ClienteModel {

    @Id
    private String id;
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private String nombre_mascota;
    private String servicio_prestado;
    private String comentario;
    private LocalDate fRegistro;
   
    public ClienteModel() {
    }

    public ClienteModel(String id, String nombre, String apellido, String cedula, String telefono, String email,
            String nombre_mascota, String servicio_prestado, String comentario, LocalDate fRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.nombre_mascota = nombre_mascota;
        this.servicio_prestado = servicio_prestado;
        this.comentario = comentario;
        this.fRegistro = fRegistro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getServicio_prestado() {
        return servicio_prestado;
    }

    public void setServicio_prestado(String servicio_prestado) {
        this.servicio_prestado = servicio_prestado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(LocalDate fRegistro) {
        this.fRegistro = fRegistro;
    }
    
   

    

}