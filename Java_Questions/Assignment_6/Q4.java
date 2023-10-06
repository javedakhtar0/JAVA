import java.io.Console;

class Q4 {
    Console c = System.console();
    double amount;

    void get_amount() {
        amount = Integer.parseInt(c.readLine("Enter the Purchase Amount: "));
    }

    void display_pay() {
        System.out.print("After discount customer paid amount is= ");
        if (amount < 1000) {
            System.out.println(amount - (amount * 5 / 100));
        } else if (amount >= 1000 && amount < 3000) {
            System.out.println(amount - (amount * 10 / 100));
        } else if (amount >= 3000 && amount <= 5000) {
            System.out.println(amount - (amount * 12 / 100));
        } else if (amount > 5000) {
            System.out.println(amount - (amount * 15 / 100));
        }
    }

    public static void main(String args[]) {
        Q4 ob = new Q4();
        ob.get_amount();
        ob.display_pay();
    }
}
