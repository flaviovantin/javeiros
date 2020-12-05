package br.com.javeiros.etc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bolinha {

    private Integer tamanho;
    private String cor;
    private Integer circunferencia;
    private Boolean ehMacia;
    private Boolean estaCheia;

    public void quicar(Integer numeroVezes) {
//        "pigou 3x";
    }

    public void furar() {
        estaCheia = false;
    }

}
