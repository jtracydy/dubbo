package generic;

import java.util.Collection;

public class ServiceImpl implements Service{

    @Override
    public Collection<? super Animal> getSup(Collection<? super Bird> collection) {

        return null;
    }

    @Override
    public Collection<? super Animal> getExt(Collection<? extends Bird> collection) {
        return null;
    }
}
