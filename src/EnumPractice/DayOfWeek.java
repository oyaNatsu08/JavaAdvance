package EnumPractice;

public enum DayOfWeek {
    Sunday("日曜日"), Monday("月曜日"), Tuesday("火曜日"), Wednesday("水曜日"), Thursday("木曜日"), Friday("金曜日"), Saturday("土曜日");

    private final String label;
    DayOfWeek(String label) {
        this.label = label;
    }

    public String getDayOfWeek() {
        return label;
    }

}

class DayOfWeekTest {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.Wednesday.getDayOfWeek());
    }
}
