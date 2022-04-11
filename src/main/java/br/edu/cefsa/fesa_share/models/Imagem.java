/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.fesa_share.models;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Imagem implements Serializable{

    public Imagem() {
    }

    public Imagem(int codigo, String nome, byte[] conteudo, String caminho) {
        this.codigo = codigo;
        this.nome = nome;
        this.conteudo = conteudo;
        this.caminho = caminho;
    }
    
    
    private int codigo;
    private String nome;
    private byte[] conteudo;
    private String caminho;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    
    
    
}
