package br.com.unip.controller;

import br.com.unip.model.Professor;
import br.com.unip.service.ProfessorService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Getter
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("professores")
public class ProfessorController {

    private final ProfessorService service;

    @PostMapping()
    public ResponseEntity<Professor> save(@RequestBody Professor professor) {
        return ok(this.getService().save(professor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Professor> update(@PathVariable String id, @RequestBody Professor professor) {
        return ok(this.getService().update(id, professor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> findById(@PathVariable String id) {
        return ok(this.getService().findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Professor>> findAll() {
        return ok(this.getService().findAll());
    }

    @GetMapping("/nomes")
    public ResponseEntity<List<Professor>> findByNome(@RequestBody String nome) {
        return ok(this.getService().findByName(nome));
    }

}
