import java.util.Scanner;

public class Geladeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    private String cor;
    private String marca;
    private double preco;

    public Geladeira(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public boolean abir(boolean abrirGeladeira) {
        if (abrirGeladeira == true) {
            System.out.println("Abrindo geladeira");
        } else {
            System.out.println("Fechando geladeira");
        }
        return abrirGeladeira;
    }

    public boolean temperatura(boolean aumentarTemp) {
        Scanner scanner = new Scanner(System.in);
        if (aumentarTemp == true) {
            System.out.printf("Digite a temperatura:");
            int temp = scanner.nextInt();
            System.out.printf("A temperaura é de %d°\n", temp);
        }
        return aumentarTemp;
    }

    public boolean modo(boolean ajustarModo) {
        Scanner scanner = new Scanner(System.in);
        if (ajustarModo == true) {
            System.out.printf("Escolha um modo: 1.Festa 2.Econômico 3.Turbo Freezer: ");
            int modo = scanner.nextInt();
            System.out.printf("Geladeira no modo "+ modo);
        }
        return ajustarModo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}