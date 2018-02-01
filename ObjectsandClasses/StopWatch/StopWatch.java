import java.util.GregorianCalendar;

public class StopWatch {
    private GregorianCalendar time = new GregorianCalendar();
    long startTime, endTime;

    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.time = new GregorianCalendar();
        this.startTime = this.time.getTimeInMillis();
    }
    public void stop() {
        this.time = new GregorianCalendar();
        this.endTime = this.time.getTimeInMillis();
    }
    public long getElapsedTime (){
        return (this.endTime - this.startTime);
    }
}
