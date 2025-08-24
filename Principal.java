import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Agendar banho");
            System.out.println("2 - Consultar agenda");
            System.out.println("3 - Editar agendamento");
            System.out.println("4 - Excluir agendamento");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Pet: ");
                    String pet = sc.nextLine();
                    System.out.print("Espécie: ");
                    String especie = sc.nextLine();
                    System.out.print("Nome do Dono: ");
                    String dono = sc.nextLine();
                    System.out.print("Telefone do Dono: ");
                    String tel = sc.nextLine();
                    System.out.print("Horário (0 a 9): ");
                    int h = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Serviço Adicional: \n1 - Hidrataçao \n2 - Tosa");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Agendamento ag;
                    if (tipo == 1) {
                        ag = new BanhoSimples(pet, especie, dono, tel, "Horário " + h);
                    } else {
                        ag = new BanhoComTosa(pet, especie, dono, tel, "Horário " + h);
                    }
                    AgendaManager.agendar(ag, h);
                    break;

                case 2:
                    AgendaManager.listar();
                    break;

                case 3:
                    System.out.print("Qual horário deseja editar (0 a 9)? ");
                    int posEdit = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome do Pet: ");
                    String novoPet = sc.nextLine();
                    System.out.print("Novo nome do Dono: ");
                    String novoDono = sc.nextLine();
                    AgendaManager.editar(posEdit, novoPet, novoDono);
                    break;

                case 4:
                    System.out.print("Qual horário deseja excluir (0 a 9)? ");
                    int posExc = sc.nextInt();
                    sc.nextLine();
                    AgendaManager.excluir(posExc);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}
