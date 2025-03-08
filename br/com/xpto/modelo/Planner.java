package br.com.xpto.modelo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Planner {
    private String nome;
    private int id;
    private ArrayList<Tarefa> tarefaList = new ArrayList<Tarefa>();
    Scanner input = new Scanner(System.in);

    //Set do nome do meu planner
    public void  setNome(String nome){
        this.nome = nome;
        String choice;
        System.out.println("Você deseja mesmo colocar %s como nome do planner? - [sim/não]".formatted(nome));
        while (true) {
            choice = input.nextLine();
            if (choice.toLowerCase().equals("não")) {
                System.out.println("-- Digite o outro nome para o planner --  ");
                nome = input.nextLine();
                this.nome = nome;
                break;
            }else if(choice.toLowerCase().equals("sim")){
                System.out.println("-- Ok, %s mantido como nome do planner -- ".formatted(nome));
                break;
            }
        }
    }

    //Set id do meu planner
    public void setId(int id){
        this.id = id;
    }

    //Visualização das informações do planner
    public void getinfo(){
        System.out.println("Nome do Planner: %s\nID do Planner: %d".formatted(this.nome,this.id));
    }

}
