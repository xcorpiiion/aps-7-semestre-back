package br.com.unip.model;

import br.com.study.genericidmongo.model.AbstractMongoId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document
public class Aluno extends AbstractMongoId {

    @NotNull(message = "Nome não pode ser null.")
    @NotBlank(message = "Nome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome não pode conter apenas caracteres em branco.")
    private String nome;

    @NotNull(message = "ra não pode ser null.")
    @NotBlank(message = "ra não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "ra não pode conter apenas caracteres em branco.")
    @Column(unique = true)
    @Indexed
    private String ra;

    @NotNull(message = "matérias não pode ser null.")
    @ManyToOne
    private Set<Materia> materias;

}
