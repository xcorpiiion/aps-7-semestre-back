package br.com.unip.service;

import br.com.study.genericidmongo.exception.ObjectNotFoundException;
import br.com.unip.model.Professor;
import br.com.unip.repository.ProfessorRepository;
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
public class ProfessorService {

    private final ProfessorRepository repository;

    public Professor save(Professor professor) {
        professor.setCreateDate(new DateTime());
        return this.getRepository().save(professor);
    }

    public Professor update(String id, Professor professor) {
        Optional<Professor> prof = this.getRepository().findById(id);
        if (prof.isEmpty()) {
            throw new ObjectNotFoundException("Professor não encontrado");
        }
        professor.setId(id);
        return this.getRepository().save(professor);
    }

    public Professor findById(String id) {
        Optional<Professor> professor = this.getRepository().findById(id);
        if (professor.isEmpty()) {
            throw new ObjectNotFoundException("Professor não encontrado");
        }
        return professor.get();
    }

    public List<Professor> findAll() {
        List<Professor> professores = this.getRepository().findAll();
        if (isEmpty(professores)) {
            throw new ObjectNotFoundException("Não existe professor com esse nome");
        }
        return professores;
    }

    public List<Professor> findByName(String name) {
        Optional<List<Professor>> professores = this.getRepository().findByNome(name);
        if (professores.isEmpty()) {
            throw new ObjectNotFoundException("Não existe professor com esse nome");
        }
        return professores.get();
    }


}
