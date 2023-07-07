package servico;

import contrato.PerguntaContrato;
import objeto.Pergunta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PerguntaServico implements PerguntaContrato {
    public List<Pergunta> getAllPerguntas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\perguntas.txt";
        List<Pergunta> perguntas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String texto = partes[1];
                    boolean perguntado = Boolean.parseBoolean(partes[2]);
                    int nivel = Integer.parseInt(partes[3]);

                    Pergunta Pergunta = new Pergunta(id, texto, perguntado, nivel);
                    perguntas.add(Pergunta);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        return perguntas;
    }

    public List<Pergunta> getAllPergByNivel(int nivel) {
        return getAllPerguntas().stream().filter(x -> x.getNivelPergunta() == nivel).toList();
    }
}
