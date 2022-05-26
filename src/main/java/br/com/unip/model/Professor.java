package br.com.unip.model;

import br.com.study.genericidmongo.model.AbstractMongoId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

import static javax.persistence.EnumType.STRING;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document
public class Professor extends AbstractMongoId {

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

    @NotNull(message = "email não pode ser null.")
    @NotBlank(message = "email não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "email não pode conter apenas caracteres em branco.")
    @Column(unique = true)
    @Indexed
    private String email;

    @NotNull(message = "tipoConta não pode ser null.")
    @Enumerated(STRING)
    private TipoConta tipoConta;

    @NotNull(message = "Nome não pode ser null.")
    @NotBlank(message = "Nome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome não pode conter apenas caracteres em branco.")
    private String senha;

    @NotNull(message = "matérias não pode ser null.")
    @ManyToOne
    private Set<Materia> materias;


}
