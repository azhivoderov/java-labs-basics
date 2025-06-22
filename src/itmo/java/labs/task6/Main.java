package itmo.java.labs.task6;

public class Main {
    public static void main(String[] args) {

        //1 + 2
        Printable client = new Client("Ivan", "Petrov", "VTB");
        Printable bankEmployee = new BankEmployee("Dany", "Dan", "VTB");

        printAllInfo(client);
        printAllInfo(bankEmployee);

        //3
        Truck truck = new Truck(5000, "Truck", 'R', 200,8, 25000);
        truck.newWheels(8);

        //4
        HeirClass heirClass = new HeirClass();
        heirClass.printNumber();


        //5
        PrintableFive user = new ParentFiveClass("Ivan");
        PrintableFive user2 = new HeirFiveClass("Ivan");

    }

    public static void printAllInfo(Printable printable){
        printable.printInfo();
    }

}
