package spring.practical.objects.ch1.step01;

import java.math.BigDecimal;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        Bag bag = audience.getBag();
        TicketOffice ticketOffice = ticketSeller.getTicketOffice();
        Ticket ticket = ticketOffice.getTicket();

        if (!bag.hasInvitation()) {
            BigDecimal fee = ticket.getFee();
            bag.minusAmount(fee);
            ticketOffice.plusAmount(fee);
        }
        
        bag.setTicket(ticket);
    }

}
