/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.DTO.ContactoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiver
 */
public class ContactoDAO {
    private static final List<ContactoDTO> Lista = new ArrayList<>();

    public ContactoDAO() {
    }
    
    public boolean Crear(ContactoDTO c){
        if (c != null){
            Lista.add(c);
            return true;
        }else{
            return false;
        }
    }
    
    public  List<ContactoDTO> readAll(){
        List<ContactoDTO> Obj = null;
        Obj=ContactoDAO.Lista;
        return Obj;
    }
}
