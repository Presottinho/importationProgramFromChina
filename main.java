import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.text.DecimalFormat;
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
                    menu.numCorrespondente();
                    int change = input.nextInt();
                    menu.chooseEdit();
                    int edit = input.nextInt();
                    if(edit == 1){
                        menu.writeNewName();
                        newItem = input.next();
                        newPrice = -1967.43232;
                        itens.editItem(change, newItem, newPrice);
                    }else if(edit == 2){
                        menu.writeNewPrice();
                        newPrice = input.nextDouble();
                        newItem = null;
                        itens.editItem(change, newItem, newPrice);
                    }else if(edit == 3){
                        menu.writeNewName();
                        newItem = input.next();
                        menu.writeNewPrice();
                        newPrice = input.nextInt();
                        itens.editItem(change, newItem, newPrice);
                    }else{
                        System.out.println("Opcao invalida. Tente novamente!");
                    }
                    
                break;
                
                case 3:
                    menu.writeFreight();
                    frete = input.nextDouble();
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
