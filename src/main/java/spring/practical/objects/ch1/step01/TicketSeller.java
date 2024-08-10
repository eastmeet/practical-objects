package spring.practical.objects.ch1.step01;

import lombok.Getter;

import java.math.BigDecimal;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Bag bag = audience.getBag();
        Ticket ticket = this.ticketOffice.getTicket();

        if (!bag.hasInvitation()) {
            BigDecimal fee = ticket.getFee();
            bag.minusAmount(fee);
            this.ticketOffice.plusAmount(fee);
        }

        bag.setTicket(ticket);
    }

}
