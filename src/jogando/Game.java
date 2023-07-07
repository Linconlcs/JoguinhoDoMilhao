package jogando;

import contrato.PerguntaContrato;
import contrato.PlayerContrato;
import contrato.RespostaContrato;
import objeto.Pergunta;
import objeto.Player;
import objeto.Resposta;
import servico.PerguntaServico;
import servico.RespostaServico;

import java.util.List;
import java.util.Scanner;

public class Game {
    public void Jogar() {
        RespostaContrato _resposta = new RespostaServico();
        PerguntaContrato _pergunta = new PerguntaServico();
        PlayerContrato _player = new servico.PlayerServico();
        Scanner scan1 = new Scanner(System.in);
        boolean jogando = true;
        List<Pergunta> perguntas = _pergunta.getAllPerguntas();
        List<Resposta> respostas = _resposta.getAllRespostas();

        while (jogando) {
            System.out.println("Nivel 1 - Perguntas acumulam 1000 reais.");
            boolean joga1 = true;
            boolean joga2 = false;
            boolean joga3 = false;
            boolean fim = false;
            System.out.println("Qual seu nome?");
            String nome = scan1.nextLine();
            Player player = new Player(1, nome, 0);

            while (joga1) {
                System.out.println("Você está no nivel facil");
                Scanner scanResP = new Scanner(System.in);
                List<Pergunta> pergunta1 = _pergunta.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (Pergunta perg : pergunta1) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (player.getDinheiro() + 1000));
                    System.out.println(perg.getTexto());
                    List<Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("certo!!");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        joga1 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    joga2 = true;
                }
                joga1 = false;
            }
            while (joga2) {
                System.out.println("Você está no nivel Medio");
                Scanner scanResP = new Scanner(System.in);
                List<Pergunta> pergunta2 = _pergunta.getAllPergByNivel(1).subList(5, 10);
                int conta = 0;
                for (Pergunta perg : pergunta2) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 10000));
                    System.out.println(perg.getTexto());
                    List<Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        joga2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    joga3 = true;
                }
                joga2 = false;
            }
            while (joga3) {
                System.out.println("Você está no nivel dificl");
                Scanner scanResP = new Scanner(System.in);
                List<Pergunta> pergunta3 = _pergunta.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (Pergunta perg : pergunta3) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 100000));
                    System.out.println(perg.getTexto());
                    List<Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                        player = _player.CalculoValor(1, player);
                    } else {
                        jogando = false;
                        joga3 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    fim = true;
                }
                joga3 = false;
            }
            while (fim) {
                System.out.println("Você está na final");
                Scanner scanResP = new Scanner(System.in);
                List<Pergunta> pergFim = _pergunta.getAllPergByNivel(1);
                int conta = 0;
                for (Pergunta perg : pergFim.subList(0, 1)) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (player.getDinheiro() + 10000));
                    System.out.println(perg.getTexto());
                    List<Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        joga3 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                    System.out.println("Você está milhonario");
                    fim = true;
                }
            }
        }
    }
}
