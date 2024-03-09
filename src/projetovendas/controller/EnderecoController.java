/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.controller;

import java.util.List;
import projetovendas.interfaces.IOperacao;
import projetovendas.model.Cidade;
import projetovendas.model.Endereco;

/**
 *
 * @author aluno
 */
public class EnderecoController implements IOperacao{
    
    private Endereco endereco;
    private Cidade cidade;

    public EnderecoController() {
        this.endereco = new Endereco();
        this.cidade = new Cidade();
    }
    
    
    

    @Override
    public void cadastrar() {
        endereco.setCidade(cidade);
        endereco.cadastrar();
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
    
    public List<Cidade> getListaCidade() {
        return cidade.getCidades();

    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
