package contrato;

import objeto.Pergunta;

import java.util.List;

public interface PerguntaContrato {
    List<Pergunta> getAllPerguntas();
    List<Pergunta> getAllPergByNivel(int nivel);
}
