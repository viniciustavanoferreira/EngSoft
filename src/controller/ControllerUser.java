/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.DAOUser;

/**
 *
 * @author vtffa
 */
public class ControllerUser {

    public static ResultSet getCodUserPassUsuario(String codUser, String codPassword) throws SQLException {
        ResultSet rs = new DAOUser().getCodUserPassUsuario(codUser, codPassword);
        return rs;
    }
    
}
