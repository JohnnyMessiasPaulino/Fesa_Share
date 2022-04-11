/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.fesa_share.models;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author USUARIO
 */
public class Pedido implements Serializable{

    public Pedido() {
    }

    public Pedido(int codigo, Float preco, Pagamento pagamento, Float precoAluguel, LocalDateTime dataPedido) {
        this.codigo = codigo;
        this.preco = preco;
        this.pagamento = pagamento;
        this.precoAluguel = precoAluguel;
        this.dataPedido = dataPedido;
    }

    
    private int codigo;
    private Float preco;
    private Produto produto = new Produto();
    private Usuario locador = new Usuario();
    private Usuario locatario = new Usuario();        
    private Pagamento pagamento;
    private Float precoAluguel;
    private LocalDateTime dataPedido;

    public Float getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(Float precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getLocador() {
        return locador;
    }

    public void setLocador(Usuario locador) {
        this.locador = locador;
    }

    public Usuario getLocatario() {
        return locatario;
    }

    public void setLocatario(Usuario locatario) {
        this.locatario = locatario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
}
