package br.com.unip.model;

import br.com.study.genericidmongo.model.AbstractMongoId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static javax.persistence.EnumType.STRING;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document
public class Produto extends AbstractMongoId {

    @NotNull(message = "Nome não pode ser null.")
    @NotBlank(message = "Nome não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome não pode conter apenas caracteres em branco.")
    private String nome;

    @NotNull(message = "preco não pode ser null.")
    @NotBlank(message = "preco não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "preco não pode conter apenas caracteres em branco.")
    private BigDecimal preco;

    @NotNull(message = "tipoConta não pode ser null.")
    @Enumerated(STRING)
    private TipoConta tipoConta;

    @NotNull(message = "quantidade não pode ser null.")
    @NotBlank(message = "quantidade não pode conter apenas caracteres em branco.")
    @NotEmpty(message = "quantidade não pode conter apenas caracteres em branco.")
    private int quantidade;

}
