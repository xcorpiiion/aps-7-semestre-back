package br.com.unip.service;

import br.com.unip.model.Aluno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface AlunoService {

    Aluno save(Aluno aluno);

    Aluno find(Long id);

    List<Aluno> findAll();

    List<Aluno> findAll(List<Long> ids);

    List<Aluno> findAll(Sort sort);

    Page<Aluno> findAll(Pageable pageable);

    void delete(Long id);

    void delete(List<Aluno> aluno);

    void delete(Aluno aluno);

    void deleteAll();

    long count();

}