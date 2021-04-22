import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Anamnese de pessoa com queixa de saúde realizando pré-diagnóstico apontando
 * possíveis doenças.
 *
 * @see README.md
 * @author Grupo 07 - PUC ADS
 * @author Douglas Jordao
 * @author Leonardo Carvalho
 * @author Hugo Seabra
 * @author Gisely Meneses
 */
public class Main {

  protected static final String COVID19 = "COVID19";
  protected static final String H1N1 = "H1N1";
  protected static final String PNEUMONIA = "PNEUMONIA";

  protected static final String[] DOENCAS = {
    "Corona Virus (Covid-19)",
    "H1N1 (Influenza)",
    "Pneumonia",
  };

  protected static final String[] DOENCAS_CHAVES = {
    "COVID19",
    "H1N1",
    "PNEUMONIA",
  };

  protected static final String[] SINTOMAS = {
    /*0*/"Calafrios",
    /*1*/"Cansaço e Fadiga",
    /*2*/"Conjutivite",
    /*3*/"Coriza",
    /*4*/"Descoloração dos dedos das mãos ou dos pés",
    /*5*/"Diarreia",
    /*6*/"Dificuldade de respirar",
    /*7*/"Dor de cabeça",
    /*8*/"Dor de Garganta",
    /*9*/"Dor no peito",
    /*10*/"Dores musculares",
    /*11*/"Erupção cutânea na pele",
    /*12*/"Falta de apetite",
    /*13*/"Falta de ar",
    /*14*/"Febre",
    /*15*/"Irritação nos olhos",
    /*16*/"Mal-estar",
    /*17*/"Perda de fala ou movimento",
    /*18*/"Perda de olfato",
    /*19*/"Perda de paladar",
    /*20*/"Respiração mais rápida que o normal",
    /*21*/"Suor noturno",
    /*22*/"Tosse",
    /*23*/"Tosse com catarro esverdeado ou com sangue",
    /*24*/"Tosse seca",
    /*25*/"Vômitos e náuseas",
  };

  /**
   * Sintomas do H1N1
   * @see https://www.rededorsaoluiz.com.br/doencas/h1n1
   */
  protected static final Integer[] H1N1_SINTOMAS = {
    0, // calafrios
    1, // cansaço e fadiga
    3, // Coriza
    4, // Descoloração dos dedos das mãos ou dos pés
    5, // diarreia
    6, // dificuldade de respirar
    7, // dor de cabeça,
    8, // Dor de garganta
    10, // dores musculares
    12, // falta de apetite
    13, // falta de ar
    14, // Febre
    15, // irritação nos olhos
    16, // mal-estar
    22, // Tosse
    25, // vomitos e nauseas
  };

  /**
   * Sintomas do COVID19
   * @see https://www.who.int/emergencies/diseases/novel-coronavirus-2019/question-and-answers-hub/q-a-detail/coronavirus-disease-covid-19#:~:text=symptoms
   */
  protected static final Integer[] COVID19_SINTOMAS = {
    1, // cansaço e fadiga
    2, // conjuntivite
    4, // Descoloração dos dedos das mãos ou dos pés
    5, // diarreia
    6, // dificuldade de respirar
    7, // dor de cabeça
    8, // Dor de garganta
    9, // dor no peito
    10, // dores musculares
    11, // erupção cutânea
    13, // falta de ar
    14, // Febre
    17, // perda de fala ou movimento
    18, // perda de olfato
    19, // perda de paladar
    24, // Tosse seca
  };

  /**
   * Sintomas do PNEUMONIA
   * @see https://saude.abril.com.br/medicina/pneumonia-o-que-e/
   */
  protected static final Integer[] PNEUMONIA_SINTOMAS = {
    4, // Descoloração dos dedos das mãos ou dos pés
    6, // dificuldade de respirar
    7, // dor de cabeça
    9, // dor no peito
    10, // dores musculares
    12, // falta de apetite
    14, // Febre
    16, // mal-estar
    22, // Tosse
    23, // Tosse com catarro
    24, // Tosse seca
  };

  public static void main(String[] args) throws IOException {
    // ==============================================================
    // === Declaração de objetos e variáveis que serão utilizados ===
    // ==============================================================

    // Variável que fará o controle do looping do menu principal impedindo
    // que o programa encerre sem que o usuário finalize
    boolean loop = true;

    // ========================
    // === Código principal ===
    // ========================
    System.out.println("Olá, bem-vindo ao PUC Anamnese Grupo 07 - Anamnese\n");
    System.out.println(
      "Aqui você poderá obter, de forma ágil, um possível pré-diagnóstico sobre suas queixas."
    );
    System.out.println();
    System.out.println("Vamos começar?");
    System.out.println();

    // Objeto que será usado para capturar o input do usuário
    Scanner scanner = new Scanner(System.in);

    do {
      loop = Main.menuPrincipal(scanner);
    } while (loop == true);

    scanner.close();
  }

