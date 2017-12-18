
package howmanyyearsinminutes;

import java.util.Scanner;

public class HowManyYearsInMinutes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter the number of minutes : ");
        int min = input.nextInt ();
        // there is 1440 min per day .
        int days_min = min/1440;
        int year = days_min / 365;
        int day = days_min%365;
        System.out.println(min+" minutes is approximtely "+year+" years and "+day+" days . ");
        
    }
    
}

    