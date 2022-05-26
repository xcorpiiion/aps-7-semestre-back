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
public class UserLogin {

    private String email;

    private String senha;

    private TipoConta tipoConta;
}
