
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // Declaração de objetos e variáveis que serão utilizados
        Scanner scanner = new Scanner(System.in);
        String[] listaSintomas = {
            "1) Febre",
            "2) Tosse seca",
            "3) Tosse com catarro esverdeado ou com sangue",
            "4) Dores musculares",
            "5) Dor de cabeça",
            "6) Dificuldade de respirar",
            "7) Cansaço e fadiga",
            "8) Coriza",
            "9) Falta de apetite",
            "10) Calafrios",
            "11) Vômitos e náuseas",
            "12) Perda de paladar",
            "13) Perda de olfato",
            "14) Erupção cutânea na pele",
            "15) Descoloração dos dedos das mãos ou dos pés",
            "16) Perda de fala ou movimento",
            "17) Respiração mais rápida que o normal",
            "18) Suor noturno",
            "19) Dor no peito",
            "20) Conjutivite",
            "21) Diarreia",
            "22) Dor de Garganta"
        };

        // Código operacional vem logo abaixo
        realizarAnamnese(listaSintomas, scanner);
    }

    // Logo abaixo fica o local de métodos do sistema
    
























    // Essa é a parte do Douglas
    // Este método chama a funcionalidade da opção 3 - Realizar anamnese
    private static void realizarAnamnese(String[] listaSintomas, Scanner scanner) {
        String input;
        boolean loop = true;
        ArrayList<String> sintomas = new ArrayList<>();

        do {
            // Este trecho exibe na tela os listaSintomas e ao final captura o input do usuário
            System.out.println("Por favor informe o(s) sintoma(s) do paciente:");
            System.out.println("\nlistaSintomas:\n");
            for (int i = 0; i < listaSintomas.length; i++) {
                System.out.println(listaSintomas[i]);
            }
            System.out.println("--");
            System.out.print("Informe o sintoma ou digite \"D\" para diagnosticar ou \"V\" para voltar: ");
            input = scanner.nextLine();

            // Processo de validação do input
            /**
             * Nesse trecho o sistema tenta dentro de um bloco try/catch
             * converter o input para inteiro a fim de verificar se o mesmo está
             * entre 1 e 22. Se estiver ele adiciona o sintoma no array
             * sintomas. Caso o usuário tenha digitado uma letra ocorrerá um
             * erro de conversão NumberFormatException que irá executar o bloco
             * catch, onde o sistema passa o imput para maúsculo e verifica se é
             * igual a D ou V, e caso seja, finaliza a repetição while
             * "desligando" a variável de controle para loop = false. Caso
             * nenhuma das verificações sejam satisfeitas é exibida uma mensagem
             * de erro para o usuário.
             */
            try {
                if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 22) {
                    sintomas.add(input);
                } else {
                    System.out.println("Por favor, informe uma opção válida.\n");
                }
            } catch (NumberFormatException e) {
                input = input.toUpperCase();
                if (input.equals("D") || input.equals("V")) {
                    loop = false;
                } else {
                    System.out.println("Por favor, informe uma opção válida.\n");
                }
            }

        } while (loop);

        //Esse trecho calcula a probabilidade das doenças.
    }
}
