import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int resp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Objeto\n");

        System.out.println("Moto");
        Moto moto = new Moto("Branca", "Suzuki", 5000.0);
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

        System.out.println("\nChuveiro");
        Chuveiro chuveiro = new Chuveiro("Lorenzetti", "Elétrica", 220);
        System.out.println("A marca do chuveiro é " + chuveiro.getMarca());
         System.out.println("O chuveiro é movido a Energia " + chuveiro.getEnergia());
        System.out.println("A voltagem é " + chuveiro.getVoltagem());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            chuveiro.ligar(true);
            chuveiro.temperatura(true);
            chuveiro.pressao(true);
            chuveiro.ligar(false);
        }
        
        System.out.println("\nGeladeira");
        Geladeira geladeira = new Geladeira("Cinza", "Brastemp", 2000);
        System.out.println("A cor da geladeira é " + geladeira.getCor());
        System.out.println("A marca da geladeira é " + geladeira.getMarca());
        System.out.println("O preço é " + geladeira.getPreco());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            geladeira.abrir(true);
            geladeira.temperatura(true);
            geladeira.modo(true);
            geladeira.abrir(false);
        }

        System.out.println("\nImpressora");
        Impressora impressora = new Impressora(110, "Epson", "Digital");
        System.out.println("A cor da geladeira é " + impressora.getVoltagem());
        System.out.println("A marca da geladeira é " + impressora.getMarca());
        System.out.println("O tipo é " + impressora.getTipo());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            impressora.arquivo(true);
            impressora.cor(true);
            impressora.impressao(true);
        }

        System.out.println("\nCaneta");
        Caneta caneta = new Caneta("Azul", "Bic", "Transparente");
        System.out.println("A cor da tinta da caneta é " + caneta.getTinta());
        System.out.println("A marca da caneta é " + caneta.getMarca());
        System.out.println("O tubo é " + caneta.getTubo());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            caneta.escrever(true);
            caneta.desenhar(true);
            caneta.destacar(true);
        }

        System.out.println("\nStreaming");
        Streaming streaming = new Streaming("Netflix", 5, 30);
        System.out.println("A empresa é " + streaming.getEmpresa());
        System.out.printf("É avaliado em %d estrelas\n", streaming.getAvaliacao());
        System.out.printf("Custa %2f /mês\n", streaming.getPreco());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            streaming.logar(true);
            streaming.escolher(true);
            streaming.assistir(true);
        }

        System.out.println("\nTV");
        Televisao tv = new Televisao(3000.0, "Samsung", "4K");
        System.out.println("A TV custa " + tv.getPreco());
        System.out.println("A marca da TV é " + tv.getMarca());
        System.out.println("O tipo da tela é " + tv.getTela());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            tv.ligar(true);
            tv.assistir(true);
            tv.jogar(true);
        }

        System.out.println("\nFogão");
        Fogao fogao = new Fogao("Elétrico", "Daku", 4);
        System.out.println("O fogão é " + fogao.getTipo());
        System.out.println("A marca é " + fogao.getMarca());
        System.out.printf("O fogão tem %d bocas\n", fogao.getBoca());

        System.out.println();
        System.out.println("Visualizar as ações? 1. Sim 2. Não");
        System.out.print("-> ");
        resp = scanner.nextInt();
        if (resp == 1) {
            fogao.cozinhar(true);
            fogao.esquentar(true);
            fogao.queimar(true);
        }
        scanner.close();
    }
}