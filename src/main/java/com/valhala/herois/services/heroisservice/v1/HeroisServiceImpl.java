/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.herois.services.heroisservice.v1;

import com.valhala.heroi.dao.CampeaoDAO;
import com.valhala.heroi.domain.v1.Heroi;
import com.valhala.heroi.factories.ConnectionFactory;
import com.valhala.heroi.model.Campeao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "HeroisService", 
        targetNamespace = "http://valhala.com/herois/services/HeroisService/v1",
        portName = "HeroisServiceSOAP",
        serviceName = "HeroisService",
        wsdlLocation = "WEB-INF/contracts/HeroisService.wsdl")
public class HeroisServiceImpl implements HeroisService {

    @Override
    public List<Heroi> listarHerois() {
        List<Heroi> herois = new ArrayList<>();
        try(Connection connection = ConnectionFactory.getConnection()) {
            CampeaoDAO cdao = new CampeaoDAO(connection);
            List<Campeao> campeoes = cdao.selecionarTodos();
            if (!campeoes.isEmpty()) {
                for (Campeao campeao : campeoes) {
                    Heroi heroi = new Heroi();
                    heroi.setId(campeao.getId());
                    heroi.setNome(campeao.getNome());
                    heroi.setEditora(campeao.getEditora());
                    heroi.setAnoPrimeriaAparicao(campeao.getAnoPrimeiraAparicao().toString());
                    herois.add(heroi);
                }
                
            }
        } catch (Exception e) {
            System.out.println("OCORREU ERRO: " + e.getMessage());
        }
        return herois;
    }

    @Override
    public void incluirHeroi(Heroi heroi) {
        Campeao campeao = new Campeao(heroi.getNome(), heroi.getEditora(), Short.parseShort(heroi.getAnoPrimeriaAparicao()));
        try(Connection connection = ConnectionFactory.getConnection()) {
            CampeaoDAO cdao = new CampeaoDAO(connection);
            cdao.inserir(campeao);
        } catch (Exception e) {
            System.out.println("OCORREU ERRO: " + e.getMessage());
        }
    }

    @Override
    public void editarHeroi(Heroi heroi) {
        Campeao campeao = new Campeao(heroi.getId(), heroi.getNome(), heroi.getEditora(), Short.parseShort(heroi.getAnoPrimeriaAparicao()));
        try(Connection connection = ConnectionFactory.getConnection()) {
            CampeaoDAO cdao = new CampeaoDAO(connection);
            cdao.atualizar(campeao);
        } catch (Exception e) {
            System.out.println("OCORREU ERRO: " + e.getMessage());
        }
    }

    @Override
    public void deletarHeroi(long codigo) {
        try(Connection connection = ConnectionFactory.getConnection()) {
            CampeaoDAO cdao = new CampeaoDAO(connection);
            cdao.deletar(codigo);
        } catch (Exception e) {
            System.out.println("OCORREU ERRO: " + e.getMessage());
        }
    }

}
