package spring.practical.objects.ch1.step01;


import java.math.BigDecimal;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public BigDecimal buy(Ticket ticket) {
        return this.bag.hold(ticket);
    }

}
