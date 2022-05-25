package br.com.unip.service;

import br.com.unip.model.Materia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface MateriaService {

    Materia save(Materia materia);

    Materia find(Long id);

    List<Materia> findAll();

    List<Materia> findAll(List<Long> ids);

    List<Materia> findAll(Sort sort);

    Page<Materia> findAll(Pageable pageable);

    void delete(Long id);

    void delete(List<Materia> materia);

    void delete(Materia materia);

    void deleteAll();

    long count();

}