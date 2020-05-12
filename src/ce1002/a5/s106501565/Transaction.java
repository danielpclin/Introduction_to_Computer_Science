package ce1002.a5.s106501565;

public class Transaction {
    private final String name;
    private int income;
    private int pay;

    public Transaction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        if (income < 0){
            throw new IllegalArgumentException("Income must be positive");
        }
        this.income = income;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        if (pay < 0){
            throw new IllegalArgumentException("Pay must be positive");
        }
        this.pay = pay;
    }
}
