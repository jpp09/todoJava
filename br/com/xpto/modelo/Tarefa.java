package br.com.xpto.modelo;

import java.util.ArrayList;

public class Tarefa {
    private String nome;
    private int id;

    public void setNome(String nome,int id){
        this.nome = nome;
        this.id = id;
    }

    private void setId(int id){
        this.id = id;
    }

    public void getInfo(){
        System.out.println(String.format("Nome da Tarefa: %s\nId da Tarefa: %d",this.nome,this.id));
    }
}
