package teste;

import contrato.PlayerContrato;
import objeto.Player;
import org.junit.Assert;
import org.junit.Test;
import servico.PlayerServico;

public class TestPlayer {
    @Test
    public void CalculaValorTeste() {
        PlayerContrato player = new PlayerServico();
        Player play = new Player(1, "Lucas", 1000);
        player.CalculoValor(1, play);
    }

    @Test
    public void ValidaContinua() {
        PlayerContrato player = new PlayerServico();
        Player play = new Player(1, "Lucas", 1000);

        boolean resultado = player.ValidaContinua(play);
        Assert.assertTrue(resultado);

        Player play2 = new Player(1, "Lucas", 1000);
        boolean resultFalse = player.ValidaContinua(play2);
        Assert.assertFalse(resultado);
    }
}
