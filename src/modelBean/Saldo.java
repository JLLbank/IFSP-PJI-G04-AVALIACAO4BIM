package modelBean;

import view.Tela;
import modelDAO.DataBase;

public class Saldo {
    public void Consulta(){
        Tela tela = new Tela();
        DataBase db = new DataBase();
        String conta;
        boolean aux=false;

        conta = tela.digiteConta();

        for(int i=0; i<6; i++){
            if(conta.equals(db.getConta(i))){
                tela.mostraSaldo(i);
                aux=true;
                break;
            }
        }
        if(aux==false){
            tela.opcaoInvalida();
        }
    }
}
