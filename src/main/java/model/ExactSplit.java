package model;

public class ExactSplit extends  Split {
    private double amount;
    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }
}
