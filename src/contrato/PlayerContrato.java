package contrato;

import objeto.Player;

public interface PlayerContrato {
    Player CalculoValor(int niveis, Player playerDomain);
    boolean ValidaContinua(Player playerDomain);
}
