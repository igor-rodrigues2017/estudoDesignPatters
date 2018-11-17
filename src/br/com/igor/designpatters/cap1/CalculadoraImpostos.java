package br.com.igor.designpatters.cap1;

import java.math.BigDecimal;

public class CalculadoraImpostos {
    public BigDecimal calularImposto(Orcamento orcamento, Imposto imposto) {
        BigDecimal impostoCalculado = imposto.calcula(orcamento);
        System.out.println(impostoCalculado);
        return impostoCalculado;
    }
}
