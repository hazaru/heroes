package br.com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TelefoneDTO {

    private int ddd;
    private int telefone;

    public TelefoneDTO(Telefones t){
        this.telefone = t.getTelefone();
        this.ddd = t.getDdd();
    }

    public TelefoneDTO(int ddd, int telefone) {
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public TelefoneDTO() {
    }

    public TelefoneDTO(TelefoneDTO telefoneDTO) {
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

    public Optional<Telefones> retornaTelPorId(Integer id, ArrayList<Telefones> listaTel) {
        return listaTel.stream().filter(
                x -> x.getIdCliente() == id
        ).findFirst();
    }



    public List<Telefones> retornaDto(List<Telefones> tt){
        tt.stream().map(TelefoneDTO::new).collect(Collectors.toList());
        return tt;
    }





}
