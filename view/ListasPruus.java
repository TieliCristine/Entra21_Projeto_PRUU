package view;

import model.Pruu;
import model.Usuario;

import static model.Pruu.counterPruu;
import static principal.Controller.localizaAdministrador;
import static principal.Controller.localizaUsuario;
import static principal.PrincipalPombo.*;

public class ListasPruus {


    private static int opcao;


    // -------------------------------------------- METODOS ----------------------------------------------------//


    public void mostraTodosPruus() {
        if ((counterPruu == 1)) {
            System.out.println("Nao foi possivel mostrarmos os Pruus! ");
            System.out.println("Ainda nao recebemos. Mande-nos um! ");
            System.out.println();
        } else {
            for (int i = 0; i < todosOsPruus.size(); i++) {
                System.out.println(todosOsPruus.get(i).toString());
            }
        }
            System.out.println();
            System.out.println("Deseja dar um like em algum Pruu? [1 - Sim / 0 - Nao]");
            this.setOpcao(teclado.nextInt());
            if (this.getOpcao() == 1) {
                usuarios.get(0).darLike();
            }
    }


    public void mostraPruusPorUsuario() {
        if (counterPruu == 1) {
            System.out.println("Nao foi possivel mostrarmos os Pruus! ");
            System.out.println("Ainda nao recebemos. Mande-nos um! ");
            System.out.println();
        } else {
            System.out.println("Digite o login do usuario que deseja localizar: ");
            int index = localizaUsuario(teclado.next());
            for (int c = 0; c < usuarios.get(index).getPruus().size(); c++) {
                System.out.println(usuarios.get(index).getPruus().get(c).toString());
            }
            System.out.println();
            if (!(counterPruu == 1)) {
                System.out.println("Deseja dar um like em algum Pruu? [1 - Sim / 0 - Nao]");
                this.setOpcao(teclado.nextInt());
                if (this.getOpcao() == 1) {
                    usuarios.get(0).darLike();
                } else {
                    System.out.println("Nao foi possivel mostrarmos os Pruus! ");
                    System.out.println("Ainda nao recebemos. Mande-nos um! ");
                    System.out.println();
                }
            }
        }
    }


    public void mostraPruusPorAdministrador() {
        if (!(counterPruu == 1)) {
            System.out.println("Nao foi possivel mostrarmos os Pruus! ");
            System.out.println("Ainda nao recebemos. Mande-nos um! ");
            System.out.println();
        } else {
            System.out.println("Digite o login do administrador que deseja localizar: ");
            int index = localizaAdministrador(teclado.next());
            for (int c = 0; c < administradores.get(index).getPruus().size(); c++) {
                System.out.println(administradores.get(index).getPruus().get(c).toString());
            }
            System.out.println();
            if (!(counterPruu == 1)) {
                System.out.println("Deseja dar um like em algum Pruu? [1 - Sim / 0 - Nao]");
                this.setOpcao(teclado.nextInt());
                if (this.getOpcao() == 1) {
                    usuarios.get(0).darLike();
                } else {
                    System.out.println("Nao foi possivel mostrarmos os Pruus! ");
                    System.out.println("Ainda nao recebemos. Mande-nos um! ");
                    System.out.println();
                }
            }
        }
    }


    public void mostraTodosUsuarios() {
        if(usuarios.isEmpty()){
            System.out.println("Ainda nao foi cadastrado nenhum usuario. Por favor, cadastre algum atraves do menu principal!");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println("Pos " + i + " - " + usuarios.get(i).toString());
            }
        }
    }


    public void mostraTodosAdministradores() {
        if(administradores.isEmpty()){
            System.out.println("Ainda nao foi cadastrado nenhum administrador. Por favor, cadastre algum atraves do menu principal!");
        } else {
            for (int i = 0; i < administradores.size(); i++) {
                System.out.println("Pos " + i + " - " + administradores.get(i).toString());
            }
        }
    }


    public void mostraTodosCadastrados() {
        mostraTodosUsuarios();
        mostraTodosAdministradores();
    }


    // ---------------------------------------- GETTERS AND SETTERS --------------------------------------------//

    public static int getOpcao() {
        return opcao;
    }

    public static void setOpcao(int opcao) {
        ListasPruus.opcao = opcao;
    }

}
