package consulta;

public class Consulta {

    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void EmitirAgendamento() {

        System.out.println("---- Consulta Agendada ----");
        System.out.println("Médico: " + this.getMedico().getNome());
        System.out.println("Paciente: " + this.getPaciente().getNome());
        System.out.println("Data: " + this.getData());
        System.out.println("Horario: " + this.getHorario());

    }

}
