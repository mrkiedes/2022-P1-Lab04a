// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths = numYears * 12;
        // Convert to decimal, then months
        double monthlyRate = (annualRate / 100) / 12;
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numMonths);
        System.out.println(numerator);








        System.out.println();
    }
}

