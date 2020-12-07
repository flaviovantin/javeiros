package br.com.javeiros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/equipamentos")
public class EquipamentoController {

    @GetMapping
    @ResponseBody
    public List<String> listarTodosEquipamentos() {
        List<String> equipamentos = new ArrayList<>();
        equipamentos.add("Flavio");
        equipamentos.add("Lucas");
        equipamentos.add("Marcelo");
        return equipamentos;
    }
}
