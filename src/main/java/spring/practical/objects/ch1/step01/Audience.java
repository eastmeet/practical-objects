package spring.practical.objects.ch1.step01;

import lombok.Getter;

@Getter
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

}
