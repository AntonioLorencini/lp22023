/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import java.sql.SQLException;
import java.sql.ResultSet;
import projetovendas.interfaces.IOperacao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Estado implements IOperacao {
    
    private String nome_estado;
    private String sigla_estado;
          
   private Statement mysqStatement = null; 
       
    public String getNomeEstado() {
        return nome_estado;
    }

    public void setNomeEstado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    
    public String getSiglaEstado() {
        return sigla_estado;
    }

    public void setSiglaEstado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    @Override
    public void cadastrar() {
       String insert = "insert into estado(nome_estado, sigla_estado) "
                + "values('" + getNomeEstado() + "','" + getSiglaEstado() + "')";
        mysqStatement = ConexaoDB.getStatement();

        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    
    }

    @Override
    public boolean alterar() {
    return false;
    }

    @Override
    public boolean excluir() {
    return false;
    }

    @Override
    public void cancelar() {
    }

    
    
   
}
