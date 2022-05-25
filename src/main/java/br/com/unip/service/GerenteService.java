package br.com.unip.service;

import br.com.study.genericidmongo.exception.ObjectNotFoundException;
import br.com.unip.model.Gerente;
import br.com.unip.repository.GerenteRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.CollectionUtils.isEmpty;

@Getter
@AllArgsConstructor
@Service
public class GerenteService {

    private final GerenteRepository repository;

    public Gerente save(Gerente gerente) {
        gerente.setCreateDate(new DateTime());
        return this.getRepository().save(gerente);
    }

    public Gerente update(String id, Gerente gerente) {
        Optional<Gerente> prof = this.getRepository().findById(id);
        if (prof.isEmpty()) {
            throw new ObjectNotFoundException("Gerente não encontrado");
        }
        gerente.setId(id);
        return this.getRepository().save(gerente);
    }

    public Gerente findById(String id) {
        Optional<Gerente> gerente = this.getRepository().findById(id);
        if (gerente.isEmpty()) {
            throw new ObjectNotFoundException("Gerente não encontrado");
        }
        return gerente.get();
    }

    public Gerente findByEmail(String email) {
        Optional<Gerente> gerente = this.getRepository().findByEmail(email);
        if (gerente.isEmpty()) {
            return null;
        }
        return gerente.get();
    }

    public List<Gerente> findAll() {
        List<Gerente> gerentees = this.getRepository().findAll();
        if (isEmpty(gerentees)) {
            throw new ObjectNotFoundException("Não existe gerente com esse nome");
        }
        return gerentees;
    }


}
