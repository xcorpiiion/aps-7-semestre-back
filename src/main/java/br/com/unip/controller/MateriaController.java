package br.com.unip.controller;

import br.com.unip.model.Materia;
import br.com.unip.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping("")
    public Materia save(@RequestBody Materia materia){
        return materiaService.save(materia);
    }

    @GetMapping("/{id}")
    public Materia getById(@PathVariable(value = "id") Long id){
        return materiaService.find(id);
    }

    @GetMapping("")
    public List<Materia> getAll(){
        return materiaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        materiaService.delete(id);
    }

    @DeleteMapping("")
    public void deleteAll(){
        materiaService.deleteAll();
    }

    @GetMapping("/count")
    public long count(){
        return materiaService.count();
    }
}