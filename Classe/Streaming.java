import java.util.Scanner;

public class Streaming {

    private String empresa;
    private int avaliacao;
    private double preco;
    int filme;

    public Streaming(String empresa, int avaliacao, double preco) {
        this.empresa = empresa;
        this.avaliacao = avaliacao;
        this.preco = preco;
    }

    public boolean logar(boolean fazerLogin) {
        Scanner scanner = new Scanner(System.in);
        if (fazerLogin == true) {
            System.out.print("Entre com o usuario:");
            String usuario = scanner.next();
            System.out.print("Entre com a senha:");
            String senha = scanner.next();
            System.out.print("Bem-vindo!" + usuario);
        }
        return fazerLogin;
    }

    public boolean escolher(boolean escolherStreaming) {
        Scanner scanner = new Scanner(System.in);
        if (escolherStreaming == true) {
            System.out.printf("Escolha entre 1.Vingadores 2.Homem aranha 3.Batman");
            filme = scanner.nextInt();
        }
        return escolherStreaming;
    }

    public boolean assistir(boolean assistirStreaming) {
        if (assistirStreaming == true) {
            if (filme == 1) {
                System.out.println("Assistindo Vingadores");
            } else if (filme == 2) {
                System.out.println("Assistindo Homem aranha");
            } else {
                System.out.println("Assistindo Batman");
            }
        }
        return assistirStreaming;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}