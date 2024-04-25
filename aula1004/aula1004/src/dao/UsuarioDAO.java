/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author CAMARGO
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome, cpf, email, telefone;
    
    public UsuarioDAO(){
    this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
    String sql = "insert into usuario(nome, cpf, email, telefone, sexo, anoNascimento, nacionalidade, endereco) values(?,?,?,?,?,?,?,?)";
    
    try{
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setString(1, usuario.getNome());
    stmt.setString(2, usuario.getCpf());
    stmt.setString(3, usuario.getEmail());
    stmt.setString(4, usuario.getTelefone());
    stmt.setString(5, usuario.getSexo());
    stmt.setString(6, usuario.getAnoNascimento());
    stmt.setString(7, usuario.getNacionalidade());
    stmt.setString(8, usuario.getEndereco());
    
    
    
    stmt.execute();
    stmt.close();
    }catch(SQLException u){
    throw new RuntimeException(u);
    }
    }
}
