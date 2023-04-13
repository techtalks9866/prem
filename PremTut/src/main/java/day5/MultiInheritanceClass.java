package day5;

public class MultiInheritanceClass implements Bank, BankA{
    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void credit(int amount) {

    }
}
