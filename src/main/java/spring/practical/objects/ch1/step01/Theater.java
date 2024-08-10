package spring.practical.objects.ch1.step01;

import java.math.BigDecimal;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        this.ticketSeller.sellTo(audience);
    }

}
