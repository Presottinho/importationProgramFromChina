import java.util.List;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class itens{

    List<String> itens = new ArrayList<>();
    List<Double> prices = new ArrayList<>();

    public void addItens(String item, double price){
        itens.add(item);
        prices.add(price);
    }

    public void showItens(double cotacao, double frete){
        DecimalFormat df = new DecimalFormat("###,##0.00");
        double total = 0;
        frete = (frete * cotacao);
        System.out.println("-------------------------------------");
        for(int i = 0; i < itens.size(); i++){
            System.out.println((i + 1) + "." + itens.get(i) + " - " + "R$" + (df.format(prices.get(i) * cotacao)));
            total = total + (prices.get(i) * cotacao);
        }
        System.out.println("-------------------------------------");
        System.out.println("Valor total: R$" + df.format(total) + " | Frete: " + df.format(frete)  + " | Valor total com frete: R$" + df.format(frete));
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
                if(newPrice == -1967.43232){
                    itens.remove(i);
                    itens.add(newItem);
                }else if(newItem == null){
                    prices.remove(i);
                    prices.add(newPrice);
                }else if(newItem != null && newPrice != -1967.43234){
                    itens.remove(i);
                    prices.remove(i);
                    itens.add(newItem);
                    prices.add(newPrice);
                }
            }
        }
    }
}