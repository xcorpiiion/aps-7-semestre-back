package br.com.unip.service;

import br.com.unip.model.Aluno;
import br.com.unip.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno find(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public List<Aluno> findAll(List<Long> ids) {
        return alunoRepository.findAll();
    }

    @Override
    public List<Aluno> findAll(Sort sort) {
        return alunoRepository.findAll(sort);
    }

    @Override
    public Page<Aluno> findAll(Pageable pageable) {
        return alunoRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public void delete(List<Aluno> aluno) {
        alunoRepository.delete((Aluno) aluno);
    }

    @Override
    public void delete(Aluno aluno) {
        alunoRepository.delete(aluno);
    }

    @Override
    public void deleteAll() {
        alunoRepository.deleteAll();
    }

    @Override
    public long count() {
        return alunoRepository.count();
    }

}