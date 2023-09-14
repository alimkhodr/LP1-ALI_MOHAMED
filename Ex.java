import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEscolha um exercício para executar:");
            System.out.println("1. Ex71");
            System.out.println("2. Ex72");
            System.out.println("3. Vetor");
            System.out.println("4. Ex78");
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
                case 3:
                    Ex77(scanner);
                    break;
                case 4:
                    Ex78(scanner);
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

    public static void Ex77(Scanner scanner) {
        int n = 10; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; // índice ou posição

        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.printf("Informe º%d. valor de %d: ", (i + 1), n);
            v[i] = scanner.nextInt();
        }

        // Processamento: somar todos os valores, definir o maior e o menor valor
        int soma = 0;
        int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
        int maior = v[0];
        for (i = 0; i < n; i++) {
            soma = soma + v[i];

            if (v[i] < menor)
                menor = v[i];

            if (v[i] > maior)
                maior = v[i];
        }

        // Saída (resultados)
        System.out.printf("\n");
        for (i = 0; i < n; i++) {
            if (v[i] == menor)
                System.out.printf("v[%d] = %d <--- menor valor\n", i, v[i]);
            else if (v[i] == maior)
                System.out.printf("v[%d] = %d <--- maior valor\n", i, v[i]);
            else
                System.out.printf("v[%d] = %d\n", i, v[i]);
        }

        System.out.printf("Soma = %d\n", soma);
    }

public static void Ex78(Scanner scanner) {
    String nome[] = new String[10];
    int i;
    for (i = 0; i < 10; i++) {
        System.out.printf("Informe o %dº nome de 10:", (i+1));
        nome[i] = scanner.nextLine();
    }
    String proc;
    System.out.printf("Procure um nome:");
    proc = scanner.nextLine();
    boolean encontrado = false; // Variável para verificar se o nome foi encontrado
    for (i = 0; i < 10; i++) {
        if (nome[i].equals(proc)) {
            encontrado = true;
            break; // Se o nome for encontrado, não é necessário continuar procurando
        }
    }
    if (encontrado) {
        System.out.println("Achei");
    } else {
        System.out.println("Não achei");
    }
}
}
