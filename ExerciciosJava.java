import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciciosJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1. Troca de Variáveis");
            System.out.println("2. Antecessor do valor digitado");
            System.out.println("3. Area do retangulo");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TrocaVariaveis();
                    break;
                case 2:
                    Antecessor(scanner);
                    break;
                case 3:
                    AreaRetangulo(scanner);
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

    public static void TrocaVariaveis() {
        int A = 10;
        int B = 20;

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor em A: " + A);
        System.out.println("Valor em B: " + B);
    }

    public static void Antecessor(Scanner scanner) {
        try {
            System.out.println("Digite um valor ");
            int valor = scanner.nextInt();
            int antecessor = valor - 1;
            System.out.println("Antecessor de " + valor + " é " + antecessor);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void AreaRetangulo(Scanner scanner) {
        try {
            System.out.println("Valor da base:");
            int B = scanner.nextInt();

            System.out.println("Valor da altura:");
            int H = scanner.nextInt();

            int area = B * H;
            System.out.println("Valor da área: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }
}
