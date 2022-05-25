package br.com.unip.repository;

import br.com.unip.model.Materia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MateriaRepository extends MongoRepository<Materia, Long> {
}