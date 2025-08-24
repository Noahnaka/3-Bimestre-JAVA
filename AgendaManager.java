public class AgendaManager {
    private static Agendamento[] agenda = new Agendamento[10];

    public static void agendar(Agendamento ag, int posicao) {
        if (posicao < 0 || posicao >= agenda.length) {
            System.out.println("Posição inválida!");
        } else if (agenda[posicao] != null) {
            System.out.println("Horário já ocupado!");
        } else {
            agenda[posicao] = ag;
            System.out.println("Agendamento realizado com sucesso!");
        }
    }

    public static void listar() {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                System.out.println(i + " - Disponível");
            } else {
                System.out.println(i + " - " + agenda[i]);
            }
        }
    }

    public static void editar(int posicao, String novoNomePet, String novoNomeDono) {
        if (posicao < 0 || posicao >= agenda.length || agenda[posicao] == null) {
            System.out.println("Não há agendamento neste horário!");
        } else {
            agenda[posicao].setNomePet(novoNomePet);
            agenda[posicao].setNomeDono(novoNomeDono);
            System.out.println("Agendamento atualizado!");
        }
    }

    public static void excluir(int posicao) {
        if (posicao < 0 || posicao >= agenda.length || agenda[posicao] == null) {
            System.out.println("Não há agendamento neste horário!");
        } else {
            agenda[posicao] = null;
            System.out.println("Agendamento excluído!");
        }
    }
}
