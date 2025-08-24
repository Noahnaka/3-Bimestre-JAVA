public class BanhoSimples extends Agendamento {
    public BanhoSimples(String nomePet, String especie, String nomeDono, String telefoneDono, String horario) {
        super(nomePet, especie, nomeDono, telefoneDono, horario, "Hidratação");
    }

    @Override
    public String toString() {
        return super.toString() + " Hidratação";
    }
}
