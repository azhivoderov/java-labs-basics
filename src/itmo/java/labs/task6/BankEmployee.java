package itmo.java.labs.task6;

public class BankEmployee extends Person implements Printable {
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " " + getSurname() + " " + getBankName());
    }
}
