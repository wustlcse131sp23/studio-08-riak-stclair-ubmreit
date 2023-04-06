package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	//private boolean type;

	
	/**
	 * 
	 * @param hour
	 * @param minute
	 */
public Time (int hour, int minute) {
	this.hour = hour;
	this.minute = minute;
}
	
public String toString() {
	return "The time is: " + hour + ":" + minute;
	}



public static void main(String[] args) {
	Time now = new Time(4, 15);
	Time stillNow = new Time(4, 15);
	System.out.println(now.equals(stillNow));
}

@Override
public int hashCode() {
	return Objects.hash(hour, minute);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minute == other.minute;
}
}