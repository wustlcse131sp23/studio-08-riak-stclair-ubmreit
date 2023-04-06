package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param holiday
	 */
public Date (int month, int day, int year, boolean holiday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.holiday = holiday;
}


public String toString() {
	if (holiday) {
		return "Today's date is: " + this.day + "/" + this.month + "/" + this.year + ". \nToday is a holiday.";
	}
	else{
		return "Today's date is: " + this.day + "/" + this.month + "/" + this.year;
	}
}
  


public static void main(String[] args) {
	Date day1 = new Date(11, 12, 1869, true);
	Date day2 = new Date(11, 12, 1869, true);
	Date day3 = new Date(11, 12, 1869, true);
	Date day4 = new Date(11, 12, 1869, true);
	Date day5 = new Date(11, 13, 1869, true);
	LinkedList<Date> list = new LinkedList<Date>();
	list.add(day1);
	list.add(day2);
	list.add(day3);
	list.add(day4);
	list.add(day5);
	//System.out.println(list);
	
	
	HashSet<Date> set = new HashSet<Date>();
	set.add(day1);
	set.add(day2);
	set.add(day3);
	set.add(day4);
	set.add(day5);
	System.out.println(set);
}


@Override
public int hashCode() {
	return Objects.hash(day, holiday, month, year);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
}
}



