class Time {

    int hours;
    int minutes;
    int seconds;

    void setTime() {
        hours = 10;
        minutes = 30;
        seconds = 45;
    }

    void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }

    void showTime() {
        System.out.println("The current time is "
                + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {

        Time t1 = new Time();

        t1.setTime();
        t1.displayTime();
        t1.showTime();
    }
}