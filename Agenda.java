import javax.swing.JOptionPane;

public class Agenda {
    static String data, horaInicio, horaFim;

    static void addDataHorario(){
        data = JOptionPane.showInputDialog("Entre com a data do agendamento (DD/MM/AAAA):");
        horaInicio = JOptionPane.showInputDialog("Início (HH:MM):");
        horaFim = JOptionPane.showInputDialog("Início (HH:MM):");
    }
}