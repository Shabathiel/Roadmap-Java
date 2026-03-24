package basicsOPP;

public class Clock {

    private long time = 0;

    private Clock(long time) {
        this.time = time;
    }

    public Clock(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }

    public long getTime() {
		return this.time;
	}

	public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }

}