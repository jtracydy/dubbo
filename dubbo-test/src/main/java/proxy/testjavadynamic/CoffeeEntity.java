package proxy.testjavadynamic;


import lombok.Data;

import java.util.List;

@Data
public class CoffeeEntity {

    private String name;

    private List<CoffeeParams> coffeeParams;

    @Data
    class CoffeeParams{
        private String price;

        private String capaciy;

        public CoffeeParams(String price, String capaciy) {
            this.price = price;
            this.capaciy = capaciy;
        }
    }

}
