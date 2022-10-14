public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double som) {
        amount += som;
        System.out.println("вы пополн€ли " + som);
    }

    public void withDraw(int sum) throws AmountException {
        if (amount < sum) {
            throw new AmountException("на вашем счету недостаточно средств:", amount);
        } else {
            System.out.println("¬ы можете сн€ть со счета: " + sum);
            amount -= sum;
            System.out.println("¬ы сн€ли со счета: " + sum);
        }
    }
}

