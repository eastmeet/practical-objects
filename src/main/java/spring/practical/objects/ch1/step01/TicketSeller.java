package spring.practical.objects.ch1.step01;

import lombok.Getter;

import java.math.BigDecimal;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = this.ticketOffice.getTicket();
        BigDecimal fee = audience.buy(ticket);
        this.ticketOffice.plusAmount(fee);
    }

}
