package consulta;

public class Teste {

    public static void main(String[] args) {

        Construtor marcarConsulta = new Construtor();
        Diretor diretor = new Diretor(marcarConsulta);
        diretor.registrarMedico("Mariana Duarte", "123", "Cirurgiã");
        diretor.registrarPaciente("Julia Fernandes", "03/09/1997", "40028922", "Rua São Sebastião");
        diretor.registrarAgenda("12/06/2020", "14h:00");
        
        Consulta consulta = marcarConsulta.agendamento();
        consulta.EmitirAgendamento();
        
        

    }

}
