package br.com.igor.designpatters.cap1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Iss implements Imposto {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal taxa = new BigDecimal(0.2);
        BigDecimal calculado = taxa.multiply(orcamento.getValor()).setScale(2, RoundingMode.HALF_EVEN);
        return calculado;
    }
}
