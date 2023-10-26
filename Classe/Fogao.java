public class Fogao {
    private String tipo;
    private String marca;
    private int bocas;

    public Fogao(String tipo, String marca, int bocas) {
        this.tipo = tipo;
        this.marca = marca;
        this.bocas = bocas;
    }

    public boolean cozinhar(boolean cozinhar) {
        if (cozinhar == true) {
            System.out.println("Fogo ligado");
        }
        return cozinhar;
    }

    public boolean esquentar(boolean esquentar) {
        if (esquentar == true) {
            System.out.println("Esquentando a comida");
        }
        return esquentar;
    }

    public boolean queimar(boolean queimar) {
        if (queimar == true) {
            System.out.println("Queimou sua mão");
        }
        return queimar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBoca() {
        return bocas;
    }

    public void setBoca(int bocas) {
        this.bocas = bocas;
    }
}