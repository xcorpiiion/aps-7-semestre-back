package br.com.unip.repository;

import br.com.unip.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, Long> {
}