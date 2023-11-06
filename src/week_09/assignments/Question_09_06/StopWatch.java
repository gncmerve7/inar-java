package week_09.assignments.Question_09_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void setStartTime(long startTime) {

        this.startTime = startTime;
    }

    public long getStartTime() {

        return startTime;
    }

    public void setEndTime(long endTime) {

        this.endTime = endTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsed() {
        return endTime - startTime;
    }
}
