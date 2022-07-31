package model;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Pruu {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private int id;
    private String texto;
    private Date dataPublicacao;
    private int likes;
    private boolean bloqueado;
    private String nomeUsuario;
    public static int counterPruu = 1;




    // ------------------------------------------- CONSTRUTOR --------------------------------------------------//

    public Pruu(String texto, String nomeUsuario) {
        this.id = counterPruu++;
        this.texto = texto;
        this.dataPublicacao = new Date();
        this.likes = 0;
        this.bloqueado = false;
        this.nomeUsuario = nomeUsuario;
    }


    // -------------------------------------------- TO STRING --------------------------------------------------//

    @Override
    public String toString() {
        return "Pruu id = " + this.id + ", texto = '" + this.getTexto() + '\'' + ", Data de Publicacao = " + formato.format(this.dataPublicacao) + ", likes = " + this.likes + ", Nome do Usuario = '" + this.nomeUsuario + '\'';
    }


    // ---------------------------------------- GETTERS AND SETTERS --------------------------------------------//


    public int getId() {
        return id;
    }


    public String getTexto() {
        if(this.isBloqueado()){
            this.setTexto(" [--- Texto bloqueado pelo Administrador ---] ");
            return this.texto;
        } else {
            return this.texto;
        }
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDataPublicacao() {
        return formato.format(this.dataPublicacao);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        if(bloqueado){
            this.bloqueado = true;
        } else {
            this.bloqueado = false;
        }

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

}
