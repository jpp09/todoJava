import br.com.xpto.modelo.Planner;

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
            System.out.println("""
                    \n1 - Criar um planner
                    2 - Visualizar planner
                    3 - Excluir um planner
                    4 - Adicionar uma tarefa - EM BREVE
                    5 - Concluir uma tarefa - EM BREVE
                    6 - Remover uma tarefa - EM BREVE
                    7 - Exibir completamente uma tarefa - EM BREVE
                    8 - Sair
                    """);
            choice = inputInt.nextInt();

            switch (choice){
                case 1:
                    Planner createPlanner = new Planner();
                    System.out.println("\n-- Digite o nome do seu planner --");
                    String nome = inputString.nextLine();
                    createPlanner.setNome(nome);
                    plannerList.add(createPlanner);
                    int id = plannerList.size();
                    createPlanner.setId(id);
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
            }

        }
        System.out.println("-- Obrigado por utilizar nosso programa --");
    }

}
