package principal;

import static principal.PrincipalPombo.administradores;
import static principal.PrincipalPombo.usuarios;

public class Verificacoes {



    public static boolean nomeJaCadastrado(String nome) {
        boolean jaCadastrado = false;
        if(testaUsuarioNome(nome) == true || testaAdmNome(nome) == true){
            jaCadastrado = true;
        } else {
            jaCadastrado = false;
        }
        return jaCadastrado;
    }

    public static boolean testaUsuarioNome(String nome){
        boolean testado = false;
        for (int u = 0; u < usuarios.size(); u++) {
            if (usuarios.get(u).getNome().equals(nome)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }


    public static boolean testaAdmNome(String nome){
        boolean testado = false;
        for (int u = 0; u < administradores.size(); u++) {
            if (usuarios.get(u).getNome().equals(nome) || administradores.get(u).getLogin().equals(nome)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }



    public static boolean cpfJaCadastrado(String cpf) {
        boolean jaCadastrado = false;
        if(testaUsuarioCpf(cpf) == true || testaAdmCpf(cpf) == true){
            jaCadastrado = true;
        } else {
            jaCadastrado = false;
        }
        return jaCadastrado;
    }

    public static boolean testaUsuarioCpf(String cpf){
        boolean testado = false;
        for (int u = 0; u < usuarios.size(); u++) {
            if (usuarios.get(u).getCpf().equals(cpf)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }


    public static boolean testaAdmCpf(String cpf){
        boolean testado = false;
        for (int u = 0; u < administradores.size(); u++) {
            if (usuarios.get(u).getCpf().equals(cpf) || administradores.get(u).getCpf().equals(cpf)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }


    public static boolean loginJaCadastrado(String login) {
        boolean jaCadastrado = false;
        if(testaUsuarioLogin(login) == true || testaAdmLogin(login) == true){
            jaCadastrado = true;
        } else {
            jaCadastrado = false;
        }
        return jaCadastrado;
    }

    public static boolean testaUsuarioLogin(String login){
        boolean testado = false;
        for (int u = 0; u < usuarios.size(); u++) {
            if (usuarios.get(u).getLogin().equals(login)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }


    public static boolean testaAdmLogin(String login){
        boolean testado = false;
        for (int u = 0; u < administradores.size(); u++) {
            if (usuarios.get(u).getLogin().equals(login) || administradores.get(u).getLogin().equals(login)){
                testado = true;
            }
            else {
                testado = false;
            }
        }
        return testado;
    }

}
