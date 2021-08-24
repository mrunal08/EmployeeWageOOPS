package bl.com.empwageoops;

public class EmployeeWageOops {
    public static void UC1(){
        int FT = 1;
        int EMP = 10;

        double totalHours = Math.floor(Math.random()*10)%2;

        if (FT == totalHours) {
            System.out.println("UC1->Employee Absent");
        } else {
            System.out.println("UC1->Employee Present");
        }

    }
    public static void UC2(){
        //Employee Daily Wage
        int fullHour = 8;
        int wage = fullHour * 20;
        System.out.println("UC2->Employee Daily Fulltime Wage is " + wage);

    }
    public static void UC3(){
        //Employee Daily Part time Wage

        int partTimeHour = 4;
        int partTimeWage = partTimeHour * 20;
        System.out.println("UC3->Employee Daily Part Time Wage is " + partTimeWage);
    }
    public static void UC4(){

        int totalHour;
        int partTimeHour = 4;
        String work;
        int wage;
        int rand = (int)(Math.floor(Math.random() * 10) % 3);

        switch (rand) {
            case 0:
                totalHour = 8;
                wage = totalHour * 20;
                work = "FullTime";
                break;
            case 1:
                totalHour = 4;
                wage = partTimeHour * 20;
                work = "HalfTime";
                break;
            default:
                totalHour = 0;
                wage = 0;
                work = "Absent";
                break;
        }
        System.out.println("UC4->Employee Wage for " + work + " is " + wage);
    }
    public static void UC5(){
        int FULLT=1;
        int HALFT=0;
        int monthWage;
        int WORKDAYS = 20;
        int totalMonthWage = 0;
        int totalMonthHours;
        int hour = 0;
        double tHour=(Math.floor(Math.random()*10)%2);


        if (hour == FULLT) {
            totalMonthHours = WORKDAYS * 8;
            totalMonthWage = totalMonthHours * 20;
        } else if (hour == HALFT) {
            totalMonthHours = WORKDAYS * 4;
            totalMonthWage = totalMonthHours * 20;
        }

        System.out.println("UC5->Total Montly wage of Employee is: " + totalMonthWage);

    }
    public static void UC6(){
//UC6--Wages till a condition is met
        int MAX_DAYS=20;
        int MAX_HOURS=100;
        int empHrs=0,totalWorkingHours=0;
        int totalWorkingDays=0;

        final int FULLTIME=1;
        final int HALFTIME=0;

        while(empHrs<MAX_HOURS && totalWorkingDays <=MAX_DAYS){
            totalWorkingDays++;
            int check=(int)(Math.floor(Math.random()*10)%3);
            switch(check) {
                case FULLTIME:
                    empHrs=8;
                    break;
                case HALFTIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            totalWorkingHours+=empHrs;
            System.out.println("UC6->Total working Hours " + totalWorkingHours);
            System.out.println("UC6->Total working Days " + (totalWorkingDays-1));
        }


    }
    public static void UC7(){
        int MAX_DAYS=20;
        int MAX_HOURS=100;
        int empHrs=0,totalWorkingHours=0;
        int totalWorkingDays=0;

        final int FULLTIME=1;
        final int HALFTIME=0;

        while(empHrs<MAX_HOURS && totalWorkingDays <=MAX_DAYS){
            totalWorkingDays++;
            int check=(int)(Math.floor(Math.random()*10)%3);
            switch(check) {
                case FULLTIME:
                    empHrs=8;
                    break;
                case HALFTIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            totalWorkingHours+=empHrs;
            System.out.println("UC6->Total working Hours " + totalWorkingHours);
            System.out.println("UC6->Total working Days " + (totalWorkingDays-1));
        }

        int totalEMpWage=totalWorkingHours*empHrs;
        System.out.println("Total EmpWage : "+totalEMpWage);
    }

    public static int UC8(String company,int empRatePerHour,int MAX_DAYS,int MAX_HOURS){

        int empHrs=0,totalWorkingHours=0;
        int totalWorkingDays=0;

        final int FULLTIME=1;
        final int HALFTIME=0;

        while(empHrs<MAX_HOURS && totalWorkingDays <=MAX_DAYS){
            totalWorkingDays++;
            int check=(int)(Math.floor(Math.random()*10)%3);
            switch(check) {
                case FULLTIME:
                    empHrs=8;
                    break;
                case HALFTIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            totalWorkingHours+=empHrs;
            System.out.println("UC6->Total working Hours " + totalWorkingHours);
            System.out.println("UC6->Total working Days " + (totalWorkingDays-1));

        }
        int totalEMpWage=totalWorkingHours*empHrs;
        System.out.println("Total EmpWage for Company "+company+" is "+totalEMpWage);
        return totalEMpWage;

    }
    public static void main(String[] args ){

        System.out.println("Welcome to Employee Wage Computation Program");

        UC1();
        UC2();
        UC3();
        UC4();
        UC5();
        UC6();
        UC7();
        UC8("TCS",20,2,10);
        UC8("Wipro",20,6,20);
    }
}
