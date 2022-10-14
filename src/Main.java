public class Main {
    public static void main(String[] args) {
        Account MBank = new Account();
        MBank.deposit(90000.00);
        while (true) {
            try {
                MBank.withDraw(30000);
            } catch (AmountException e) {
                try {
                    MBank.withDraw((int) e.getRemainingAmount());
                } catch (AmountException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }


    }
}