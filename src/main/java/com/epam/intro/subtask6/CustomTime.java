package com.epam.intro.subtask6;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime() {
    }

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour < 0 || hour > 23 ? 0 : hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute < 0 || minute > 59 ? 0 : minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second < 0 || second > 59 ? 0 : second;
    }

    public void plusHour(int hour) {
        setHour(getHour() + hour);
    }
    public void minusHour(int hour) {
        setHour(getHour() - hour);
    }
    public void plusMinute(int minute) {
        setMinute(getMinute() + minute);
    }
    public void minusMinute(int minute) {
        setMinute(getMinute() - minute);
    }
    public void plusSecond(int second) {
        setSecond(getSecond() + second);
    }
    public void minusSecond(int second) {
        setSecond(getSecond() - second);
    }



    @Override
    public String toString() {
        return "CustomTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
