package objeto;

public class Player {
    private int Codigo;
    private String Nome;
    private double Dinheiro;

    public Player(int codigo, String nome, double dinheiro) {
        Codigo = codigo;
        Nome = nome;
        Dinheiro = dinheiro;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getDinheiro() {
        return Dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        Dinheiro = dinheiro;
    }

}
