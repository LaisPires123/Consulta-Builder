package consulta;

public interface ConsultaBuilder {

    void cadastrarMedico(String nome, String registroMedico, String especialidade);

    void cadastrarPaciente(String nome, String data_nascimento,  String telefone,  String endereco );
    
    void cadastrarConsulta(String data, String horario);

    Consulta agendamento();

}
