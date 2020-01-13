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
			case 2: return IT1;
			case 3: return IT2;
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
		Class class3, class4, class5, class6, class7;
		Day day1, day2, day3;

		class3 = new Class(Classrooms.D2_435, Subjects.BiznesaModelesana, Types.Lecture_LaboratoryWork, Teachers.Bolsakovs);
		class4 = new Class(Classrooms.D2_447, Subjects.LogistikasSistemas, Types.Lecture_LaboratoryWork, Teachers.Romanovs);
		class5 = new Class(Classrooms.D2_447, Subjects.LogistikasSistemas + " (or ?)", Types.Lecture_LaboratoryWork, Teachers.Romanovs);

		day1 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		class4 = new Class(Classrooms.S1_413, Subjects.LemumuAnalize, Types.Lecture, Teachers.Aleksejeva);
		class5 = new Class(Classrooms.Az12_K1_116, Subjects.Psihologija + " (or Pedagoģija)", Types.Lecture_PracticeWork, Teachers.Steinberga);
		class6 = new Class(Classrooms.S1_407, Subjects.Portfelvadiba, Types.Lecture_LaboratoryWork, Teachers.Grabis);
		class7 = new Class(Classrooms.S1_407, Subjects.Portfelvadiba, Types.Lecture_LaboratoryWork, Teachers.Grabis);

		day2 = new Day(Class.empty, Class.empty, Class.empty, class4, class5, class6, class7);

		class4 = new Class(Classrooms.S1_412, Subjects.ItParvaldiba, Types.Lecture, Teachers.Romanovs);
		class5 = new Class(Classrooms.S1_407, Subjects.Transformacija, Types.Lecture, Teachers.Grabis);
		class6 = new Class(Classrooms.S1_405, Subjects.Transformacija, Types.LaboratoryWork, Teachers.Grabis);

		day3 = new Day(Class.empty, Class.empty, Class.empty, class4, class5, class6, Class.empty);

		Week oddWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		class3 = new Class(Classrooms.D2_435, Subjects.BiznesaModelesana, Types.Lecture_LaboratoryWork, Teachers.Bolsakovs);
		class4 = new Class(Classrooms.S1_413, Subjects.LogistikasSistemas, Types.Lecture, Teachers.Romanovs);
		class5 = new Class(Classrooms.S1_405, Subjects.WEB + " (or ?)", Types.Lecture_LaboratoryWork, Teachers.Kampars);
		class6 = new Class(Classrooms.S1_407, Subjects.WEB, Types.Lecture, Teachers.Kampars);

		day1 = new Day(Class.empty, Class.empty, class3, class4, class5, class6, Class.empty);

		class4 = new Class(Classrooms.S1_413, Subjects.LemumuAnalize, Types.Lecture, Teachers.Aleksejeva);
		class5 = new Class(Classrooms.Az12_K1_116, Subjects.Psihologija + " (or Pedagoģija)", Types.Lecture_PracticeWork, Teachers.Steinberga);
		class6 = new Class(Classrooms.S1_407, Subjects.Portfelvadiba, Types.Lecture_LaboratoryWork, Teachers.Grabis);
		class7 = new Class(Classrooms.S1_407, Subjects.Portfelvadiba, Types.Lecture_LaboratoryWork, Teachers.Grabis);

		day2 = new Day(Class.empty, Class.empty, Class.empty, class4, class5, class6, class7);

		class3 = new Class(Classrooms.S1_413, Subjects.LemumuAnalize, Types.LaboratoryWork, Teachers.Aleksejeva);
		class4 = new Class(Classrooms.S1_412, Subjects.ItParvaldiba, Types.Lecture, Teachers.Romanovs);
		class5 = new Class(Classrooms.S1_407, Subjects.Transformacija, Types.Lecture, Teachers.Grabis);
		class6 = new Class(Classrooms.S1_405, Subjects.Transformacija, Types.LaboratoryWork, Teachers.Grabis);

		day3 = new Day(Class.empty, Class.empty, class3, class4, class5, class6, Class.empty);

		Week evenWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		return new Program(oddWeek, evenWeek);
	}

	private static Program getIT2() {
		Class class3, class4, class5, class6;
		Day day1, day4;

		class3 = new Class(Classrooms.S1_413, Subjects.Logistika, Types.Lecture, Teachers.Petuhova);
		class4 = new Class(Classrooms.D2_435, Subjects.Logistika, Types.LaboratoryWork, Teachers.Unknown);
		class5 = new Class(Classrooms.D2_340, Subjects.Logistika, Types.LaboratoryWork, Teachers.Unknown);

		day1 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		class5 = new Class(Classrooms.S1_407, Subjects.Restrukturizācija, Types.Lecture_PracticeWork, Teachers.Pirta + ", Nedēļas: 1.-12.");
		class6 = new Class(Classrooms.S1_407, Subjects.Restrukturizācija, Types.Lecture_PracticeWork, Teachers.Pirta + ", Nedēļas: 1.-12.");

		day4 = new Day(Class.empty, Class.empty, Class.empty, Class.empty, class5, class6, Class.empty);

		Week oddWeek = new Week(day1, Day.empty, Day.empty, day4, Day.empty);

		class5 = new Class(Classrooms.S1_407, Subjects.Restrukturizācija, Types.Lecture_PracticeWork, Teachers.Pirta + ", Nedēļas: 1.-12.");
		class6 = new Class(Classrooms.S1_407, Subjects.Restrukturizācija, Types.Lecture_PracticeWork, Teachers.Pirta + ", Nedēļas: 1.-12.");

		day4 = new Day(Class.empty, Class.empty, Class.empty, Class.empty, class5, class6, Class.empty);

		Week evenWeek = new Week(Day.empty, Day.empty, Day.empty, day4, Day.empty);

		return new Program(oddWeek, evenWeek);
	}
}