  // ======================================================
  // === Logo abaixo fica o local de métodos do sistema ===
  // ======================================================
  /**
   * Este método é responsável pela chamada do menu principal
   * 
   * @param Scanner scanner - Objeto que possui suporte de resgatar entrada do
   *                          usuário
   * @return boolean - TRUE se o menu principal continua ativo. FALSE para encerrar
   *
   * Menu princiapl 
   *
   */
  private static boolean menuPrincipal(Scanner scanner) {

    // Exibição do menu no terminal
    System.out.println("--");
    System.out.println("1) Listar doenças reconhecidas");
    System.out.println("2) Listar sintomas");
    System.out.println("3) Realizar anamnese");
    System.out.println("--");
    System.out.println("4) Sair");
    System.out.println("--\n");
    System.out.print("Informe o que deseja fazer: ");
    
    String input = scanner.nextLine();

    switch (input) {
      case "1":
        Main.listarDoencas();
        break;
      case "2":
        Main.listarSintomas(scanner);
        break;
      case "3":
        Main.realizarAnamnese(scanner);
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
   * Listar Doenças.
   * Este método é responsável por listar as doenças reconhecidas pelo sistema
   */
  private static void listarDoencas() {
    System.out.println("\nAs doenças reconhecidas pelo sistema são:\n");

    for(String doenca : Main.DOENCAS) {
      System.out.println(
        "- " + doenca
      );
    }
    System.out.println("\n--");
    System.out.println("\nVamos continuar?\n");
  }

  /**
   * Listar Sintomas de uma doença
   * Este método é responsável pelo menu de listar os sintomas das doenças
   * 
   * @param Scanner scanner - Objeto que possui suporte de resgatar entrada do
   *                          usuário
   */
  private static void listarSintomas(Scanner scanner) {
    System.out.println(
      "\nVamos listar os possíveis sintomas reconhecidos. Para isso, selecione uma doença:"
    );

    String input;

    do {
      System.out.println("\n--");

      for(int i = 0; i < Main.DOENCAS.length; i++) {
        System.out.println(
          (i+1) + ") " + Main.DOENCAS[i]
        );
      }
      System.out.println("--");
      System.out.println("V) Voltar");

      System.out.println("--\n");
      System.out.print(
        "Escolha uma doença para para listar os sitomas: "
      );
      input = scanner.nextLine().toUpperCase();

      if (input.equals("V")) {
        // Define o loop até aqui.
        continue;
      }

      Integer opcaoInput = 0;

      try {
        // Conversão do input inforado pelo usuário
        opcaoInput = Integer.parseInt(input);
      } catch(NumberFormatException e) {
        System.out.println("Informe um número válido.");
        continue;
      }

      if (opcaoInput < 1 || opcaoInput > Main.DOENCAS.length) {
        // Se o indice informado não está dentro do limite de doenças suportadas,
        // volta ao início perguntando novamente.
        System.out.println();
        System.out.println("Opção inválida.");
        continue;
      }

      // Normaliza a entrada de acordo com índice de lista (array)
      Integer index = opcaoInput - 1;
     
      // Nome da doença a ser exbido ao usuário de acordo com indice da lista.
      String nomeDoenca = Main.DOENCAS[index];

      // Alias da doença a ser exbido ao usuário de acordo com indice da lista.
      String doenca = Main.DOENCAS_CHAVES[index];

      // Exibindo para usuário
      System.out.println("\nVocê selecionou: " + nomeDoenca + " (alias: "+doenca+")\n");
      System.out.println("Os sintomas são:\n");

      // Listando de acordo com a opção informada pelo usuário
      switch (doenca) {
        case Main.COVID19:
          listarSintomasDoenca(Main.COVID19_SINTOMAS);
          break;
        case Main.H1N1:
          listarSintomasDoenca(Main.H1N1_SINTOMAS);
          break;
        case Main.PNEUMONIA:
          listarSintomasDoenca(Main.PNEUMONIA_SINTOMAS);
          break;
        default:
            System.out.println();
            System.out.println("Opção inválida.");
            break;
      }
    } while (!input.equals("V"));
  }

  /**
   * Este método lista no console os sintomas informados através do indice das doenças
   * da lista.
   *
   * @param Integer[] sintomaIndices
   */
  private static void listarSintomasDoenca(Integer[] sintomaIndices) {
    for (int i : sintomaIndices) {
      System.out.println("- " + Main.SINTOMAS[i]);
    }
  }

  /**
   * Opção 3 - Listar Doenças.
   *
   * Este método é responsável por receber os inputs dos sintomas e calcular o
   * diagnostico da anamnese.
   *
   * @param Scanner scanner - Objeto que possui suporte de resgatar entrada do
   *                          usuário
   */
  private static void realizarAnamnese(Scanner scanner) {

    // Este trecho exibe na tela os listaSintomas e ao final captura e valida input do usuário
    System.out.println("\nPor favor informe o(s) sintoma(s) do paciente:");
    // Este loop percorre todo o array que contém a lista de sintomas e exibe-os
    for (int i = 0; i < Main.SINTOMAS.length; i++) {
      System.out.println((i + 1) + ") " + Main.SINTOMAS[i]);
    }

    // Um array dinâmico que comportará os sintomas escolhidos pelo usuário
    ArrayList<String> listaSintomas = new ArrayList<String>();
    
    String input;

    do {
      System.out.println("--");
      System.out.print(
        "Informe o sintoma ou (\"D\": diagnosticar, \"V\": Voltar, \"R\": recomeçar): "
      );
      input = scanner.nextLine().toUpperCase();
      
      if (input.equals("V") || input.equals("D")) {
        // Define o loop até aqui.
        continue;
      }

      if (input.equals("R")) {
        // Define o loop até aqui.
        listaSintomas.clear();
        System.out.println("Recomeçando coletagem de sintomas, vamos de novo!.");
        continue;
      }

      Integer opcaoInput = 0;

      try {
        // Conversão do input informado pelo usuário
        opcaoInput = Integer.parseInt(input);
      } catch(NumberFormatException e) {
        System.out.println("Informe um número válido.");
        continue;
      }

      if (opcaoInput > Main.SINTOMAS.length) {
        // Se o indice informado não está dentro do limite de sitomas suportadas,
        // volta ao início perguntando novamente.
        System.out.println("\nOpção inválida.");
        continue;
      }
      
      // Normaliza a entrada de acordo com índice de lista (array)
      Integer index = opcaoInput - 1;

      System.out.println("> Sintoma: " + opcaoInput + " - " + Main.SINTOMAS[index]);

      // Evita entradas suplicadas
      String sintoma = Main.SINTOMAS[index];
      if (!listaSintomas.contains(sintoma)) {
        listaSintomas.add(Main.SINTOMAS[index]);
      }
      
    } while (!input.equals("D") && !input.equals("V"));

    if (input.equals("D")) {
      System.out.println("\nSintomas informados: ");

      for(String sintomas : listaSintomas) {
        System.out.println(" - " + sintomas);
      }

      System.out.println();
      System.out.println("Processando...");
      System.out.println();

      try {
        Thread.sleep(1000);//time is in ms (1000 ms = 1 second)
      } catch (InterruptedException e) {e.printStackTrace();}

      System.out.println(
        "De acordo com os dados informados a probabilidade do paciente ter contraído as seguintes doenças é:"
      );

      System.out.println("- " + Main.COVID19 + ": " + mostraProbabilidadeDoanca(Main.COVID19_SINTOMAS, listaSintomas));
      System.out.println("- " + Main.H1N1 + ": " + mostraProbabilidadeDoanca(Main.H1N1_SINTOMAS, listaSintomas));
      System.out.println("- " + Main.PNEUMONIA + ": " + mostraProbabilidadeDoanca(Main.PNEUMONIA_SINTOMAS, listaSintomas));

      System.out.println("\n\n");
      System.out.println("--");
    }
  }

  /**
   * Processa pré-diagnostico com possíveis doenças
   * 
   * @param Integer[] sintomasDoenca - Sintomas de uma doença reconhecidos
   * @param String[]  sintomasInformados - Sintomas informados pelo usuário
   * @return String   INCERTO, IMPROVÁVEL, POUCO PROVÁVEL, PROVAVEL, MUITO PROVAVEL
   */
  protected static String mostraProbabilidadeDoanca(Integer[] sintomasDoenca, ArrayList<String> sintomasInformados) {
    Integer counter = 0;

    for (int i = 0; i < Main.SINTOMAS.length; i++) {
      String sintoma = Main.SINTOMAS[i];
      
      if (!sintomasInformados.contains(sintoma)) {
        continue;
      }

      // Verifica em cada doença suportada
      if (Arrays.asList(sintomasDoenca).contains(i)) {
        counter++;
      }
    }
    
    if (counter.equals(0)) {
      return "IMPROVAVEL";
    }
    
    if (counter <= 3) {
      return "POUCO PROVÁVEL";
    }

    if (counter > 3 && counter <= 7) {
      return "PROVÁVEL";
    }

    if (counter > 7) {
      return "MUITO PROVÁVEL";
    }

    return "INCERTO";
  }
}
