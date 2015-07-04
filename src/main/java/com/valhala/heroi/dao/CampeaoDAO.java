/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.heroi.dao;

import com.valhala.heroi.model.Campeao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brunolv
 */
public class CampeaoDAO {
    
    private static final String SQL_INSERT = "INSERT INTO tb_campeao (nome, editora, ano) values (?, ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM tb_campeao";
    
    private Connection connection;

    public CampeaoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir(Campeao campeao) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_INSERT)){
            ps.setString(1, campeao.getNome());
            ps.setString(2, campeao.getEditora());
            ps.setShort(3, campeao.getAnoPrimeiraAparicao());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<Campeao> selecionarTodos() {
        List<Campeao> campeoes = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(SQL_SELECT)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Campeao c = new Campeao(
                            rs.getLong("codigo"), 
                            rs.getString("nome"), 
                            rs.getString("editora"), 
                            rs.getShort("ano"));
                    campeoes.add(c);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampeaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return campeoes;
    }
    
    
    
}
