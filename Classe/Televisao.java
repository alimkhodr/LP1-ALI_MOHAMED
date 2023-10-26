public class Televisao {
    private Double preco;
    private String marca;
    private String tela;

    public Televisao(Double preco, String marca, String tela) {
        this.preco = preco;
        this.marca = marca;
        this.tela = tela;
    }

    public boolean ligar(boolean ligaTv) {
        if (ligaTv == true) {
            System.out.println("TV ligagada...");
        }
        return ligaTv;
    }

    public boolean assistir(boolean assistirTv) {
        if (assistirTv == true) {
            System.out.println("Assistindo Globo...");
        }
        return assistirTv;
    }

    public boolean jogar(boolean jogarTv) {
        if (jogarTv == true) {
            System.out.println("Jogando no Xbox...");
        }
        return jogarTv;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
}