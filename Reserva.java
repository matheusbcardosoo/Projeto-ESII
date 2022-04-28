/**
 * Código responsavel pelo realização de agendamentos de reservas.
 */
import javax.swing.JOptionPane;

public class Reserva {
    static int numQuadra, escolha;
    public static void menuReservas (String[] args) {
        JOptionPane.showMessageDialog(null, "Acessando aba de Reservas!");
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção do menu para continuar \n (1) Adicionar Reserva \n (2) Consultar reservas \n (3) Cancelar reservas"));
        switch (escolha) {
            case 1: addReserva(); break;
            case 2: break;
            case 3: break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");
                menuReservas(args);
                break;
        }
        
    }
    static void addReserva(){
        Cliente.addInfosCliente();
        numQuadra = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da quadra solicitada:"));        
        Agenda.addDataHorario();
        Cliente.situacaoComparecer();
    }
}