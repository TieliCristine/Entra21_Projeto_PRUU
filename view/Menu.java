package view;

import static principal.PrincipalPombo.controller;
import static principal.PrincipalPombo.teclado;

public class Menu {


    // -------------------------------------------- METODOS ----------------------------------------------------//

    public static void menuPrincipal() {
        System.out.println("*******************************************************");
        System.out.println("               BEM VINDO AO TWILLER PRUUU              ");
        System.out.println("*******************************************************");
        System.out.println(" 1 - Area do Usuario");
        System.out.println(" 2 - Area do Administrador");
        System.out.println(" 0 - Sair do sistema");
        System.out.println("Selecione uma opcao acima: ");
        controller.setOpcaoMenuPrincipal(teclado.nextInt());
    }

    public static void MenuAreaUsuario() {
        System.out.println("*******************************************************");
        System.out.println("                   AREA DO USUARIO                     ");
        System.out.println("*******************************************************");
        System.out.println("1 - Cadastrar Usuario ");
        System.out.println("2 - Enviar um Pruu ");
        System.out.println("3 - Dar um like em um Pruu ");
        System.out.println("4 - Mostrar todos os Pruus de um so Usuario ");
        System.out.println("5 - Mostrar todos os Usuarios cadastrados ");
        System.out.println("Selecione uma opcao acima: ");
        controller.setOpcaoCadastroUsuario(teclado.nextInt());
    }

    public static void MenuAreaAdm() {
        System.out.println("*******************************************************");
        System.out.println("                  AREA DO ADMINISTRADOR                ");
        System.out.println("*******************************************************");
        System.out.println("1 - Cadastrar Administrador ");
        System.out.println("2 - Enviar um Pruu ");
        System.out.println("3 - Mostrar todos os Pruus");
        System.out.println("4 - Mostrar todos os Pruus de um so Usuario ");
        System.out.println("5 - Bloquear Pruu");
        System.out.println("6 - Mostrar todos os Administradores cadastrados ");
        System.out.println("7 - Mostrar todos administradores e usuarios cadastrados ");
        System.out.println("Selecione uma opcao acima: ");
        controller.setOpcaoCadastroAdm(teclado.nextInt());
    }
}
