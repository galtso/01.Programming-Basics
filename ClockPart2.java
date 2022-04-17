public class ClockPart2 {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 0;
        int second = 0;
        for (int i = 0; i <= 86399; i++) {
            System.out.printf("%d : %d : %d%n", hour, minute, second);
            second++;
            if (second > 59) {
                minute++;
                second = 0;
                if (minute > 59) {
                    minute = 0;
                    hour++;
                    if (hour > 23) {
                        break;
                    }
                }
            }
        }
    }
}
