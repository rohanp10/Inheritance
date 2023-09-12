public class SalaryWorker extends Worker {

    double annualSalary;

    @Override
    double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = Math.round((annualSalary / 52));
        return weeklyPay;
    }

    @Override
    String displayWeeklyPay(double hoursWorked) {

        String display;

        display = "There is a weekly pay of $" + calculateWeeklyPay(hoursWorked) + ", which represents one week, or 1/52, of the yearly salary";

        return display;
    }

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(ID, firstName, lastName, title, YOB);
        this.annualSalary = annualSalary;
    }

}
