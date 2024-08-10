package spring.practical.objects.ch1.step01;

import lombok.Setter;

import java.math.BigDecimal;

public class Bag {
    private BigDecimal amount;
    private Invitation invitation;

    @Setter
    private Ticket ticket;

    public Bag(BigDecimal amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, BigDecimal amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public void minusAmount(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    public void plusAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);

    }
}
