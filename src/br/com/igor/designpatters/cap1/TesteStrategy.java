package br.com.igor.designpatters.cap1;

import java.math.BigDecimal;

public class TesteStrategy {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(1000.50));
        Iss iss = new Iss();
        Icms icms = new Icms();
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        calculadoraImpostos.calularImposto(orcamento, iss);
        calculadoraImpostos.calularImposto(orcamento, icms);
    }
}
