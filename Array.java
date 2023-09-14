import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1. Ex71");
            System.out.println("2. Ex72");
            System.out.println("0. Sair");
            System.out.print("-> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Ex71(scanner);
                    break;
                case 2:
                    Ex72(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

    }

    public static void Ex71(Scanner scanner) {
        try {
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

            // achar a média
            int soma = 0;
            for (int n : numeros) {
                soma += n;
            }
            int media;
            media = soma / qtd;
            System.out.println("A média é: " + media);

            // achar o maior
            int maior = numeros[0];
            for (int num : numeros) {
                if (num > maior) {
                    maior = num;
                }
            }
            System.out.println("O maior número é: " + maior);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex72(Scanner scanner) {
        try {
            double prod[] = new double[15];
            int i = 0, position = 1;
            while (i < 15) {
                System.out.print("Digite o preço do º" + position + " produto: ");
                prod[i] = scanner.nextDouble();
                i++;
                position++;
            }
            double maior = prod[0];
            for (double num : prod) {
                if (num > maior) {
                    maior = num;
                }
            }
            System.out.println("O maior preço é: " + maior);

            double soma = 0;
            for (double n : prod) {
                soma += n;
            }
            double media;
            media = soma / 15;
            System.out.println("A média aritmética é: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }
}
