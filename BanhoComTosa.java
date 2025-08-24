public class BanhoComTosa extends Agendamento {
    public BanhoComTosa(String nomePet, String especie, String nomeDono, String telefoneDono, String horario) {
        super(nomePet, especie, nomeDono, telefoneDono, horario, "Tosa");
    }

    @Override
    public String toString() {
        return super.toString() + " Tosa";
    }
}
