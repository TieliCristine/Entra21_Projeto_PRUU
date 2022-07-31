package principal;

import model.Administrador;
import model.Usuario;
import static principal.PrincipalPombo.*;
import static principal.Verificacoes.*;

public class Controller {

    private static int opcaoMenuPrincipal;
    private static int opcaoCadastroUsuario;
    private static int opcaoCadastroAdm;
    private String txt;

    public Usuario cadastraUsuario() {
        String nome;
        String cpf;
        String login;

        do {
            System.out.println("Digite o nome do usuario: ");
            nome = teclado.next();
            nome.toLowerCase();
            if(nomeJaCadastrado(nome)){
                System.out.println("O nome inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (nomeJaCadastrado(nome));

        do {
            System.out.println("Digite o cpf do usuario: ");
            cpf = teclado.next();
            if(cpfJaCadastrado(cpf)){
                System.out.println("O cpf inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (cpfJaCadastrado(cpf));

        do {
            System.out.println("Digite o login do usuario: ");
            login = teclado.next();
            login.toLowerCase();
            if(loginJaCadastrado(login)){
                System.out.println("O login inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (loginJaCadastrado(login));

        Usuario usuario = new Usuario(nome, cpf, login);
        return usuario;
    }


    public Administrador cadastraAdministrador() {
        String nome;
        String cpf;
        String login;

        do {
            System.out.println("Digite o nome do administrador: ");
            nome = teclado.next();
            nome.toLowerCase();
            if(nomeJaCadastrado(nome)){
                System.out.println("O nome inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (nomeJaCadastrado(nome));

        do {
            System.out.println("Digite o cpf do administrador: ");
            cpf = teclado.next();
            if(cpfJaCadastrado(cpf)){
                System.out.println("O cpf inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (cpfJaCadastrado(cpf));

        do {
            System.out.println("Digite o login do administrador: ");
            login = teclado.next();
            login.toLowerCase();
            if(loginJaCadastrado(login)){
                System.out.println("O login inserido ja consta em nossa base de dados. Por favor tente novamente.");
                System.out.println();
            }
        } while (loginJaCadastrado(login));

        Administrador administrador = new Administrador(nome, cpf, login);
        return administrador;
    }


    public static void twillar() {
        System.out.println("Digite o login de quem ira pruuar: ");
        if (controller.getOpcaoMenuPrincipal() == 1) {
            int index = localizaUsuario(teclado.next());
            if (index >= 0){
                usuarios.get(index).pruuar();
            } else {
                System.out.println("Login nao encontrado!");
            }
        } else {
            int index = localizaAdministrador(teclado.next());
            if (index >= 0){
                administradores.get(index).pruuar();
            } else {
                System.out.println("Login nao encontrado!");
            }
        }
    }


    public static void block() {
        System.out.println("Digite o login do administrador que ira realizar o bloqueio: ");
        int i = localizaAdministrador(teclado.next());

        for (int a = 0; a < usuarios.size(); a++) {
            for (int c = 0; c < usuarios.get(a).getPruus().size(); c++) {
                System.out.println(usuarios.get(a).getPruus().get(c).toString());
            }
        }

        System.out.println();
        System.out.println("Digite o id do Pruu que deseja bloquear ");
        administradores.get(i).bloquearPruu(teclado.nextInt());
    }

    public static int localizaUsuario(String login) {
        int index = -1;
        for (int u = 0; u < usuarios.size(); u++) {
            if(usuarios.get(u).getLogin().equals(login)){
                index = u;
            }
        }
        return index;
    }

    public static int localizaAdministrador(String login) {
        int index = 0;
        for (int u = 0; u < administradores.size(); u++) {
            if (administradores.get(u).getLogin().equals(login)) {
                index = u;
            }
        }
        return index;
    }

    //----------------------------------------- GETTERS AND SETTERS ------------------------------------------//


    public static int getOpcaoMenuPrincipal() {
        return opcaoMenuPrincipal;
    }
    public static void setOpcaoMenuPrincipal(int opcaoMenuPrincipal) {
        Controller.opcaoMenuPrincipal = opcaoMenuPrincipal;
    }
    public static int getOpcaoCadastroUsuario() {
        return opcaoCadastroUsuario;
    }
    public static void setOpcaoCadastroUsuario(int opcaoCadastroUsuario) {
        Controller.opcaoCadastroUsuario = opcaoCadastroUsuario;
    }
    public static int getOpcaoCadastroAdm() {
        return opcaoCadastroAdm;
    }
    public static void setOpcaoCadastroAdm(int opcaoCadastroAdm) {
        Controller.opcaoCadastroAdm = opcaoCadastroAdm;
    }
    public String getTxt() {
        return txt;
    }
    public void setTxt(String txt) {
        this.txt = txt;
    }
}
