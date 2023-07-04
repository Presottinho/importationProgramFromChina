import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class main{

    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        itens itens = new itens();
        double frete = 0;

        int continua = 1;

        System.out.println("Digite a cotacao do Yuan: ");
        double cotacao = input.nextDouble();

        do{

            menu.menu();
            int option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println("Digite o item desejado:");
                    String item = input.next();
                    System.out.println("Digite o preco em Yuan:");
                    double price = input.nextDouble();
                    itens.addItens(item, price);
                break;

                case 2:
                    itens.exhibitionItem();
                    String newItem;
                    double  newPrice;
                    System.out.println("-------------------------------------");
                    System.out.println("Digite o numero o correspondente ao item que deseja editar: ");
                    System.out.println("-------------------------------------");
                    int change = input.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("O que deseja editar? 1 - Nome | 2 - Preco | 3 - Ambos");
                    System.out.println("-------------------------------------");
                    int edit = input.nextInt();
                    if(edit == 1){
                        System.out.println("-------------------------------------");
                        System.out.println("Digite o novo nome do item: ");
                        System.out.println("-------------------------------------");
                        newItem = input.next();
                        newPrice = -1967.43232;
                        itens.editItem(change, newItem, newPrice);
                    }else if(edit == 2){
                        System.out.println("-------------------------------------");
                        System.out.println("Digite o novo valor do item: ");
                        System.out.println("-------------------------------------");
                        newPrice = input.nextDouble();
                        newItem = null;
                        itens.editItem(change, newItem, newPrice);
                    }else if(edit == 3){
                        System.out.println("-------------------------------------");
                        System.out.println("Digite o novo nome do item: ");
                        System.out.println("-------------------------------------");
                        newItem = input.next();
                        System.out.println("-------------------------------------");
                        System.out.println("Digite o novo valor do item: ");
                        System.out.println("-------------------------------------");
                        newPrice = input.nextInt();
                        itens.editItem(change, newItem, newPrice);
                    }else{
                        System.out.println("Opcao invalida. Tente novamente!");
                    }
                    
                    
                break;
                
                case 3:
                    if(frete == 0){
                        System.out.println("Digite o frete em Yuan: ");
                        frete = input.nextDouble();
                    }
                    itens.showItens(cotacao, frete);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                break;

                case 0:
                    continua = 0;
                break;

                default:
                    System.out.println("Opcao Invalida, tente novamente.");
                break;
            }

        }while(continua == 1);

    }
    }
