package model;

import java.util.List;

public class Cena {

    private Integer idCena;
    private String descricao;
    private String objetivo;
    private String pegadinha;
    private List<Item> itens;

    public Integer getIdCena() {
        return idCena;
    }

    public void setIdCena(Integer idCena) {
        this.idCena = idCena;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPegadinha() {
        return pegadinha;
    }

    public void setPegadinha(String pegadinha) {
        this.pegadinha = pegadinha;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Cena{" +
                "idCena=" + idCena +
                ", descricao='" + descricao + '\'' +
                ", objetivo='" + objetivo + '\'' +
                ", pegadinha='" + pegadinha + '\'' +
                '}';
    }
}
