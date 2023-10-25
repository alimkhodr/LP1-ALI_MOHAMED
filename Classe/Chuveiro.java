import java.util.Scanner;

public class Chuveiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    private String marca;
    private String energia;
    private int voltagem;

    public Chuveiro(String marca, String energia, int voltagem) {
        this.marca = marca;
        this.energia = energia;
        this.voltagem = voltagem;
    }

    public boolean ligar(boolean ligarChuveiro) {
        if (ligarChuveiro == true) {
            System.out.println("Ligando chuveiro");
        } else {
            System.out.println("Desligando chuveiro");
        }
        return ligarChuveiro;
    }

    public boolean temperatura(boolean aumentarTemp) {
        Scanner scanner = new Scanner(System.in);
        if (aumentarTemp == true) {
            System.out.printf("Digite o numero da temperatura que deseje: 1.Baixa 2.Média 3.Alta: ");
            int temp = scanner.nextInt();
            System.out.printf("A temperatura atual é:", temp);
        }
        return aumentarTemp;
    }

    public boolean pressao(boolean aumentarPressao) {
        if (aumentarPressao == true) {
            System.out.println("\nAumentando a pressão da água");
        }
        return aumentarPressao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

        public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}