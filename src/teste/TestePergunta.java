package teste;

import contrato.PerguntaContrato;
import objeto.Pergunta;
import org.junit.Assert;
import org.junit.Test;
import servico.PerguntaServico;

import java.util.List;

public class TestePergunta {
    @Test
    public void ConsultaTeste() {
        PerguntaContrato pergunta = new PerguntaServico();
        List<Pergunta> resutado = pergunta.getAllPerguntas();
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel1() {
        PerguntaContrato pergunta = new PerguntaServico();
        List<Pergunta> resutado = pergunta.getAllPergByNivel(1);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel2() {
        PerguntaContrato pergunta = new PerguntaServico();
        List<Pergunta> resutado = pergunta.getAllPergByNivel(2);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel3() {
        PerguntaContrato pergunta = new PerguntaServico();
        List<Pergunta> resutado = pergunta.getAllPergByNivel(3);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel4() {
        PerguntaContrato pergunta = new PerguntaServico();
        List<Pergunta> resutado = pergunta.getAllPergByNivel(4);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }
}
