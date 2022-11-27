package controller;

import view.Tela;
import utilities.Menu;

public class ClassePrincipal{
    public static void main(String[] args){
        Tela tela = new Tela();
        Menu menu = new Menu();

        tela.bemVindo();
        menu.menu();
    }
}