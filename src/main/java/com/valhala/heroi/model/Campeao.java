/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.heroi.model;

import java.io.Serializable;

public class Campeao implements Serializable, Comparable<Campeao> {
    
    private Long id;
    private String nome;
    private String editora;
    private Short anoPrimeiraAparicao;
    
    private Long version;

    public Campeao() {
    }

    public Campeao(String nome, String editora, Short anoPrimeiraAparicao) {
        this.nome = nome;
        this.editora = editora;
        this.anoPrimeiraAparicao = anoPrimeiraAparicao;
    }
    
    public Campeao(Long id, String nome, String editora, Short anoPrimeiraAparicao) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.anoPrimeiraAparicao = anoPrimeiraAparicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Short getAnoPrimeiraAparicao() {
        return anoPrimeiraAparicao;
    }

    public void setAnoPrimeiraAparicao(Short anoPrimeiraAparicao) {
        this.anoPrimeiraAparicao = anoPrimeiraAparicao;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Campeao)) {
            return false;
        }
        Campeao campeao = (Campeao) obj;
        return campeao.getNome().equalsIgnoreCase(this.getNome()) && campeao.getEditora().equalsIgnoreCase(this.getEditora());
    }

    @Override
    public int hashCode() {
        int result = 21;
        result = 31 * result + (this.getNome() == null ? 0 : this.getNome().hashCode());
        result = 31 * result + (this.getEditora() == null ? 0 : this.getEditora().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NOME: ").append(this.nome).append(" - EDITORA: ").append(this.editora);
        return builder.toString();
    }

    @Override
    public int compareTo(Campeao o) {
        if(this.getNome().compareToIgnoreCase(o.getNome()) < 0) {
            return -1;
        }
        if(this.getNome().compareToIgnoreCase(o.getNome()) > 0) {
            return 1;
        }
        if(this.getEditora().compareToIgnoreCase(o.getEditora()) < 0) {
            return -1;
        }
        if(this.getEditora().compareToIgnoreCase(o.getEditora()) > 0) {
            return 1;
        }
        return 0;
    }
    
}
