package br.com.unip.controller;

import br.com.unip.model.Aluno;
import br.com.unip.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("")
    public Aluno save(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno getById(@PathVariable(value = "id") Long id) {
        return alunoService.find(id);
    }

    @GetMapping("")
    public List<Aluno> getAll() {
        return alunoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        alunoService.delete(id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        alunoService.deleteAll();
    }

    @GetMapping("/count")
    public long count() {
        return alunoService.count();
    }
}