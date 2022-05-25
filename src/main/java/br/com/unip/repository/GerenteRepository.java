package br.com.unip.repository;

import br.com.unip.model.Gerente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GerenteRepository extends MongoRepository<Gerente, String> {

    Optional<Gerente> findByEmail(String email);

}
