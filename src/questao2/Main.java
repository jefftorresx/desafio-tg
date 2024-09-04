package questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Integer> numerosFibonacci = new ArrayList<>();
        numerosFibonacci.add(0);
        numerosFibonacci.add(1);

        int opcao_escolhida;
        while (true){
            try{
                opcao_escolhida = sc.nextInt();
                break;
            } catch (Exception e){
                sc.next();
            }
        }


        while (numerosFibonacci.get(numerosFibonacci.size() - 1 ) < opcao_escolhida){

            int proximoNumero = numerosFibonacci.get(numerosFibonacci.size() - 1)  + numerosFibonacci.get(numerosFibonacci.size() - 2);

            numerosFibonacci.add(proximoNumero);

        }

        String mensagem = numerosFibonacci.contains(opcao_escolhida) ? "Número escolhido pertence a sequencia fibonacci" : "Número escolhido não pertence a sequencia fibonaci";


        System.out.println(mensagem);

        sc.close();


    }
}
