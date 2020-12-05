package br.com.javeiros.etc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String sexo;
}
