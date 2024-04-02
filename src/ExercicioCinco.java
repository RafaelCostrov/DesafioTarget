import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite algo para ser invertido:");
        String input = leitura.nextLine();
        String invertido = inverterInput(input);
        System.out.println("Input invertido: " + invertido);
    }

    public static String inverterInput(String str) {
        char[] charArray = str.toCharArray();
        int direita = 0;
        int esquerda = charArray.length - 1;

        while (direita < esquerda) {
            char c = charArray[direita];
            charArray[direita] = charArray[esquerda];
            charArray[esquerda] = c;
            direita++;
            esquerda--;
        }

        return new String(charArray);
    }
}