package br.com.xpto.modelo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Planner {
    private String nome;
    private int id;
    private ArrayList<Tarefa> tarefaList = new ArrayList<Tarefa>();
    private Scanner input = new Scanner(System.in);

    //Set do nome do meu planner
    public void  setNome(String nome,int id){
        this.nome = nome;
        String choice;
        System.out.println(String.format("Você deseja mesmo colocar %s como nome do planner? - [sim/não]",nome));
        setId(id);
        while (true) {
            choice = input.nextLine();
            if (choice.toLowerCase().equals("não")) {
                System.out.println("-- Digite o outro nome para o planner --  ");
                nome = input.nextLine();
                this.nome = nome;
                break;
            }else if(choice.toLowerCase().equals("sim")){
                System.out.println(String.format("-- Ok, %s mantido como nome do planner -- ",nome));
                break;
            }
        }
    }

    //Set id do meu planner
    private void setId(int id){
        this.id = id;
    }

    //Visualização das informações do planner
    public void getinfo(){
        System.out.println(String.format("Nome do Planner: %s\nID do Planner: %d",this.nome,this.id));
    }

    private void setTarefas(Tarefa objeto){
        this.tarefaList.add(objeto);
    }

    public void setTarefaList(Tarefa tarefa){
        this.tarefaList.add(tarefa);
        System.out.println("-- Tarefa criada com sucesso --");
    }

    public int getIdTarefa(){
        return this.tarefaList.size() + 1;
    }

    public void getTarefas(){
        for (Tarefa tarefa : tarefaList){
            tarefa.getInfo();
        }
    }
}
