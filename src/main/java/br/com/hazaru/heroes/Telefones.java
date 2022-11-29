package br.com.hazaru.heroes;

import java.util.Objects;

public class Telefones{

    private int idTelefone;
    private int idCliente;
    private int ddd;
    private int telefone;

    public Telefones(int idTelefone, int idCliente, int ddd, int telefone) {
        this.idTelefone = idTelefone;
        this.idCliente = idCliente;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public Telefones(){}

    @Override
    public String toString() {
        return "Telefones{" +
                "idTelefone=" + idTelefone +
                ", idCliente=" + idCliente +
                ", ddd=" + ddd +
                ", telefone=" + telefone +
                '}';
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefones telefones = (Telefones) o;
        return idTelefone == telefones.idTelefone && idCliente == telefones.idCliente && ddd == telefones.ddd && telefone == telefones.telefone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTelefone, idCliente, ddd, telefone);
    }



}
