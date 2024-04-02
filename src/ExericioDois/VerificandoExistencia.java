package ExericioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificandoExistencia {
    public static void main(String[] args) {

        var leitura = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos que deseja visualizar na sequência:");
        long quantidade = leitura.nextInt();
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
