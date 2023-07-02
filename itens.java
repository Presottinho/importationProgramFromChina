import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class itens{

    List<String> itens = new ArrayList<>();
    List<Double> prices = new ArrayList<>();

    public void adicionarItens(String item, double price){
        itens.add(item);
        prices.add(price);

    }

}