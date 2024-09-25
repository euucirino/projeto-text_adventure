package model;

import java.util.List;

public class Item {

    private Integer idItem;
    private String nome;
    private String descricao;
    private String comandoCorreto;
    private Cena cenaAtual;
    private Cena cenaDestino;

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComandoCorreto() {
        return comandoCorreto;
    }

    public void setComandoCorreto(String comandoCorreto) {
        this.comandoCorreto = comandoCorreto;
    }

    public Cena getCenaAtual() {
        return cenaAtual;
    }

    public void setCenaAtual(Cena cenaAtual) {
        this.cenaAtual = cenaAtual;
    }

    public Cena getCenaDestino() {
        return cenaDestino;
    }

    public void setCenaDestino(Cena cenaDestino) {
        this.cenaDestino = cenaDestino;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", comandoCorreto='" + comandoCorreto + '\'' +
                ", cenaAtual=" + cenaAtual +
                ", cenaDestino=" + cenaDestino +
                '}';
    }
}
