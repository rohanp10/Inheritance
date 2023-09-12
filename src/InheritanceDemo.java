import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        Worker john = new Worker("000000", "John", "Smith", "Mr.", 2000, 15);
        workers.add(john);
        Worker jane = new Worker("000001", "Jane", "Doe", "Mrs.", 1990, 20);
        workers.add(jane);
        Worker billy = new Worker("000002", "Billy", "Bob", "Mr.", 1980, 25);
        workers.add(billy);

        SalaryWorker james = new SalaryWorker("000003", "James", "Allen", "Mr.", 1985, 60000);
        workers.add(james);
        SalaryWorker emma = new SalaryWorker("000004", "Emma", "Johnson", "Mrs.", 1970, 80000);
        workers.add(emma);
        SalaryWorker nick = new SalaryWorker("000005", "Nick", "Jones", "Mr.", 1980, 100000);
        workers.add(nick);

        for (int i = 0; i < 2; i++) {

            double hours;
            if (i == 0 || i == 2){
                hours = 40;
            }
            else {
                hours = 50;
            }

            for (Worker worker: workers) {
                worker.calculateWeeklyPay(i);
            }

        }

        System.out.printf("\n");
        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s\n", "ID#", "Firstname", "Lastname", "Week 1 Pay", "Week 2 Pay", "Week 3 Pay");
        System.out.printf("===========================================================================\n");

        for (Worker worker: workers) {
            System.out.printf("%-12s %-12s %-12s $%-12.2f $%-12.2f $%-12.2f\n", worker.getID(), worker.getFirstName(), worker.getLastName(), worker.calculateWeeklyPay(40), worker.calculateWeeklyPay(50), worker.calculateWeeklyPay(40));
        }

    }
}
