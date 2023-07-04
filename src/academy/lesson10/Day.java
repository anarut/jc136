package academy.lesson10;

import java.util.Random;

public enum Day {
    MONDAY,
    THUSDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY(true) {
        @Override
        public boolean isWeekday() {
            return new Random().nextBoolean();
        }
    },
    SATURDAY(false),
    SUNDAY(false);

    private final boolean weekday;

    Day() {
        this(true);
    }

    Day(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean isWeekday() {
        return weekday;
    }
}
