package objeto;

public class Pergunta {
    private int Id;
    private String Texto;
    private boolean Perguntado;
    private int NivelPergunta;

    public Pergunta(int id, String texto, boolean perguntado, int Nivel) {
        Id = id;
        Texto = texto;
        Perguntado = perguntado;
        NivelPergunta = Nivel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTexto() {
        return Texto;
    }

    public int getNivelPergunta() {
        return NivelPergunta;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public boolean isPerguntado() {
        return Perguntado;
    }

    public void setPerguntado(boolean perguntado) {
        Perguntado = perguntado;
    }
    public void setNivelPergunta(int nivel) {
        NivelPergunta = nivel;
    }
}
