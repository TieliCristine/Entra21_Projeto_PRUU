package principal;

import model.Administrador;
import model.Usuario;
import view.ListasPruus;
import view.Menu;
import java.util.ArrayList;
import java.util.Scanner;


public class PrincipalPombo {


    public static Scanner teclado = new Scanner(System.in);
    static Menu menu = new Menu();
    static ListasPruus listas = new ListasPruus();
    public static Controller controller = new Controller();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Administrador> administradores = new ArrayList<>();



    public static void main(String[] args) {

        do {
            menu.menuPrincipal();
            switch (controller.getOpcaoMenuPrincipal()) {
                case 1:
                    menu.MenuAreaUsuario();
                    switch (controller.getOpcaoCadastroUsuario()) {
                        case 1:
                            usuarios.add(controller.cadastraUsuario());
                            break;
                        case 2:
                            controller.twillar();
                            break;
                        case 3:
                            listas.mostraTodosPruus();
                            break;
                        case 4:
                            listas.mostraPruusPorUsuario();
                            break;
//                        case 5:
//                            usuarios.get(0).darLike();
//                            break;
                        case 5:
                            listas.mostraTodosUsuarios();
                            break;
                    }
                    break;
                case 2:
                    menu.MenuAreaAdm();
                    switch (controller.getOpcaoCadastroAdm()) {
                        case 1:
                            administradores.add(controller.cadastraAdministrador());
                            break;
                        case 2:
                            controller.twillar();
                            break;
                        case 3:
                            listas.mostraTodosPruus();
                            break;
                        case 4:
                            listas.mostraPruusPorUsuario();
                            break;
                        case 5:
                            controller.block();
                            break;
                        case 6:
                            listas.mostraTodosAdministradores();
                            break;
                        case 7:
                            listas.mostraTodosCadastrados();
                            break;
                    }
                    break;
            }
        } while (controller.getOpcaoMenuPrincipal() != 0);
        System.out.println("Esperamos que voce volte logo... Ate mais!! ");


        //----------------------------------------------------------------------------------------------------//



    }


}
