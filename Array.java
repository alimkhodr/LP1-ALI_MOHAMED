import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd;
        System.out.print("Digite a quantidade de numeros: ");
        qtd = scanner.nextInt();

        int numeros[] = new int[qtd];
        int i = 0;
        while (i < qtd) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
            i++;
        }
        
        //achar a média
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        int media;
        media = soma / 2;
        System.out.println("A média é: "+media);

        //achar o maior
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
