import java.util.Scanner;

public class ExerciciosMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1. Troca de Variáveis");
            System.out.println("2. Outro Exercício");
            System.out.println("0. Sair");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    TrocaVariaveis();
                    break;
                case 2:
                    // Chame a função do outro exercício aqui
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
        
        // Troca dos valores usando uma variável temporária
        int temp = A;
        A = B;
        B = temp;
        
        // Exibição dos valores após a troca
        System.out.println("Valor em A: " + A);
        System.out.println("Valor em B: " + B);
    }
}