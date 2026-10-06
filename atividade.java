import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

       
        double[] energias = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a energia do sensor " + i + ": ");
            energias[i] = entrada.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += energias[i];
        }

        double media = soma / 10;

       
        double maior = energias[0];
        int indiceMaior = 0;

        for (int i = 1; i < 10; i++) {
            if (energias[i] > maior) {
                maior = energias[i];
                indiceMaior = i;
            }
        }

        
        int quantidadeAltissima = 0;

        for (int i = 0; i < 10; i++) {
            if (energias[i] > 100.0) {
                quantidadeAltissima++;
            }
        }

        // Relatório
        System.out.println();
        System.out.println("===== RELATÓRIO =====");
        System.out.println("Média das energias: " + media + " TeV");
        System.out.println("Maior energia: " + maior + " TeV");
        System.out.println("Índice do sensor: " + indiceMaior);
        System.out.println("Eventos de altíssima energia: " + quantidadeAltissima);

        entrada.close();
    }
}