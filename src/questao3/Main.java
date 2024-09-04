package questao3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();

        List<FaturamentoDiario> tempFaturamentos = new ArrayList<>();
        Type listType = new TypeToken<List<FaturamentoDiario>>() {}.getType();

        try (FileReader reader = new FileReader("C:/temp/desafio-tg/src/questao3/dados.json")){
            tempFaturamentos = gson.fromJson(reader,listType);

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<FaturamentoDiario> faturamentos = new ArrayList<>();

        for (FaturamentoDiario fd : tempFaturamentos){
            if (fd.getValor() != null && fd.getValor() != 0.0){
                faturamentos.add(fd);
            }
        }

        Double menorValor = Double.MAX_VALUE;
        Double maiorValor = Double.MIN_VALUE;
        Double somaMensal = 0.0;

        for (FaturamentoDiario fd : faturamentos){
            if (fd.getValor() < menorValor){
                menorValor = fd.getValor();
            }

            if (fd.getValor() > maiorValor){
                maiorValor = fd.getValor();
            }
            somaMensal += fd.getValor();

        }

        Double mediaMensal  = somaMensal / faturamentos.size();

        Integer numeroDeDias = 0;
        for (FaturamentoDiario fd : faturamentos){
            if (fd.getValor() > mediaMensal){
                numeroDeDias += 1;
            }
        }

        System.out.println(System.getProperty("user.dir"));


        System.out.println(" O menor valor de faturamento ocorrido em um dia do mês; " + menorValor);
        System.out.println(" O maior valor de faturamento ocorrido em um dia do mês; " + maiorValor);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. " + numeroDeDias);








    }
}
