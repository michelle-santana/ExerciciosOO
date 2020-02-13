package Exercicio01;

public class Feira {
    private String nome;
    private boolean epoca;
    private double preco;

    public String getFruta() {
        return nome;
    }

    public void setNome(String nome) {
        String NomeFruta = "uva";
        this.nome = this.nome;
    }

    public boolean isEpoca() {
        return epoca;
    }

    public void setEpoca(boolean epoca) {
        this.epoca = epoca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preço;
    }

    public void comprar() {
        if ((preco <= 5) && (epoca == true)) {
            System.out.println("Comprar!");
        } else if (preco > 5) {
            System.out.println("Fruta cara, pesquise mais...");
        }
        else if( epoca == false){
            System.out.println("Fruta fora de epoca.");
        }

    }


}






