package br.com.hazaru.heroes;

import java.util.ArrayList;
import java.util.List;

public class ClienteDTO {

    private String nomeCliente;
    private String SobrenomeCliente;
    private List<TelefoneDTO> telefone = new ArrayList<>();

    public ClienteDTO(ClienteDTO clienteDTO ) {

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

    public List<TelefoneDTO> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<TelefoneDTO> telefone) {
        this.telefone = telefone;
    }

    public ClienteDTO(String nomeCliente, String sobrenomeCliente, List<TelefoneDTO> telefone) {
        this.nomeCliente = nomeCliente;
        SobrenomeCliente = sobrenomeCliente;
        this.telefone = telefone;
    }
}
