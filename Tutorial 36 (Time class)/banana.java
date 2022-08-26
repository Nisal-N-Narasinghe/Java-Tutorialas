public class banana {

    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s) {
        hours = ((h >= 0 && h < 24) ? h : 0); /*
                                               * use ? :- if user pass a value to h, it will assign to it or if user not
                                               * pass a value to h it will assign as 0
                                               */

        minutes = ((m >= 0 && m < 60) ? m : 0);
        seconds = ((s >= 0 && s < 60) ? s : 0);
    }

    // method for standard time format
    public String standardTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds); // use String.format(); to print formated
                                                                         // string value
    }

    // method for regular time format
    public String regularTime() {
        return String.format("%d:%02d:%02d %s", ((hours == 0 || hours == 12) ? 12 : hours % 12), minutes, seconds,
                (hours < 12 ? "AM" : "PM"));
    }
}
