import java.util.Scanner;

public class Impressora {

    private int voltagem;
    private String marca;
    private String tipo;

    public Impressora(int voltagem, String marca, String tipo) {
        this.voltagem = voltagem;
        this.marca = marca;
        this.tipo = tipo;
    }

    public boolean arquivo(boolean receberArquivo) {
        if (receberArquivo = true) {
            System.out.println("Arquivo na fila de impressão");
        }
        return receberArquivo;
    }

    public boolean cor(boolean escolherCor) {
        Scanner scanner = new Scanner(System.in);
        if (escolherCor = true) {
            System.out.printf("Digite 1.Preto/Branco ou 2.Colorida: ");
            int cor = scanner.nextInt();
            if (cor == 1) {
                System.out.println("Folha será impressa em Preto/Branco");
            } else {
                System.out.println("Folha será impressa em Colorida");
            }
        }
        return escolherCor;
    }

    public boolean impressao(boolean imprimirArquivo) {
        if (imprimirArquivo = true) {
            System.out.println("Arquivo impresso");
        }
        return imprimirArquivo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}