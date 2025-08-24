public class Agendamento {
    private String nomePet;
    private String especie;
    private String nomeDono;
    private String telefoneDono;
    private String horario;
    private String servicoAdicional;

    public Agendamento(String nomePet, String especie, String nomeDono, String telefoneDono, String horario, String servicoAdicional) {
        this.nomePet = nomePet;
        this.especie = especie;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.horario = horario;
        this.servicoAdicional = servicoAdicional;
    }

    // Getters e Setters
    public String getNomePet() { return nomePet; }
    public void setNomePet(String nomePet) { this.nomePet = nomePet; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getNomeDono() { return nomeDono; }
    public void setNomeDono(String nomeDono) { this.nomeDono = nomeDono; }

    public String getTelefoneDono() { return telefoneDono; }
    public void setTelefoneDono(String telefoneDono) { this.telefoneDono = telefoneDono; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getServicoAdicional() { return servicoAdicional; }
    public void setServicoAdicional(String servicoAdicional) { this.servicoAdicional = servicoAdicional; }

    @Override
    public String toString() {
        return "Pet: " + nomePet + " (" + especie + ") | Dono: " + nomeDono +
               " | Tel: " + telefoneDono + " | Horário: " + horario +
               (servicoAdicional != null ? " | Serviço: " + servicoAdicional : "");
    }
}
