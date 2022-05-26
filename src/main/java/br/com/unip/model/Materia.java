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
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document
public class Materia extends AbstractMongoId {

    @NotNull(message = "Nome não pode ser null.")
    @NotBlank(message = "Nome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome não pode conter apenas caracteres em branco.")
    @Column(unique = true)
    @Indexed
    private String nome;

    @NotNull(message = "professorEmail não pode ser null.")
    @NotBlank(message = "professorEmail não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "professorEmail não pode conter apenas caracteres em branco.")
    @OneToMany
    private String professorEmail;

    @NotNull(message = "professorNome não pode ser null.")
    @NotBlank(message = "professorNome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "professorNome não pode conter apenas caracteres em branco.")
    @OneToMany
    private String professorNome;

}
