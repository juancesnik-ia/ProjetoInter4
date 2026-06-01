package com.inter4sem.controlevestuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens_venda")
public class ItemVendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idproduto", referencedColumnName = "id")
    private ProdutoEntity produto;
    private int quantidade;
    private double precoUnitario;

    @ManyToOne
    @JoinColumn(name = "idvenda", referencedColumnName = "id")
    private VendaEntity venda;

    public ItemVendaEntity() {
    }

    public ItemVendaEntity(int id, ProdutoEntity produto, int quantidade, double precoUnitario, VendaEntity venda) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.venda = venda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public VendaEntity getVenda() {
        return venda;
    }

    public void setVenda(VendaEntity venda) {
        this.venda = venda;
    }
}
