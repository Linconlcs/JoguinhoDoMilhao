package contrato;

import objeto.Resposta;

import java.util.List;

public interface RespostaContrato {
    List<Resposta> getAllRespostas();
    List<Resposta> getAllRespByPerg(int pergunta);
}
