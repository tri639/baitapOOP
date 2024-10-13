public class bai1_8 {
    private int hour;
    private int minute;
    private int second;

    public bai1_8(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public bai1_8 nextSecond() {
        second ++;
        if (second >= 60) {
            second = 0;
            minute ++;
            if (minute >= 60) {
                minute = 0;
                hour = (hour + 1) % 24;
            }
        }
        return this;
    }
    public bai1_8 previousSecond() {
        second --;
        if (second < 0) {
            second = 59;
            minute --;
            if (minute < 0) {
                minute = 59;
                hour = (hour + 23) % 24;
            }
        }
        return this;
    }
}