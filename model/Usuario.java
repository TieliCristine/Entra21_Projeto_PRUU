package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static principal.PrincipalPombo.*;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;
    private ArrayList<Pruu> pruus = new ArrayList();


    // ------------------------------------------- CONSTRUTOR --------------------------------------------------//

    public Usuario(String nome, String cpf, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
    }


    // -------------------------------------------- METODOS ----------------------------------------------------//



    public void pruuar(){
        teclado.nextLine();
        System.out.println("Digite a mensagem que deseja enviar: ");
        String texto = teclado.nextLine();
        if(texto.length() < 1 || texto.length() > 300){
            System.out.println("O texto deve ter no minimo 1 caracter e no maximo 300 caracteres. Impossivel criar o seu Pruu.");
        } else {
            Pruu pruu = new Pruu(texto, this.getNome());
            pruus.add(pruu);
            todosOsPruus.add(pruu);
        }
    }


    public void darLike(){
        System.out.println("Qual o ID do Pruu que deseja dar like? ");
        int id = teclado.nextInt();
        for (int u = 0; u < usuarios.size(); u++) {
            for (int i = 0; i < usuarios.get(u).getPruus().size(); i++) {
                if (usuarios.get(u).getPruus().get(i).getId() == id && usuarios.get(u).getPruus().get(i).isBloqueado() == false) {
                    usuarios.get(u).getPruus().get(i).setLikes(usuarios.get(u).getPruus().get(i).getLikes() + 1);
                } else if(usuarios.get(u).getPruus().get(i).isBloqueado()){
                    System.out.println("Impossivel dar like em um pruu bloqueado!");
                }
            }
        }
    }


    // -------------------------------------------- TO STRING --------------------------------------------------//

    @Override
    public String toString() {
        return "Usuario: nome='" + this.getNome() + '\'' + ", login='" + this.getLogin() + '\'' + ", cpf='" + this.getCpf() + '\'' + ", pruus=" + this.getPruus();
    }


    // ---------------------------------------- GETTERS AND SETTERS --------------------------------------------//


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pruu> getPruus() {
        return pruus;
    }

    public void setPruus(ArrayList<Pruu> pruus) {
        this.pruus = pruus;
    }

}
