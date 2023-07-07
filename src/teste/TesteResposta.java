package teste;

import contrato.RespostaContrato;
import objeto.Resposta;
import org.junit.Assert;
import org.junit.Test;
import servico.RespostaServico;

import java.util.List;

public class TesteResposta {
    @Test
    public void ConsultasRespostas() {
        RespostaContrato resposta = new RespostaServico();
        List<Resposta> respostas = resposta.getAllRespostas();
        Assert.assertNotNull(respostas);
        Assert.assertFalse(respostas.isEmpty());
    }

    @Test
    public void ConsultasRespostasByPerg() {
        RespostaContrato resposta = new RespostaServico();
        List<Resposta> respostas = resposta.getAllRespByPerg(1);
        Assert.assertNotNull(respostas);
        Assert.assertFalse(respostas.isEmpty());
    }
}
