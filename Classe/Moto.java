import java.util.Scanner;

public class Moto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    private String cor;
    private String marca;
    private double preco;

    public Moto(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public boolean ligar(boolean ligarMoto) {
        if (ligarMoto == true) {
            System.out.println("Ligando moto");
        } else {
            System.out.println("Desligando moto");
        }
        return ligarMoto;
    }

    public boolean marcha(boolean passarMarcha) {
        Scanner scanner = new Scanner(System.in);
        if (passarMarcha == true) {
            System.out.printf("Digite a marcha para qual passar:");
            int mar = scanner.nextInt();
            System.out.printf("Esta na %dº marcha\n", mar);
        }
        return passarMarcha;
    }

    public boolean buzina(boolean apertarBuzina) {
        if (apertarBuzina == true) {
            System.out.println("Bibi");
        }
        return apertarBuzina;
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