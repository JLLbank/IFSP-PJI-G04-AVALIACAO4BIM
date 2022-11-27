package view;

import javax.swing.JOptionPane;
import modelDAO.DataBase;

public class Tela {
    DataBase db = new DataBase();

    public void bemVindo(){
        JOptionPane.showMessageDialog(null, "Bem-vindo à JLLbank");
    }

    public int escolha(){
        Object[] options = { "Saldo", "Transferencia", "Pagamento", "Sair"};
        return JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }

    public void opcaoInvalida(){
        JOptionPane.showMessageDialog(null, "Opção Inválida.","Erro",JOptionPane.WARNING_MESSAGE);
    }

    public void naoDisponivel(){
        JOptionPane.showMessageDialog(null, "Em Desenvolvimento.","Serviço não disponível.",JOptionPane.WARNING_MESSAGE);
    }

    public String digiteConta(){
        return JOptionPane.showInputDialog("Digite o número da conta: 00000-0");
    }

    public void mostraSaldo(int i){
        JOptionPane.showMessageDialog(null, "SALDO EM CONTA\n----------------------------------------------\n\n" + db.getDono(i) + "\n\nConta: " + db.getConta(i) + "\n\n\nSaldo Disponível: " + db.getValor(i) + "\n\n----------------------------------\n\n               JLLbank","Saldo",JOptionPane.DEFAULT_OPTION);
    }
}
