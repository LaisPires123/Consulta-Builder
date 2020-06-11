package consulta;

public class Diretor {

    private Construtor y;

    public Diretor(Construtor y) {
        this.y = y;
    }

    public void registrarMedico(String nomeM, String registroMedico, String especialidade) {

        y.cadastrarMedico(nomeM, registroMedico, especialidade);

    }
    
    public void registrarPaciente(String nomeP, String data_nascimento, String telefone, String endereco){
        
        y.cadastrarPaciente(nomeP, data_nascimento, telefone, endereco);
    }

    public void registrarAgenda(String data, String horario) {

        y.cadastrarConsulta(data, horario);

    }

}
