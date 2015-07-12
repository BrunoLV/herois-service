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
    private static final String SQL_UPDATE = "UPDATE tb_campeao SET nome = ?, editora = ?, ano = ? WHERE codigo = ?";
    private static final String SQL_DELETE = "DELETE FROM tb_campeao WHERE codigo = ?";
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
        } catch (SQLException e) {
        }
    }

    public void atualizar(Campeao campeao) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_UPDATE)){
            ps.setString(1, campeao.getNome());
            ps.setString(2, campeao.getEditora());
            ps.setShort(3, campeao.getAnoPrimeiraAparicao());
            ps.setLong(4, campeao.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(Long idRemocao) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_DELETE)){
            ps.setLong(1, idRemocao);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
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
