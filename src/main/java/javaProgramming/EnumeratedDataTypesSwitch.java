package javaProgramming;

import java.lang.invoke.SwitchPoint;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumeratedDataTypesSwitch {
    Day day;
    public EnumeratedDataTypesSwitch(Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("MONDAYS ARE BORING");
                break;
            case FRIDAY:
                System.out.println("FRIDAYS ARE GOOD");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("WEEKENDS ARE EXTRA-ORDINARY");
                break;
            default:
                System.out.println("WEEKDAYS ARE OK-OK");
                break;

        }
    }

    public static void main(String[] args){

    String day="SUNDAY";
    EnumeratedDataTypesSwitch d1 = new EnumeratedDataTypesSwitch(Day.valueOf(day));
    d1.dayIsLike();
    }
}
