package de.dummy;

import java.util.ArrayList;
import java.util.List;

public class DummyLib {

    public List<DummyBean> getDummyBeans() {
        List<DummyBean> beans = new ArrayList<>();

        beans.add(new DummyBean("Otto"));
        beans.add(new DummyBean("Frank"));
        beans.add(new DummyBean("Thomas"));
        beans.add(new DummyBean("John"));
        beans.add(new DummyBean("Conner"));
        return beans;
    }
}
