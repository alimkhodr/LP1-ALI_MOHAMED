public class Caneta {
    private String tinta;
    private String marca;
    private String tubo;

    public Caneta(String tinta, String marca, String tubo) {
        this.tinta = tinta;
        this.marca = marca;
        this.tubo = tubo;
    }

    public boolean escrever(boolean escreverTexto) {
        if (escreverTexto == true) {
            System.out.println("'Texto escrito'");
        }
        return escreverTexto;
    }

    public boolean desenhar(boolean fazerDesenho) {
        if (fazerDesenho == true) {
            System.out.println("'Desenho do neymar'");
        }
        return fazerDesenho;
    }

    public boolean destacar(boolean destacarTexto) {
        if (destacarTexto == true) {
            System.out.println("'Texto destacado'");
        }
        return destacarTexto;
    }

    public String getTinta() {
        return tinta;
    }

    public void setTinta(String tinta) {
        this.tinta = tinta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTubo() {
        return tubo;
    }

    public void setTubo(String tubo) {
        this.tubo = tubo;
    }
}