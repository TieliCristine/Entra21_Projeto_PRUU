package model;

import static principal.PrincipalPombo.usuarios;


public class Administrador extends Usuario {



    // ------------------------------------------- CONSTRUTOR --------------------------------------------------//

    public Administrador(String nome, String cpf, String login) {
        super(nome, cpf, login);
    }


    // -------------------------------------------- METODOS ----------------------------------------------------//



    public void bloquearPruu(int id){

        for (int u = 0; u < usuarios.size(); u++) {
            for (int i = 0; i < usuarios.get(u).getPruus().size(); i++) {
                if (usuarios.get(u).getPruus().get(i).getId() == id) {
                    usuarios.get(u).getPruus().get(i).setBloqueado(true);
                }
            }
        }
    }


//    public void desbloquearPruu(int id){
//        for (int u = 0; u < usuarios.size(); u++) {
//            for (int i = 0; i < usuarios.get(u).getPruus().size(); i++) {
//                if (usuarios.get(u).getPruus().get(i).getId() == id) {
//                    usuarios.get(u).getPruus().get(i).setBloqueado(false);
//                }
//            }
//        }
//    }


    // -------------------------------------------- TO STRING --------------------------------------------------//

    @Override
    public String toString() {
        return "Administrador: nome='" + this.getNome() + '\'' + ", login='" + this.getLogin() + '\'' + ", cpf='" + this.getCpf() + '\'' + ", pruus=" + this.getPruus();
    }


}
