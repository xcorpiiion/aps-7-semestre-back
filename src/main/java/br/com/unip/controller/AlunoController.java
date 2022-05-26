package br.com.unip.controller;

import br.com.unip.model.Aluno;
import br.com.unip.service.AlunoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@Getter
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("alunos")
public class AlunoController {

    private final AlunoService service;

    @PostMapping()
    public ResponseEntity<Aluno> save(@RequestBody Aluno aluno) {
        return ok(this.getService().save(aluno));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> update(@PathVariable String id, @RequestBody Aluno aluno) {
        return ok(this.getService().update(id, aluno));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable String id) {
        return ok(this.getService().findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Aluno>> findAll() {
        return ok(this.getService().findAll());
    }

    @GetMapping("/emails/{email}")
    public ResponseEntity<Aluno> findByEmail(@PathVariable String email) {
        return ok(this.getService().findByEmail(email));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        this.getService().deleteById(id);
        return noContent().build();
    }

}