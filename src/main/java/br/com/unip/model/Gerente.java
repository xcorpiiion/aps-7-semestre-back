package br.com.unip.model;

import br.com.study.genericidmongo.model.AbstractMongoId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import static javax.persistence.EnumType.STRING;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document
public class Gerente extends AbstractMongoId {

    @NotNull(message = "Nome não pode ser null.")
    @NotBlank(message = "Nome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome não pode conter apenas caracteres em branco.")
    private String nome;

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

}
