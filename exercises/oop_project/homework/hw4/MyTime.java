package oop_project.homework.hw4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) 
            && (minute >= 0 && minute <= 59) 
            && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("No input validation needed.");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) 
            && (minute >= 0 && minute <= 59) 
            && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("No input validation needed.");
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return this.hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return this.second;
    }

    public String toString() {
        String hh = String.format("%02d", this.hour);
        String mm = String.format("%02d", this.minute);
        String ss = String.format("%02d", this.second);
        return hh + ":" + mm + ":" + ss;
    }

    public MyTime nextSecond() {
        this.second++;
        if (this.second > 59) {
            this.minute++;
            this.second = 0;
            if (this.minute > 59) {
                this.hour++;
                this.minute = 0;
                if (this.hour > 23) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.minute--;
            this.second = 59;
            if (this.minute < 0) {
                this.hour--;
                this.minute = 59;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute > 59) {
            this.hour++;
            this.minute = 0;
            if (this.hour > 23) {
                this.hour = 0;
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute < 0) {
            this.minute = 59;
            this.hour--;
            if (this.hour < 0) {
                this.hour = 23;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour > 23) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}
