import br.com.xpto.modelo.Planner;
import br.com.xpto.modelo.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        ArrayList<Planner> plannerList = new ArrayList<Planner>();

        int choice = 0;
        System.out.println("-- Bem vindo a Lista de tarefas XPTO --");
        while(choice != 8){
            System.out.println("\n1 - Criar um planner\n2 - Visualizar planner\n3 - Excluir um planner\n4 - Criar tarefa\n5 - Listar tarefas\n6 - Concluir uma tarefa\n7 - Sair");
            choice = inputInt.nextInt();

            switch (choice){
                //Criar um planner
                case 1:
                    Planner createPlanner = new Planner();
                    System.out.println("\n-- Digite o nome do seu planner --");
                    String nomePlanner = inputString.nextLine();
                    createPlanner.setNome(nomePlanner,plannerList.size() + 1);
                    plannerList.add(createPlanner);
                    break;
                //Listar todos os planner
                case 2:
                    if(plannerList.isEmpty()){
                        System.out.println("\n-- Crie um planner primeiro --");
                    }else{
                        System.out.println("\n-- Planner Ativos -- ");
                        for (Planner planner : plannerList){
                            planner.getinfo();
                        }
                    }

                    break;
                //Excluir uma planner
                case 3:
                    if(plannerList.isEmpty()){
                        System.out.println("\n--Crie um planner primeiro --");
                    }else{
                        System.out.println("\n-- Digite o ID do planner para excluir -- ");
                        for (Planner planner : plannerList){
                            planner.getinfo();
                        }
                        int idRemove = inputInt.nextInt() - 1;
                        if(plannerList.get(idRemove).getTarefaList().isEmpty()){
                            plannerList.remove(idRemove);
                            System.out.println("\n-- Lista atualizada de Planner's -- ");
                            for (Planner planner : plannerList){
                                planner.getinfo();
                            }
                        }else{
                            System.out.println("\n-- Você não pode excluir esse planner --");
                            System.out.println("\n-- Conclua todas as tarefas --");
                        }

                    }
                    break;
                //Criar uma tarefa
                case 4:
                    if(plannerList.isEmpty()){
                        System.out.println("\n-- Cria um planner primeiro --");
                    }else{
                        //Mostrar quais os planos ativos
                        System.out.println("\n-- Escolha um dos planner abaixo -- ");
                        //Iteração entre os planner
                        for (Planner planner : plannerList){
                            planner.getinfo();
                        }
                        //Selecionar qual é o plano
                        int idChoice = inputInt.nextInt();
                        Planner plannerChoice = plannerList.get(idChoice -1);
                        System.out.println("\n-- Escreva o nome da sua tarefa -- ");
                        Tarefa createTarefa = new Tarefa();
                        System.out.println("Digite o nome da tarefa: ");
                        String nomeTarefa = inputString.nextLine();
                        createTarefa.setNome(nomeTarefa,plannerChoice.getIdTarefa());
                        plannerChoice.setTarefaList(createTarefa);
                    }
                    break;
                //Listar as tarefas
                case 5:
                    if(plannerList.isEmpty()){
                        System.out.println("\n-- Crie uma tarefa primeiro --");
                    }else{
                        for(Planner planner :plannerList){
                            System.out.println(String.format("\n-- Listando as tarefas do planner: %s --",planner.getNome()));
                            planner.getTarefas();
                        };
                    }
                    break;
                //Concluir uma tarefa
                case 6:
                    if(plannerList.isEmpty()){
                        System.out.println("\n-- Cria um planner primeiro --");
                    }else{
                        for(Planner planner : plannerList){
                            if(planner.getTarefaList().isEmpty()){
                                System.out.println("-- Crie uma tarefa primeiro --");
                            }else{
                                System.out.println("\n--Escolha uma tarefa para remover --");
                                planner.getTarefas();
                                int idRemoverTarefa = inputInt.nextInt() - 1;
                                planner.removeTarefa(idRemoverTarefa);
                            }
                        }
                    }

                    break;

            }

        }
        System.out.println("-- Obrigado por utilizar nosso programa --");
    }



}
