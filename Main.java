import br.com.xpto.modelo.Planner;
import br.com.xpto.modelo.Tarefa;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        ArrayList<Planner> plannerList = new ArrayList<Planner>();

        int choice = 0;
        System.out.println("-- Bem vindo a Lista de tarefas XPTO --");
        while(choice != 8){
            System.out.println("\n1 - Criar um planner\n2 - Visualizar planner\n3 - Excluir um planner\n4 - Criar tarefa - Em manutenção\n5 - Liatar tarefas - EM BREVE\n6 - Concluir uma tarefa - EM BREVE\n7 - Sair");
            choice = inputInt.nextInt();

            switch (choice){
                case 1:
                    Planner createPlanner = new Planner();
                    System.out.println("\n-- Digite o nome do seu planner --");
                    String nomePlanner = inputString.nextLine();
                    createPlanner.setNome(nomePlanner,plannerList.size() + 1);
                    plannerList.add(createPlanner);
                    break;

                case 2:
                    System.out.println("\n-- Planner Ativos -- ");
                    for (Planner planner : plannerList){
                        planner.getinfo();
                    }

                    break;

                case 3:
                    System.out.println("\n-- Digite o ID do planner para excluir -- ");
                    for (Planner planner : plannerList){
                        planner.getinfo();
                    }
                    int idRemove = inputInt.nextInt() - 1;
                    plannerList.remove(idRemove);
                    System.out.println("\n-- Lista atualizada de Planner's -- ");
                    for (Planner planner : plannerList){
                        planner.getinfo();
                    }
                    break;
                case 4:
                    //Arrumar o texto para selecionar o id
                    int idChoice = inputInt.nextInt();
                    Planner plannerChoice = plannerList.get(idChoice -1);
                    System.out.println("\n-- Escreva o nome da sua tarefa -- ");
                    Tarefa createTarefa = new Tarefa();
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = inputString.nextLine();
                    createTarefa.setNome(nomeTarefa,plannerChoice.getIdTarefa());
                    plannerChoice.setTarefaList(createTarefa);
                    break;
                case 5:
                    for(Planner planner :plannerList){
                        System.out.println(String.format("-- Listando as tarefas do planner: %s --"));
                        planner.getinfo();
                        planner.getTarefas();
                    };

            }

        }
        System.out.println("-- Obrigado por utilizar nosso programa --");
    }

}
