package br.com.igor.designpatters.cap1;

import java.math.BigDecimal;

/*
    Interface criada para usar o design-patter Strategy
    consiste em poder utilizar qualquer classe que implemente essa interface;
 */
public interface Imposto {
    public BigDecimal calcula(Orcamento orcamento);
}
