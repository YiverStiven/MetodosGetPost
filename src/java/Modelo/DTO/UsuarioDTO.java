/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author yiver
 */
public class UsuarioDTO implements Serializable{
    private int id;
    private String Nombre;
    private String Correo;
    private String Clave;
    private String Rol;
    public static final String Administrador="Admin";
    public static final String Cliente="Money";
    public static final String Vendedor="GM";
    public UsuarioDTO() {
    }

    public UsuarioDTO(int id, String Nombre, String Correo, String Clave, String Rol) {
        this.id = id;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Clave = Clave;
        this.Rol = Rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.Nombre);
        hash = 23 * hash + Objects.hashCode(this.Correo);
        hash = 23 * hash + Objects.hashCode(this.Clave);
        hash = 23 * hash + Objects.hashCode(this.Rol);
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
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        if (!Objects.equals(this.Clave, other.Clave)) {
            return false;
        }
        if (!Objects.equals(this.Rol, other.Rol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Nombre +"  "+  Rol;
    }
    
}
