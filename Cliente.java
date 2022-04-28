import javax.swing.JOptionPane;

public class Cliente {
    static String nomeCompleto, cpf;
    static int naoCompareceu;
    public static void addInfosCliente (){        
        nomeCompleto = JOptionPane.showInputDialog ("Nome completo do cliente:");
        cpf = JOptionPane.showInputDialog ("CPF do cliente:");
    }
    static void situacaoComparecer(){
        naoCompareceu = Integer.parseInt(JOptionPane.showInputDialog ("O cliente já reservou anteriormente e não compareceu?\n ATENÇÃO: \n Use 1 para sim e 2 para não!"));
        if (naoCompareceu == 1){
            JOptionPane.showMessageDialog(null, "ATENÇÃO!!!\nO cliente deve realizar o pagamento do valor total da reserva via PIX para confirmar a reserva!");
        }
    }
}