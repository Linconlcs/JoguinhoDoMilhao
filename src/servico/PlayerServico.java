package servico;

import contrato.PlayerContrato;
import objeto.Player;

import java.util.Scanner;

public class PlayerServico implements PlayerContrato {
    public Player CalculoValor(int niveis, Player playerDomain) {
        if (niveis == 1) {
            double valor = playerDomain.getDinheiro();
            playerDomain.setDinheiro(valor + 1000);
        } else if (niveis == 2) {
            double valor = playerDomain.getDinheiro();
            playerDomain.setDinheiro(valor + 10000);
        } else if (niveis == 3) {
            double valor = playerDomain.getDinheiro();
            playerDomain.setDinheiro(valor + 100000);
        }
        return playerDomain;
    }

    public boolean ValidaContinua(Player playerDomain) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Você tem " + playerDomain.getDinheiro() + " ainda quer continuar jogando?");
        System.out.println("Para parar de jogar digite 1");
        System.out.println("Para continuar aperte qualquer tecla");
        String continua = scan.nextLine();
        if (continua.equals("1")) {
            System.out.println("O jogo terminou");
            return false;
        } else
            return true;
    }

    public void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
        }
    }
}
