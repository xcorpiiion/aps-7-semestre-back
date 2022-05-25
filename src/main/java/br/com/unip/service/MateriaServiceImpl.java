package br.com.unip.service;

import br.com.unip.model.Materia;
import br.com.unip.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia find(Long id) {
        return materiaRepository.findById(id).get();
    }

    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public List<Materia> findAll(List<Long> ids) {
        return materiaRepository.findAll();
    }

    @Override
    public List<Materia> findAll(Sort sort){
        return materiaRepository.findAll(sort);
    }

    @Override
    public Page<Materia> findAll(Pageable pageable){
        return materiaRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    materiaRepository.deleteById(id);
    }

    @Override
    public void delete(List<Materia> materia) {
        materiaRepository.delete((Materia) materia);
    }

    @Override
    public void delete(Materia materia) {
        materiaRepository.delete(materia);
    }

    @Override
    public void deleteAll() {
        materiaRepository.deleteAll();
    }

    @Override
    public long count() {
        return materiaRepository.count();
    }

}