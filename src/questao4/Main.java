package questao4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> faturamentoMensal = new HashMap<>();
        Map<String, Double> percentualDeRepresentacao = new HashMap<>();

        faturamentoMensal.put("SP", 67836.43);
        faturamentoMensal.put("RJ", 36678.66);
        faturamentoMensal.put("MG", 29229.88);
        faturamentoMensal.put("ES", 27165.48);
        faturamentoMensal.put("Outros", 19849.53);



       double somaTotal = 0.0;
        for (Map.Entry<String, Double> entry : faturamentoMensal.entrySet()) {
            somaTotal += entry.getValue();
        }
        for (Map.Entry<String, Double> entry : faturamentoMensal.entrySet()) {
            double percent = (entry.getValue() / somaTotal) * 100;
            percentualDeRepresentacao.put(entry.getKey(), percent);
        }


        for (Map.Entry<String, Double> entry : percentualDeRepresentacao.entrySet()) {
            System.out.printf("O percentual que '%s' teve dentro no valor total é: %.1f%%\n", entry.getKey(), entry.getValue());
        }


    }


}
