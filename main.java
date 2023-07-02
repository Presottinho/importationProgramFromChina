import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class main{

    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        Itens itens = new Itens();

        int continua = 1;

        do{

            menu.menu();
            int option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println("Digite o item desejado:");
                    String item = input.next();
                    System.out.println("Digite o preço em Yuan:");
                    double price = input.nextDouble();
                    itens.add(item);
                    break;

                case 2:

                    break;
                
                case 3:
                    
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
