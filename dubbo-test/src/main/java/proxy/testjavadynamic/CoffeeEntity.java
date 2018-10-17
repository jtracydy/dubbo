package proxy.testjavadynamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 定义咖啡实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeEntity {

    private String name;

    private List<CoffeeParams> coffeeParams;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class CoffeeParams{

        private String price;

        private String capaciy;

    }

}
