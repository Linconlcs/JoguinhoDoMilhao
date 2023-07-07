package objeto;

public class Resposta {
    private int Id;
    private String Opcao;
    private String Resposta;
    private int Pergunta;
    private boolean Certo;

    public Resposta(int id, String opcao, String resposta, int pergunta, boolean certo) {
        Id = id;
        Opcao = opcao;
        Resposta = resposta;
        Pergunta = pergunta;
        Certo = certo;
    }

    public int getId() {
        return Id;
    }

    public String getOpcao() {
        return Opcao;
    }

    public void setOpcao(String opcao) {
        Opcao = opcao;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getResposta() {
        return Resposta;
    }

    public void setResposta(String resposta) {
        Resposta = resposta;
    }

    public int getPergunta() {
        return Pergunta;
    }

    public void setPergunta(int pergunta) {
        Pergunta = pergunta;
    }

    public boolean isCerto() {
        return Certo;
    }

    public void setCerto(boolean certo) {
        Certo = certo;
    }
}
