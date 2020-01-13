package com.example.rtuschedule;

public class Programs {

	public static Program AD = getAD();
	public static Program FI = getFI();
	public static Program IT1 = getIT1();
	public static Program IT2 = getIT2();

	public static Program getProgram(int id) {
		switch(id) {
			case 0: return AD;
			case 1: return AD;
			case 2: return AD;
			case 3: return AD;
			default: return AD;
		}
	}

	private static Program getAD() {

		Class class2, class3, class4, class5;
		Day day1, day2, day3;

		class2 = new Class(Classrooms.D2_341, Subjects.CiparvadibasSistemas, Types.Lecture_PracticeWork, Teachers.Markovics);
		class3 = new Class(Classrooms.D2_341, Subjects.CiparvadibasSistemas, Types.Lecture_PracticeWork, Teachers.Markovics);
		class4 = new Class(Classrooms.D2_340, Subjects.Modelesana3D, Types.Lecture_LaboratoryWork, Teachers.Kovalovs);
		class5 = new Class(Classrooms.D2_340, Subjects.Modelesana3D, Types.Lecture_LaboratoryWork, Teachers.Kovalovs);

		day1 = new Day(Class.empty, class2, class3, class4, class5, Class.empty, Class.empty);

		class3 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture_LaboratoryWork, Teachers.Zagurskis);
		class4 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture_LaboratoryWork, Teachers.Zagurskis);
		class5 = new Class(Classrooms.Az12_K1_116, Subjects.Psihologija, Types.Lecture_PracticeWork, Teachers.Steinberga);

		day2 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		class3 = new Class(Classrooms.D2_341, Subjects.ScenuAnalize, Types.Lecture_LaboratoryWork, Teachers.Sisojevs);
		class4 = new Class(Classrooms.D2_340, Subjects.ScenuAnalize, Types.Lecture_LaboratoryWork, Teachers.Krutikova);
		class5 = new Class(Classrooms.Kip6B_300, Subjects.SocialaPsihologija, Types.Lecture_PracticeWork, Teachers.Girsova);

		day3 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		Week oddWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		class2 = new Class(Classrooms.D2_341, Subjects.CiparvadibasSistemas, Types.Lecture_PracticeWork, Teachers.Markovics);
		class3 = new Class(Classrooms.D2_341, Subjects.CiparvadibasSistemas, Types.Lecture_PracticeWork, Teachers.Markovics);
		class4 = new Class(Classrooms.D2_340, Subjects.Modelesana3D, Types.Lecture_LaboratoryWork, Teachers.Kovalovs);

		day1 = new Day(Class.empty, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class3 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture_LaboratoryWork, Teachers.Zagurskis);
		class4 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture_LaboratoryWork, Teachers.Zagurskis);
		class5 = new Class(Classrooms.Az12_K1_116, Subjects.Psihologija, Types.Lecture_PracticeWork, Teachers.Steinberga);

		day2 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		class3 = new Class(Classrooms.D2_341, Subjects.ScenuAnalize, Types.Lecture_LaboratoryWork, Teachers.Sisojevs);
		class5 = new Class(Classrooms.Kip6B_300, Subjects.SocialaPsihologija, Types.Lecture_PracticeWork, Teachers.Girsova);

		day3 = new Day(Class.empty, Class.empty, class3, Class.empty, class5, Class.empty, Class.empty);

		Week evenWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		return new Program(oddWeek, evenWeek);
	}

	private static Program getFI() {
		return Program.empty;
	}

	private static Program getIT1() {
		return Program.empty;
	}

	private static Program getIT2() {
		return Program.empty;
	}
}
