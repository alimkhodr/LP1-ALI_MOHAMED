import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\nEscolha um exercício para executar:");
            System.out.println("71");
            System.out.println("72");
            System.out.println("73");
            System.out.println("78");
            System.out.println("79");
            System.out.println("80");
            System.out.println("81");
            System.out.println("82");
            System.out.println("83");
            System.out.println("84");
            System.out.println("85");
            System.out.println("86");
            System.out.println("87");
            System.out.println("88");
            System.out.println("89");
            System.out.println("90");
            System.out.println("91");
            System.out.println("0. Sair");
            System.out.print("-> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 71:
                    Ex71(scanner);
                    break;
                case 72:
                    Ex72(scanner);
                    break;
                case 73:
                    Ex77(scanner);
                    break;
                case 78:
                    Ex78(scanner);
                    break;
                case 79:
                    Ex79(scanner);
                    break;
                case 80:
                    Ex80(scanner);
                    break;
                case 81:
                    Ex81(scanner);
                    break;
                case 82:
                    Ex82(scanner);
                    break;
                case 83:
                    Ex83(scanner);
                    break;
                case 84:
                    Ex84(scanner);
                    break;
                case 85:
                    Ex85(scanner);
                    break;
                case 86:
                    Ex86(scanner);
                    break;
                case 87:
                    Ex87(scanner);
                    break;
                case 88:
                    Ex88(scanner);
                    break;
                case 89:
                    Ex89(scanner);
                    break;
                case 90:
                    Ex90(scanner);
                    break;
                case 91:
                    Ex91(scanner);
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
        System.out.printf("\nExercício 71\n");
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
        System.out.printf("\nExercício 72\n");
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
        System.out.printf("\nExercício 73\n");
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
        System.out.printf("\nExercício 78\n");
        String nome[] = new String[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.printf("Informe o %dº nome de 10:", (i + 1));
            nome[i] = scanner.next();
        }
        String proc;
        System.out.printf("Procure um nome:");
        proc = scanner.next();
        boolean encontrado = false;
        for (i = 0; i < 10; i++) {
            if (nome[i].equals(proc)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }

    public static void Ex79(Scanner scanner) {
        System.out.printf("\nExercício 79\n");
        try {
            Double nota[] = new Double[20];
            int i;
            for (i = 0; i < 20; i++) {
                System.out.printf("Digite a %dª nota de 20: ", i + 1);
                nota[i] = scanner.nextDouble();
            }
            double soma = 0;
            for (double n : nota) {
                soma += n;
            }
            double media;
            media = soma / 20;
            System.out.println("A média é: " + media);

            int acimamedia = 0;
            for (i = 0; i < 20; i++) {
                if (nota[i] > media) {
                    acimamedia++;
                }
            }
            System.out.println("Numero de alunos acima da média: " + acimamedia);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número.");
            scanner.next();
        }
    }

    public static void Ex80(Scanner scanner) {
        try {
            int Q[] = new int[20];
            int i;
            System.out.printf("\nExercício 80\n");
            for (i = 0; i < 20; i++) {
                System.out.printf("Digite o %dº numero (positivo) de 20: ", i + 1);
                Q[i] = scanner.nextInt();
            }
            int maior = Q[0];
            int position = 0;
            for (i = 0; i < 20; i++) {
                if (Q[i] > maior) {
                    maior = Q[i];
                    position = i;
                }
            }
            System.out.printf("O maior numero é %d e sua posição é Q[%d]", maior, position);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex81(Scanner scanner) {
        try {
            int Q[] = new int[20];
            int i;
            System.out.printf("\nExercício 81\n");
            for (i = 0; i < 20; i++) {
                System.out.printf("Digite o %dº numero (positivo) de 20: ", i + 1);
                Q[i] = scanner.nextInt();
            }
            int menor = Q[0];
            int position = 0;
            for (i = 0; i < 20; i++) {
                if (Q[i] < menor) {
                    menor = Q[i];
                    position = i;
                }
            }
            System.out.printf("O menor numero é %d e sua posição é Q[%d]", menor, position);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex82(Scanner scanner) {
        try {
            int A[] = new int[10];
            int i;
            System.out.printf("\nExercício 82\n");
            for (i = 0; i < 10; i++) {
                System.out.printf("Digite o %dº numero de 10: ", i + 1);
                A[i] = scanner.nextInt();
            }
            int X;
            System.out.printf("Digite um outro numero: ");
            X = scanner.nextInt();
            int M[] = new int[10];
            for (i = 0; i < 10; i++) {
                M[i] = A[i] * X;
                System.out.printf("\nM[%d]: %d\n", i, M[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex83(Scanner scanner) {
        try {
            System.out.printf("\nExercício 83\n");
            int i;
            int V[] = new int[20];
            for (i = 0; i < 20; i++) {
                System.out.printf("Digite o %dº numero de 20: ", i + 1);
                V[i] = scanner.nextInt();
            }
            for (i = 19; i >= 0; i--) {
                System.out.printf("\nV[%d]: %d\n", i, V[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex84(Scanner scanner) {
        try {
            System.out.printf("\nExercício 84\n");

            int N;
            System.out.printf("Digite o tamanho do vetor: ");
            N = scanner.nextInt();

            int i;
            int A[] = new int[N];
            int B[] = new int[N];
            for (i = 0; i < N; i++) {
                System.out.printf("Digite o A[%d] de A[%d]: ", i + 1, N);
                A[i] = scanner.nextInt();
            }
            for (i = 0; i < N; i++) {
                System.out.printf("\nDigite o B[%d] de B[%d]: ", i + 1, N);
                B[i] = scanner.nextInt();
            }
            for (i = 0; i < N; i++) {
                System.out.printf("\nSoma[%d]: %d\n", i, (A[i] + B[i]));
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex85(Scanner scanner) {
        try {
            System.out.printf("\nExercício 85\n");

            int i;
            int dias[] = new int[365];
            for (i = 0; i < 365; i++) {
                System.out.printf("Digite a temperatura do %dº dia: ", i + 1);
                dias[i] = scanner.nextInt();
            }
            int soma = 0;
            for (int n : dias) {
                soma += n;
            }
            int media;
            media = soma / 365;

            int menor = dias[0];
            int maior = dias[0];
            for (i = 0; i < 365; i++) {
                if (dias[i] < menor) {
                    menor = dias[i];
                }
                if (dias[i] > maior) {
                    maior = dias[i];
                }
            }
            int inferior = 0;
            for (i = 0; i < 365; i++) {
                if (dias[i] < media) {
                    inferior++;
                }
            }
            System.out.printf("Menor temperatura do ano: %d°C\n", menor);
            System.out.printf("Maior temperatura do ano: %d°C\n", maior);
            System.out.printf("Temperatura média anual : %d°C\n", media);
            System.out.printf(" O número de dias no ano em que a temperatura foi inferior a média anual : %d\n",
                    inferior);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex86(Scanner scanner) {
        try {
            System.out.printf("\nExercício 86\n");
            int i;
            int V[] = new int[10];
            for (i = 0; i < 10; i++) {
                System.out.printf("Digite o %dº numero de 10: ", i + 1);
                V[i] = scanner.nextInt();
            }
            for (i = 0; i < 9; i++) {
                for (int j = 0; j < 9 - i; j++) {
                    if (V[j] > V[j + 1]) {
                        int temp = V[j];
                        V[j] = V[j + 1];
                        V[j + 1] = temp;
                    }
                }
            }
            System.out.println("Vetor ordenado em ordem crescente:");
            for (i = 0; i < 10; i++) {
                System.out.print(V[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex87(Scanner scanner) {
        try {
            System.out.printf("\nExercício 87\n");
            int i;
            int V[] = new int[11];
            for (i = 0; i < 10; i++) {
                System.out.printf("Digite o %dº numero de 10: ", i + 1);
                V[i] = scanner.nextInt();
            }
            for (i = 0; i < 9; i++) {
                for (int j = 0; j < 9 - i; j++) {
                    if (V[j] > V[j + 1]) {
                        int temp = V[j];
                        V[j] = V[j + 1];
                        V[j + 1] = temp;
                    }
                }
            }
            int N;
            System.out.printf("Digite outro numero: ");
            N = scanner.nextInt();

            int posicaoInsercao = 0;
            while (posicaoInsercao < 10 && N > V[posicaoInsercao]) {
                posicaoInsercao++;
            }
            for (i = 10; i > posicaoInsercao; i--) {
                V[i] = V[i - 1];
            }
            V[posicaoInsercao] = N;

            System.out.printf("Vetor ordenado em ordem crescente com outro numero: ");
            for (i = 0; i < 11; i++) {
                System.out.printf("V[%d] ", V[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex88(Scanner scanner) {
        try {
            System.out.println("\nExercício 88");
            int V[] = new int[20];
            int numero, i;
            for (i = 0; i < 20; i++) {
                System.out.printf("Digite o %dº numero de 20: ", i + 1);
                V[i] = scanner.nextInt();
            }

            System.out.print("Digite um número adicional: ");
            numero = scanner.nextInt();

            boolean encontrado = false;
            for (i = 0; i < 20; i++) {
                if (V[i] == numero) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                int V2[] = new int[19];
                int novoIndice = 0;
                for (i = 0; i < 20; i++) {
                    if (V[i] != numero) {
                        V2[novoIndice] = V[i];
                        novoIndice++;
                    }
                }
                System.out.printf("Novo vetor sem o número : ");
                for (i = 0; i < 19; i++) {
                    System.out.printf("V[%d] ", V2[i]);
                }
            } else {
                System.out.println("O número " + numero + " não existe no vetor.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex89(Scanner scanner) {
        try {
            System.out.println("\nExercício 89");
            int V1[] = new int[15];
            int V2[] = new int[15];
            int i;
            for (i = 0; i < 15; i++) {
                System.out.printf("Digite o %dº numero de 15: ", i + 1);
                V1[i] = scanner.nextInt();
            }
            for (i = 0; i < 15; i++) {
                System.out.printf("Digite o %dº numero de 15: ", i + 1);
                V2[i] = scanner.nextInt();
            }
            int qtd = 0;
            for (i = 0; i < 15; i++) {
                if (V1[i] == V2[i]) {
                    qtd++;
                }
            }
            System.out.printf("Quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições: %d",
                    qtd);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex90(Scanner scanner) {
        try {
            System.out.println("\nExercício 90");
            int V[] = new int[30];
            int i;
            for (i = 0; i < 30; i++) {
                System.out.printf("Digite o %dº numero de 30: ", i + 1);
                V[i] = scanner.nextInt();
            }

            int N;
            System.out.print("Digite um número adicional: ");
            N = scanner.nextInt();

            int qtd = 0;
            for (i = 0; i < 30; i++) {
                if (N == V[i]) {
                    qtd++;
                }
            }
            System.out.printf("Quantidade de vezes que o %d aparece no vetor: %d", N, qtd);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }

    public static void Ex91(Scanner scanner) {
        try {
            System.out.println("\nExercício 91");
            int V[] = new int[5];
            int i;
            for (i = 0; i < 5; i++) {
                System.out.printf("Digite o %dº numero de 50: ", i + 1);
                V[i] = scanner.nextInt();
            }
            int repetidos = 0;
            for (i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (V[i] == V[j]) {
                        repetidos++;
                    }
                }
            }
            System.out.printf("Quantidade de numeros repetidos: %d", repetidos);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor inteiro.");
            scanner.next();
        }
    }
}
