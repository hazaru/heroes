package br.com.example;

public class Contas {

    private int Id;
    private String descricao;
    private Double valor;
    private StatusPagamento status = StatusPagamento.NAOPAGO;

    public Contas(int id, String descricao, Double valor, StatusPagamento status) {
        Id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public Contas() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
}
