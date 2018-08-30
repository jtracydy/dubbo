package generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Service service = new ServiceImpl();

        List<Bird> bird = new ArrayList<>();
        service.getExt(bird);
        service.getSup(bird);

        Set<Animal> setAni = new HashSet<>();
        //service.getExt(set);
        service.getSup(setAni);


        LinkedList<XiQue> xiQues = new LinkedList<>();
        service.getExt(xiQues);
        //service.getSup(xiQues);

    }
}
