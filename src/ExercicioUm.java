
public class ExercicioUm {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        for (int k = 0; k < indice; k++) {
            soma += k + 1;
            System.out.println("Resultado após " + (k + 1) +"° processamento: " + soma);
        }
        System.out.println("Resulta final: " + soma);
    }
}