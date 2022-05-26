package br.com.unip.service;

import br.com.study.genericidmongo.exception.ObjectNotFoundException;
import br.com.unip.model.Aluno;
import br.com.unip.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.CollectionUtils.isEmpty;

@Getter
@AllArgsConstructor
@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno save(Aluno aluno) {
        aluno.setCreateDate(new DateTime());
        return this.getRepository().save(aluno);
    }

    public Aluno update(String id, Aluno aluno) {
        Optional<Aluno> prof = this.getRepository().findById(id);
        if (prof.isEmpty()) {
            throw new ObjectNotFoundException("Aluno não encontrado");
        }
        aluno.setId(id);
        aluno.setCreateDate(prof.get().getCreateDate());
        return this.getRepository().save(aluno);
    }

    public Aluno findById(String id) {
        Optional<Aluno> aluno = this.getRepository().findById(id);
        if (aluno.isEmpty()) {
            throw new ObjectNotFoundException("Aluno não encontrado");
        }
        return aluno.get();
    }

    public List<Aluno> findAll() {
        List<Aluno> alunoes = this.getRepository().findAll();
        if (isEmpty(alunoes)) {
            throw new ObjectNotFoundException("Não existe aluno com esse nome");
        }
        return alunoes;
    }

    public Aluno findByEmail(String name) {
        Aluno alunoes = this.getRepository().findByEmail(name);
        if (alunoes == null) {
            throw new ObjectNotFoundException("Não existe aluno com esse email");
        }
        return alunoes;
    }

    public void deleteById(String id) {
        this.getRepository().deleteById(id);
    }

}