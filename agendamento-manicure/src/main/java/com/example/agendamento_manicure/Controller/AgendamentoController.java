package com.example.agendamento_manicure.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agendamento_manicure.Model.Agendamento;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @PostMapping
    public Agendamento cadastrarAgendamento(@RequestBody Agendamento agendamento) {

        System.out.println("Agendamento recebido: " + agendamento.getNomeCliente() + " para " + agendamento.getDataHora());
        return agendamento;
    }
}
