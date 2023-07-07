package servico;

import contrato.RespostaContrato;
import objeto.Resposta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RespostaServico implements RespostaContrato {

    public List<Resposta> getAllRespostas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\respostas.txt";
        List<Resposta> respostas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String opcao = partes[1];
                    String texto = partes[2];
                    int idPergunta = Integer.parseInt(partes[3]);
                    boolean certo = Boolean.parseBoolean(partes[4]);

                    Resposta resposta = new Resposta(id, opcao, texto, idPergunta, certo);
                    respostas.add(resposta);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        return respostas;
    }

    public List<Resposta> getAllRespByPerg(int pergunta) {
        return getAllRespostas().stream().filter(x -> x.getPergunta() == pergunta).toList();
    }
}
