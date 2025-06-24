import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             Iphone iphone = new Iphone("iPhone 14", "Preto", "iOS 17");
             
             int opcao;
             do {
                 System.out.println("\n📱 Menu Interativo do iPhone");
                 System.out.println("1 - Tocar música");
                 System.out.println("2 - Pausar música");
                 System.out.println("3 - Selecionar música");
                 System.out.println("4 - Fazer ligação");
                 System.out.println("5 - Atender chamada");
                 System.out.println("6 - Iniciar correio de voz");
                 System.out.println("7 - Exibir página");
                 System.out.println("8 - Adicionar nova aba");
                 System.out.println("9 - Atualizar página");
                 System.out.println("0 - Sair");
                 System.out.print("Escolha uma opção: ");
                 opcao = scanner.nextInt();
                 scanner.nextLine(); // Limpa o buffer
                 
                 switch (opcao) {
                     case 1 -> iphone.tocar();
                     case 2 -> iphone.pausar();
                     case 3 -> {
                         System.out.print("Digite o nome da música: ");
                         String musica = scanner.nextLine();
                         iphone.selecionarMusica(musica);
                     }
                     case 4 -> iphone.ligar();
                     case 5 -> iphone.atender();
                     case 6 -> iphone.iniciarCorreioVoz();
                     case 7 -> {
                         System.out.print("Digite a URL: ");
                         String url = scanner.nextLine();
                         iphone.exibirPagina(url);
                     }
                     case 8 -> iphone.adicionarNovaAba();
                     case 9 -> iphone.actualizarPagina();
                     case 0 -> System.out.println("Encerrando o menu...");
                     default -> System.out.println("Opção inválida. Tente novamente.");
                 }
             } while (opcao != 0);
         }
    }
}