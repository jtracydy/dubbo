import com.dubbo.es.entity.City;
import com.dubbo.es.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springmvc-es.xml"})
public class EsServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    public void test(){
        City city = new City();
        city.setId(1L);
        city.setDescription("霧霾大");
        city.setName("北京");
        city.setScore(123);
        cityService.saveCity(city);
    }
}
