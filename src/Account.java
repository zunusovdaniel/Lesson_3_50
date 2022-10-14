public class Account {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double som) {
        amount += som;
        System.out.println("�� ��������� " + som);
    }

    public void withDraw(int sum) throws AmountException {
        if (amount < sum) {
            throw new AmountException("�� ����� ����� ������������ �������:", amount);
        } else {
            System.out.println("�� ������ ����� �� �����: " + sum);
            amount -= sum;
            System.out.println("�� ����� �� �����: " + sum);
        }
    }
}

