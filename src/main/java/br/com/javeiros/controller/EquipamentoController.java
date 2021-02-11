package br.com.javeiros.controller;

import br.com.javeiros.controller.resource.EquipamentoResource;
import br.com.javeiros.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;

    @GetMapping
    @ResponseBody
    public List<String> listarTodosEquipamentos() {
        List<String> equipamentos = new ArrayList<>();
        equipamentos.add("Flavio");
        equipamentos.add("Lucas");
        equipamentos.add("Marcelo");
        return equipamentos;
    }

    @PostMapping
    @ResponseBody
    public void gravarEquipamento(EquipamentoResource equipamentoResource) {

        equipamentoService.gravarEquipamento();
    }

    @PutMapping
    @ResponseBody
    public void removerEquipamento(EquipamentoResource equipamentoResource) {

    }

    @DeleteMapping
    @ResponseBody
    public void removerEquipamento(Integer id) {

    }
}
