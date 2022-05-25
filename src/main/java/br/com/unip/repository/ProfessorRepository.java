package br.com.unip.repository;

import br.com.unip.model.Professor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfessorRepository extends MongoRepository<Professor, String> {

    Optional<List<Professor>> findByNome(String name);


}
