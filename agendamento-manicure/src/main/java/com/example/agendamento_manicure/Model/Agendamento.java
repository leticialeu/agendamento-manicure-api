package com.example.agendamento_manicure.Model;

import java.time.LocalDateTime;

public class Agendamento {

    private Long id;
    private LocalDateTime dataHora;
    private String nomeCliente;
    private String servico;
    private String nomeProfissional;

    public Agendamento() {
        // Construtor vazio necessário para algumas funcionalidades do Spring
    }

    public Agendamento(LocalDateTime dataHora, String nomeCliente, String servico, String nomeProfissional) {
        this.dataHora = dataHora;
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.nomeProfissional = nomeProfissional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }
}
