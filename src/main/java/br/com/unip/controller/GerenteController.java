package br.com.unip.controller;

import br.com.unip.dto.GerenteConta;
import br.com.unip.dto.UserLogin;
import br.com.unip.model.Gerente;
import br.com.unip.service.GerenteService;
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
@RequestMapping("gerentes")
public class GerenteController {

    private final GerenteService service;

    @PostMapping()
    public ResponseEntity<Gerente> save(@RequestBody Gerente gerente) {
        return ok(this.getService().save(gerente));
    }

    @PostMapping("/login")
    public ResponseEntity<UserLogin> login(@RequestBody UserLogin userLogin) {
        return ok(this.getService().login(userLogin));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gerente> update(@PathVariable String id, @RequestBody Gerente gerente) {
        return ok(this.getService().update(id, gerente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gerente> findById(@PathVariable String id) {
        return ok(this.getService().findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Gerente>> findAll() {
        return ok(this.getService().findAll());
    }

}
