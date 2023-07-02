import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class itens{

    List<String> itens = new ArrayList<>();
    List<Double> prices = new ArrayList<>();

    public void addItens(String item, double price){
        itens.add(item);
        prices.add(price);

    }

    public void showItens(double cotacao, double frete){
        double total = 0;
        System.out.println("-------------------------------------");
        for(int i = 0; i < itens.size(); i++){
            System.out.println((i + 1) + "." + itens.get(i) + " - " + "R$" + (prices.get(i) * cotacao));
            total = total + (prices.get(i) * cotacao);
        }
        System.out.println("-------------------------------------");
        System.out.println("Valor total: R$" + total + " | Frete: " + (frete * cotacao) + " | Valor total com frete: R$" + (total + (frete * cotacao)));
        System.out.println("-------------------------------------");
    }

    public void exhibitionItem(){
        System.out.println("-------------------------------------");
        for(int i = 0; i < itens.size(); i++){
            System.out.println((i + 1) + "." + itens.get(i) + " - " + "R$" + prices.get(i));
        }
        System.out.println("-------------------------------------");
    }

    public void editItem(int change, String newItem, double newPrice){
        for(int i = 0; i < itens.size(); i++){
            if((change - 1) == i){
                itens.remove(i);
                prices.remove(i);
                itens.add(newItem);
                prices.add(newPrice);
            }
        }
    }
}