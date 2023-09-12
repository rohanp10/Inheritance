public class Worker extends Person {
    double hourlyPayRate;

    public Worker (String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker (String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
    }

    double calculateWeeklyPay(double hoursWorked) {

        double weeklyPay = 0;

        if (hoursWorked > 40) {
            weeklyPay += hourlyPayRate * 40;
            weeklyPay += (hourlyPayRate * 1.5 * (hoursWorked - 40));
        }

        else {
            weeklyPay += hourlyPayRate * hoursWorked;
        }

        return weeklyPay;
    }

    String displayWeeklyPay(double hoursWorked) {

        String display;

        double weeklyPay = calculateWeeklyPay(hoursWorked);

        if (hoursWorked > 40) {
            display = "There were  " + 40 + " hours of regular pay for a total of $" + (hourlyPayRate * 40) + ", while there were " + (hoursWorked - 40) + " hours of overtime pay for a total of $" + (hourlyPayRate * 1.5 * (hoursWorked - 40)) + ", and the total combined pay was $" + weeklyPay;
        }

        else {
            display = "There were " + hoursWorked + " hours of regular pay for a total of $" + (hourlyPayRate * hoursWorked) + ", while there were 0 hours of overtime pay for a total of $0.00, and the total combined pay was $" + weeklyPay;
        }

        return display;
    }

}
