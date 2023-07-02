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
                    System.out.println("Digite o preço em Yuan:");
                    double price = input.nextDouble();
                    itens.addItens(item, price);
                break;

                case 2:
                    itens.exhibitionItem();
                    System.out.println("Digite o numer o correspondente ao item que deseja editar: ");
                    int change = input.nextInt();
                    System.out.println("Digite o novo nome do item: ");
                    String newItem = input.next();
                    System.out.println("Digite o novo valor do item: ");
                    double  newPrice = input.nextDouble();
                    itens.editItem(change, newItem, newPrice);
                    
                break;
                
                case 3:
                    System.out.println("Digite o frete em Yuan: ");
                    double frete = input.nextDouble();
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
                    System.out.println("Opção Inválida, tente novamente.");
                break;
            }

        }while(continua == 1);

    }
    }
