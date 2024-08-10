package spring.practical.objects.ch1.step01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private BigDecimal amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(BigDecimal amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {
        return this.tickets.removeFirst();
    }

    public void minusAmount(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    private void plusAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    public void sellTicketTo(Audience audience) {
        Ticket ticket = this.getTicket();
        BigDecimal fee = audience.buy(ticket);
        this.plusAmount(fee);
    }

}
