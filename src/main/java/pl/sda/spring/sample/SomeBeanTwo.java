package pl.sda.spring.sample;

import lombok.ToString;

@ToString
public class SomeBeanTwo {

    private SomeBean someBean;

    public SomeBeanTwo(SomeBean someBean) {
        this.someBean = someBean;
    }
}
