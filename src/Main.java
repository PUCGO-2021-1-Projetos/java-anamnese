
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Grupo 07 - PUC ADS
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // ==============================================================      
        // === Declaração de objetos e variáveis que serão utilizados ===
        // ==============================================================      
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean loop = true;
        String[] listaSintomas = {
            /*0*/"Febre",
            /*1*/ "Tosse seca",
            /*2*/ "Dores musculares",
            /*3*/ "Dor de cabeça",
            /*4*/ "Dificuldade de respirar",
            /*5*/ "Cansaço e fadiga",
            /*6*/ "Coriza",
            /*7*/ "Falta de apetite",
            /*8*/ "Calafrios",
            /*9*/ "Vômitos e náuseas",
            /*10*/ "Perda de paladar",
            /*11*/ "Perda de olfato",
            /*12*/ "Erupção cutânea na pele",
            /*13*/ "Descoloração dos dedos das mãos ou dos pés",
            /*14*/ "Perda de fala ou movimento",
            /*15*/ "Respiração mais rápida que o normal",
            /*16*/ "Tosse com catarro esverdeado ou com sangue",
            /*17*/ "Suor noturno",
            /*18*/ "Dor no peito",
            /*19*/ "Dor de Garganta",
            /*20*/ "Conjutivite",
            /*21*/ "Diarreia"
        };

        // ========================
        // === Código principal ===
        // ========================
        System.out.println("Olá, bem-vindo ao PUC Anamnese Grupo 07 - Anamnese\n");
        System.out.println("Aqui você poderá obter, de forma ágil, um possível pré-diagnóstico de algum paciente sendo atendido\n");
        System.out.println("Vamos começar?\n");

        do {
            loop = menuPrincipal(scanner, listaSintomas, input);
        } while (loop);
    }

    // ======================================================
    // === Logo abaixo fica o local de métodos do sistema ===
    // ======================================================
    /**
     * Este método é responsável pela chamada do menu principal
     *
     * @param scanner
     * @param listaSintomas
     * @param input
     * @return
     */
    private static boolean menuPrincipal(Scanner scanner, String[] listaSintomas, String input) {

        System.out.println("--");
        System.out.println("1) Listar doenças reconhecidas");
        System.out.println("2) Listar sintomas");
        System.out.println("3) Realizar anamnese");
        System.out.println("--");
        System.out.println("4) Sair");
        System.out.println("--\n");
        System.out.print("Informe o que deseja fazer: ");
        input = scanner.nextLine();

        switch (input) {
            case "1":
                listarDoencas();
                break;
            case "2":
                listarSintomas(scanner, listaSintomas, input);
                break;
            case "3":
                realizarAnamnese(listaSintomas, scanner, input);
                break;
            case "4":
                System.out.println("\nObrigado por utilizar PUC Anamnese!");
                return false;
            default:
                System.out.println("\nOpção Inválida");
                break;
        }
        return true;
    }

    /**
     * Opção 1 - Listar Doenças.
     *
     * Este método é responsável por listar as doenças reconhecidas pelo sistema
     *
     * @param scanner
     * @param input
     */
    private static void listarDoencas() {
        System.out.println("\nAs doenças reconhecidas pelo sistema são:\n");
        System.out.println("- Influenza (H1N1)\n" + "- Pneumonia\n" + "- Corona Virus (Covid-19)");
        System.out.println("\n--");
        System.out.println("\nVamos continuar?\n");
    }

    /**
     * Opção 2 - Listar Sintomas.
     *
     * Este método é responsável pelo menu de listar os sintomas das doenças
     *
     * @param scanner
     * @param listaSintomas
     * @param input
     */
    private static void listarSintomas(Scanner scanner, String[] listaSintomas, String input) {

        System.out.println("\nVamos listar os possíveis sintomas reconhecidos. Para isso, selecione uma doença:");

        do {
            System.out.println("\n--");
            System.out.println("1) Influenza (H1N1)\n" + "2) Pneumonia\n" + "3) Corona Virus (Covid-19)");
            System.out.println("--\n");
            System.out.print("Escolha uma doença para para listar os sitomas ou digite \"V\" para voltar: ");
            input = scanner.nextLine();
            input = input.toUpperCase();

            switch (input) {
                case "1":
                    System.out.println("\nVocê selecionou: INFLUENZA (H1N1)\n");
                    System.out.println("Os sintomas são:\n");
                    listarSintomasDoenca(listaSintomas, 0, 9);
                    listarSintomasDoenca(listaSintomas, 19, 21);
                    break;
                case "2":
                    System.out.println("\nVocê selecionou: PNEUMONIA\n");
                    System.out.println("Os sintomas são:\n");
                    listarSintomasDoenca(listaSintomas, 0, 5);
                    listarSintomasDoenca(listaSintomas, 15, 18);
                    break;
                case "3":
                    System.out.println("\nVocê selecionou: Corona Virus (Covid-19)\n");
                    System.out.println("Os sintomas são:\n");
                    listarSintomasDoenca(listaSintomas, 0, 5);
                    listarSintomasDoenca(listaSintomas, 10, 14);
                    listarSintomasDoenca(listaSintomas, 18, 21);
                    break;
                case "V":
                    System.out.println("");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        } while (!input.equals("V"));
    }

    /**
     * Opção 3 - Listar Doenças.
     *
     * Este método é responsável por receber os inputs dos sintomas e calcular o
     * diagnostico da anamnese.
     *
     * @param listaSintomas
     * @param scanner
     * @param input
     */
    private static void realizarAnamnese(String[] listaSintomas, Scanner scanner, String input) {
        boolean loop = true;
        ArrayList<String> sintomas = new ArrayList<>();

        do {
            // Este trecho exibe na tela os listaSintomas e ao final captura e valida input do usuário
            System.out.println("\nPor favor informe o(s) sintoma(s) do paciente:");
            System.out.println("\nlistaSintomas:\n");
            for (int i = 0; i < listaSintomas.length; i++) {
                System.out.println((i + 1) + ") " + listaSintomas[i]);
            }
            System.out.println("--");
            System.out.print("Informe o sintoma ou digite \"D\" para diagnosticar ou \"V\" para voltar: ");
            input = scanner.nextLine();
            loop = validaSintoma(sintomas, input);

        } while (loop);
        /**
         * O trecho que virá aqui calcula a probabilidade das doenças.
         *
         * Regras da probabilidade para o diagnostico:
         *
         * 1) Caso o paciente não apresente nenhum dos sintomas exclusivos de
         * alguma doença e uma quantidade menor que a dos sintomas comuns o
         * sistema deve exibir uma mensagem informando que não é possível
         * realizar um diagnóstico com essa quantidade de informações.
         *
         * 2) Caso apresente apenas os sintomas comuns entre as 3 doenças a
         * probabilidade será baixa para todas
         *
         * 3) Caso apresente algum sintoma dentre os pares de sintomas comuns a
         * probabilidade será média para os pares de doenças.
         *
         * 3) Caso apresente pelo menos 1 dos sintomas exclusivos a
         * probabilidade será alta para aquela doença.
         */
    }

    /**
     * Este método lista no console os sintomas entre as doenças.
     *
     * @param listaSintomas
     * @param inicio
     * @param fim
     */
    private static void listarSintomasDoenca(String[] listaSintomas, int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println("- " + listaSintomas[i]);
        }
    }

    /**
     * Este método é responsável pelo processo de validação do input de
     * sintomas.
     *
     * Nesse trecho o sistema tenta dentro de um bloco try/catch converter o
     * input para inteiro a fim de verificar se o mesmo está entre 1 e 22. Se
     * estiver ele adiciona o sintoma no array sintomas. Caso o usuário tenha
     * digitado uma letra ocorrerá um erro de conversão NumberFormatException
     * que irá executar o bloco catch, onde o sistema passa o imput para
     * maúsculo e verifica se é igual a D ou V, e caso seja, finaliza a
     * repetição while "desligando" a variável de controle para loop = false.
     * Caso nenhuma das verificações sejam satisfeitas é exibida uma mensagem de
     * erro para o usuário.
     *
     * @param sintomas
     * @param input
     * @return
     */
    private static boolean validaSintoma(ArrayList<String> sintomas, String input) {

        try {
            if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 22) {
                if (sintomas.isEmpty()) {
                    sintomas.add(input);
                    System.out.println("\nSintoma selecionado com sucesso!");
                } else {
                    for (int i = 0; i < sintomas.size(); i++) {
                        if (sintomas.contains(input)) {
                            System.out.println("\nEste sintoma já foi selecionado. Escolha outro.");
                            return true;
                        } else {
                            sintomas.add(input);
                            System.out.println("\nSintoma selecionado com sucesso!");
                        }
                    }
                }
            } else {
                System.out.println("\nOpção inválida.");
            }
        } catch (NumberFormatException e) {
            input = input.toUpperCase();
            if (input.equals("D") || input.equals("V")) {
                return false;
            } else {
                System.out.println("\nOpção inválida.");
            }
        }
        return true;
    }
}