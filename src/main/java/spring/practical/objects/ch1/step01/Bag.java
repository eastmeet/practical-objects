package spring.practical.objects.ch1.step01;

import lombok.AccessLevel;
import lombok.Setter;

import java.math.BigDecimal;

public class Bag {
    private BigDecimal amount;
    private Invitation invitation;

    @Setter(value = AccessLevel.PRIVATE)
    private Ticket ticket;

    public Bag(BigDecimal amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, BigDecimal amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public BigDecimal hold(Ticket ticket) {
        BigDecimal fee;

        if (!this.hasInvitation()) {
            fee = ticket.getFee();
            this.minusAmount(fee);
        } else {
            fee = BigDecimal.ZERO;
        }

        this.setTicket(ticket);
        return fee;
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    private void minusAmount(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    public void plusAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);

    }
}
