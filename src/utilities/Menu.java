package utilities;

import view.Tela;
import modelBean.Saldo;

public class Menu {
    public void menu(){
        Tela tela = new Tela();
        Saldo saldo = new Saldo();

        boolean exit = false;

        do{
            switch(tela.escolha()){
                case 0:
                    saldo.Consulta();
                    break;
                case 1:
                    tela.naoDisponivel();
                    break;
                case 2:
                    tela.naoDisponivel();
                    break; 
                case 3:
                    exit = true;
                    break;
                default:
                    tela.opcaoInvalida();
                    break;                   
            }
        }while(exit == false);
    }
}
