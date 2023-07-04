package academy.lesson10;

public class EnumMain {

    public static void main(String[] args) {
        String monday = "MONDAY";
        Day day = Day.valueOf(monday);

        Day friday = Day.FRIDAY;

        switch (friday) {
            case SUNDAY:
                System.out.println("ss");
                break;
            case SATURDAY:
            case MONDAY:
            case FRIDAY:
            case WEDNESDAY:
            case THURSDAY:
            case THUSDAY:
        }


        Day[] values = Day.values();
        boolean weekday = friday.isWeekday();
        int ordinal = friday.ordinal();

        friday.name();

    }
}
