package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month ==1 || month==3 || month==4 || month==7|| month==9|| month==10 ){
            System.out.println("31");
        }
        if (month==2){
            System.out.println("28");
        }
        if(month==4 || month==6 || month==9 || month==117){
            System.out.println("30");
        }
        else if (month >12 || month<1){
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        DaysInMonthPrinter daysInMonthPrinter = new DaysInMonthPrinter();
        daysInMonthPrinter.amountOfDays(2);
    }
}
