import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int resp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Objeto");
        System.out.println();

        System.out.println("Moto");
        Moto moto = new Moto("Branca", "Suzuki", 5000);
        System.out.println("A cor da moto é " + moto.getCor());
        System.out.println("A marca da moto é " + moto.getMarca());
        System.out.println("O preço da moto é " + moto.getPreco());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            moto.ligar(true);
            moto.marcha(true);
            moto.buzina(true);
            moto.ligar(false);
        }
    }
}