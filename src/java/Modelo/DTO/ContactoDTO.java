/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

import java.util.Objects;

/**
 *
 * @author yiver
 */
public class ContactoDTO {

    private String Nombre;
    private String Correo;
    private String Asunto;
    private String Comentario;

    public ContactoDTO(String Nombre, String Correo, String Asunto, String Comentario) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Asunto = Asunto;
        this.Comentario = Comentario;
    }

    public ContactoDTO() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "Asunto=" + Asunto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Nombre);
        hash = 29 * hash + Objects.hashCode(this.Correo);
        hash = 29 * hash + Objects.hashCode(this.Asunto);
        hash = 29 * hash + Objects.hashCode(this.Comentario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactoDTO other = (ContactoDTO) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        if (!Objects.equals(this.Asunto, other.Asunto)) {
            return false;
        }
        if (!Objects.equals(this.Comentario, other.Comentario)) {
            return false;
        }
        return true;
    }
        
    
    }
