package com.example.rtuschedule;

public class Week {
	private Day monday;
	private Day tuesday;
	private Day wednesday;
	private Day thursday;
	private Day friday;

	public static Week empty = new Week();

	private Week() {
		monday = Day.empty;
		tuesday = Day.empty;
		wednesday = Day.empty;
		thursday = Day.empty;
		friday = Day.empty;
	}

	public Week(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday) {
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
	}

	public Day getMonday() {
		return monday;
	}

	public void setMonday(Day monday) {
		this.monday = monday;
	}

	public Day getTuesday() {
		return tuesday;
	}

	public void setTuesday(Day tuesday) {
		this.tuesday = tuesday;
	}

	public Day getWednesday() {
		return wednesday;
	}

	public void setWednesday(Day wednesday) {
		this.wednesday = wednesday;
	}

	public Day getThursday() {
		return thursday;
	}

	public void setThursday(Day thursday) {
		this.thursday = thursday;
	}

	public Day getFriday() {
		return friday;
	}

	public void setFriday(Day friday) {
		this.friday = friday;
	}
}
