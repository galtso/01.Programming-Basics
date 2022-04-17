public class Clock {
    public static void main(String[] args) {
        int hour = 0;
        while (hour <= 23) {
            int minute = 0;
            while (minute <= 59) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        }
    }
}
