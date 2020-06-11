package consulta;

public class Construtor implements ConsultaBuilder {

    private Consulta consulta;

    public Construtor() {

        this.consulta = new Consulta();

    }

    @Override
    public void cadastrarMedico(String nome, String registroMedico, String especialidade) {
        Medico x1 = new Medico();
        x1.setNome(nome);
        x1.setRegistroMedico(registroMedico);
        x1.setEspecialidade(especialidade);
        this.consulta.setMedico(x1);

    }

    @Override
    public void cadastrarPaciente(String nome, String data_nascimento, String telefone, String endereco) {

        Paciente x2 = new Paciente();
        x2.setNome(nome);
        x2.setEndereco(endereco);
        x2.setTelefone(telefone);
        x2.setData_nascimento(data_nascimento);
        this.consulta.setPaciente(x2);
    }

    @Override
    public void cadastrarConsulta(String data, String horario) {

        this.consulta.setData(data);
        this.consulta.setHorario(horario);

    }

    @Override
    public Consulta agendamento() {

        return this.consulta;

    }

}
