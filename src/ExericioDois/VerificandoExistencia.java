package ExericioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificandoExistencia {
    public static void main(String[] args) {

        var leitura = new Scanner(System.in);
        long quantidade = 0;

        while (true) {
            System.out.println("Digite a quantidade de termos que deseja visualizar na sequência:");
            String input = leitura.nextLine();
            try {
                quantidade = Long.parseLong(input);
                if (quantidade >= 0) {
                    break;
                }
                else {
                    System.out.println("Não é válido um valor negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }


        List listaFibonacci = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            listaFibonacci.add(MontandoSequencia.sequencia(i));
        }

        if (listaFibonacci.contains(quantidade)) {
            System.out.println("Os " + quantidade + " primeiros termos contém o número " + quantidade);
        } else {
            System.out.println("Os " + quantidade + " primeiros termos não contém o número " + quantidade);
        }

        System.out.println("Segue sequência dos " + quantidade + " primeiros termos:");
        System.out.println(listaFibonacci);
    }
}
