package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 27-Nov-15.
 */
public class MainAdapter {
    public static void main(String[] args) {

        //ProductRepository return Costable, but CalculatorUtil work with Priceble
        //So we will wrap Costable to Priceble by Adaptor

        ProductRepository productRepository = new ProductRepository();
        List<Priceble> costableList = new ArrayList<>();

        for(int i=0; i<10; i++){
            Costable product = productRepository.getProduct();
            costableList.add(new Adapter(product));
        }

        int totalCost = CalculatorUtil.calculateCost(costableList);
    }
}
