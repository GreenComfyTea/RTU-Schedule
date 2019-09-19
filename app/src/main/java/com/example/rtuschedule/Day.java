package com.example.rtuschedule;

public class Day {
	private Class class1;
	private Class class2;
	private Class class3;
	private Class class4;
	private Class class5;
	private Class class6;
	private Class class7;

	public static Day empty = new Day();

	private Day() {
		class1 = Class.empty;
		class2 = Class.empty;
		class3 = Class.empty;
		class4 = Class.empty;
		class5 = Class.empty;
		class6 = Class.empty;
		class7 = Class.empty;
	}

	public Day(Class class1, Class class2, Class class3, Class class4, Class class5, Class class6, Class class7) {
		this.class1 = class1;
		this.class2 = class2;
		this.class3 = class3;
		this.class4 = class4;
		this.class5 = class5;
		this.class6 = class6;
		this.class7 = class7;
	}

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}

	public Class getClass2() {
		return class2;
	}

	public void setClass2(Class class2) {
		this.class2 = class2;
	}

	public Class getClass3() {
		return class3;
	}

	public void setClass3(Class class3) {
		this.class3 = class3;
	}

	public Class getClass4() {
		return class4;
	}

	public void setClass4(Class class4) {
		this.class4 = class4;
	}

	public Class getClass5() {
		return class5;
	}

	public void setClass5(Class class5) {
		this.class5 = class5;
	}

	public Class getClass6() {
		return class6;
	}

	public void setClass6(Class class6) {
		this.class6 = class6;
	}

	public Class getClass7() {
		return class7;
	}

	public void setClass7(Class class7) {
		this.class7 = class7;
	}
}
