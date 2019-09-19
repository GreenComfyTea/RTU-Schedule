package com.example.rtuschedule;

public class Program {
	private Week oddWeek;
	private  Week evenWeek;

	public static Program empty = new Program();

	private Program() {
		this.oddWeek = Week.empty;
		this.evenWeek = Week.empty;
	}

	public Program(Week oddWeek, Week evenWeek) {
		this.oddWeek = oddWeek;
		this.evenWeek = evenWeek;
	}

	public Week getOddWeek() {
		return oddWeek;
	}

	public void setOddWeek(Week oddWeek) {
		this.oddWeek = oddWeek;
	}

	public Week getEvenWeek() {
		return evenWeek;
	}

	public void setEvenWeek(Week evenWeek) {
		this.evenWeek = evenWeek;
	}
}
