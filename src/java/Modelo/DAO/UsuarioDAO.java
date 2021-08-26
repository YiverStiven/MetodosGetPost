/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.DTO.ContactoDTO;
import Modelo.DTO.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiver
 */
public class UsuarioDAO {

    private static final List<UsuarioDTO> Lista = new ArrayList<>();

    public UsuarioDAO() {

    }

    public void Datosprueba() {
        UsuarioDTO Usu1 = new UsuarioDTO(1, "hola", "H", "HH", UsuarioDTO.Administrador);
        UsuarioDTO Usu2 = new UsuarioDTO(2, "hola", "H", "HH", UsuarioDTO.Cliente);
        UsuarioDTO Usu3 = new UsuarioDTO(3, "hola", "H", "HH", UsuarioDTO.Vendedor);
        Lista.add(Usu1);
        Lista.add(Usu2);
        Lista.add(Usu3);
    }

    public boolean Crear(UsuarioDTO c) {
        if (c != null) {
            Lista.add(c);
            return true;
        } else {
            return false;
        }
    }

    public List<UsuarioDTO> readAll() {
        List<UsuarioDTO> Obj = null;
        Obj = UsuarioDAO.Lista;
        return Obj;
    }
}
