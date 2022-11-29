package br.com.hazaru.heroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private int IdCliente;
    private String nomeCliente;
    private String SobrenomeCliente;
    private List<Telefones> telefone = new ArrayList<>();
    public Cliente(int idCliente, String nomeCliente, String sobrenomeCliente, List<Telefones> telefone) {
        this.IdCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.SobrenomeCliente = sobrenomeCliente;
        this.telefone = telefone;
    }

    public Cliente(){

    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenomeCliente() {
        return SobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        SobrenomeCliente = sobrenomeCliente;
    }

    public List<Telefones> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefones> telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IdCliente=" + IdCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", SobrenomeCliente='" + SobrenomeCliente + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return IdCliente == cliente.IdCliente && Objects.equals(nomeCliente, cliente.nomeCliente) && Objects.equals(SobrenomeCliente, cliente.SobrenomeCliente) && Objects.equals(telefone, cliente.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdCliente, nomeCliente, SobrenomeCliente, telefone);
    }


}
