package br.com.unip.dto;

import br.com.unip.model.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GerenteConta {

    private String email;

    private TipoConta tipoConta;

}
