package com.example.rtuschedule;

public class Programs {

	public static Program AD = getAD();
	public static Program FI = getFI();
	public static Program IT1 = getIT1();
	public static Program IT2 = getIT2();

	public static Program getProgram(int id) {
		switch(id) {
			case 0: return AD;
			case 1: return FI;
			case 2: return IT1;
			case 3: return  IT2;
			default: return AD;
		}
	}

	private static Program getAD() {

		Class class1, class2, class3, class4;
		Day day1, day2, day3;

		class2 = new Class(Classrooms.D2_341, Subjects.Datorgrafika, Types.Lecture, Teachers.Sisojevs);
		class3 = new Class(Classrooms.D2_340, Subjects.Datorgrafika, Types.LaboratoryWork, Teachers.Sisojevs);
		class4 = new Class(Classrooms.D2_353, Subjects.Drosiba, Types.Lecture, Teachers.Klavins);

		day1 = new Day(Class.empty, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_341, Subjects.PLC, Types.Lecture, Teachers.Suponenkovs);
		class2 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture, Teachers.Zagurskis);
		class3 = new Class(Classrooms.D2_341, Subjects.Multivide, Types.Lecture_LaboratoryWork, Teachers.Ziema);
		class4 = new Class(Classrooms.D2_341, Subjects.Multivide, Types.Lecture_LaboratoryWork, Teachers.Ziema);

		day2 = new Day(class1, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class2 = new Class(Classrooms.D2_340, Subjects.AtteluApstrade, Types.Lecture, Teachers.Bolocko);
		class3 = new Class(Classrooms.D2_340, Subjects.AtteluApstrade, Types.Lecture, Teachers.Bolocko);
		class4 = new Class(Classrooms.D2_340, Subjects.Datordizains, Types.Lecture_PracticeWork, Teachers.Krutikova);

		day3 = new Day(Class.empty, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		Week oddWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		class2 = new Class(Classrooms.S1_305, Subjects.PLC, Types.Lecture_LaboratoryWork, Teachers.Kivlenieks);
		class3 = new Class(Classrooms.D2_340, Subjects.Datorgrafika, Types.LaboratoryWork, Teachers.Sisojevs);

		day1 = new Day(Class.empty, class2, class3, Class.empty, Class.empty, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_341, Subjects.PLC, Types.Lecture, Teachers.Suponenkovs);
		class2 = new Class(Classrooms.D2_348, Subjects.Arhitektura, Types.Lecture, Teachers.Zagurskis);
		class3 = new Class(Classrooms.D2_341, Subjects.Multivide, Types.Lecture_LaboratoryWork, Teachers.Ziema);
		class4 = new Class(Classrooms.D2_341, Subjects.Arhitektura, Types.Lecture_PracticeWork, Teachers.Zagurskis);

		day2 = new Day(class1, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class2 = new Class(Classrooms.D2_340, Subjects.AtteluApstrade, Types.Lecture, Teachers.Bolocko);
		class3 = new Class(Classrooms.D2_340, Subjects.AtteluApstrade, Types.Lecture, Teachers.Bolocko);

		day3 = new Day(Class.empty, class2, class3, Class.empty, Class.empty, Class.empty, Class.empty);

		Week evenWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		return new Program(oddWeek, evenWeek);
	}

	private static Program getFI() {
		Class class2, class3, class4;
		Day day1;

		class2 = new Class(Classrooms.S1_106, Subjects.SkaitliskasMetodes, Types.PracticeWork, Teachers.Iltins);
		class3 = new Class(Classrooms.M1_301, Subjects.SkaitliskasMetodes, Types.Lecture, Teachers.Iltins);
		class4 = new Class(Classrooms.D2_442, Subjects.AktuarasTehnologijasProgrammuPaketes, Types.Lecture, Teachers.Matvejevs);

		day1 = new Day(Class.empty, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		Week oddWeek = new Week(day1, Day.empty, Day.empty, Day.empty, Day.empty);

		class2 = new Class(Classrooms.D2_442, Subjects.AktuarasTehnologijasProgrammuPaketesSP, Types.Lecture, Teachers.Matvejevs);
		class3 = new Class(Classrooms.D2_442, Subjects.AktuarasTehnologijasProgrammuPaketesSP, Types.Lecture, Teachers.Matvejevs);
		class4 = new Class(Classrooms.D2_442, Subjects.AktuarasTehnologijasProgrammuPaketes, Types.Lecture, Teachers.Matvejevs);

		day1 = new Day(Class.empty, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		Week evenWeek = new Week(day1, Day.empty, Day.empty, Day.empty, Day.empty);

		return new Program(oddWeek, evenWeek);
	}

	private static Program getIT1() {
		Class class1, class2, class3, class4, class5;
		Day day1, day2, day3;

		class2 = new Class(Classrooms.S1_407, Subjects.InformacijasSistemuDrosibasParvaldiba, Types.Lecture, Teachers.MinkevicsDocents);
		class3 = new Class(Classrooms.S1_405, Subjects.InformacijasSistemuDrosibasParvaldiba, Types.PracticeWork, Teachers.Minkevics);
		class4 = new Class(Classrooms.S1_405, Subjects.DatizraceUnZinasanuAtklasana, Types.Lecture_LaboratoryWork, Teachers.Parsutins);
		class5 = new Class(Classrooms.S1_405, Subjects.DatizraceUnZinasanuAtklasana, Types.Lecture_LaboratoryWork, Teachers.Parsutins);

		day1 = new Day(Class.empty, class2, class3, class4, class5, Class.empty, Class.empty);

		class1 = new Class(Classrooms.KC6_221, Subjects.DarbaAizsardzibasPamati, Types.Lecture, Teachers.Smitins);
		class2 = new Class(Classrooms.S1_512, Subjects.ObjektorientetaSistemanalize, Types.Lecture, Teachers.Nikifovora);
		class3 = new Class(Classrooms.S1_413, Subjects.SistemuImitacijasUnModelesanasTehnologija, Types.Lecture, Teachers.Merkurjevs);
		class4 = new Class(Classrooms.D2_447, Subjects.VadibasInformacijasSistemuProjektesana, Types.LaboratoryWork, Teachers.Romanovs);

		day2 = new Day(class1, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class2 = new Class(Classrooms.S1_413, Subjects.UznemejdarbibasLogistika, Types.Lecture_PracticeWork, Teachers.Starcenko);
		class3 = new Class("???", "???", Types.Lecture_PracticeWork, "???");
		class4 = new Class(Classrooms.S1_407, Subjects.VadibasInformacijasSistemuProjektesana, Types.Lecture, Teachers.RomanovsAsProf);
		class5 = new Class(Classrooms.KC6_308, Subjects.Gramatvediba, Types.PracticeWork, Teachers.Tise);

		day3 = new Day(Class.empty, class2, class3, class4, class5, Class.empty, Class.empty);

		Week oddWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		class2 = new Class(Classrooms.S1_407, Subjects.InformacijasSistemuDrosibasParvaldiba, Types.Lecture, Teachers.MinkevicsDocents);
		class3 = new Class(Classrooms.S1_405, Subjects.InformacijasSistemuDrosibasParvaldiba, Types.PracticeWork, Teachers.Minkevics);
		class4 = new Class(Classrooms.S1_405, Subjects.DatizraceUnZinasanuAtklasana, Types.Lecture_LaboratoryWork, Teachers.Parsutins);
		class5 = new Class(Classrooms.S1_405, Subjects.DatizraceUnZinasanuAtklasana, Types.Lecture_LaboratoryWork, Teachers.Parsutins);

		day1 = new Day(Class.empty, class2, class3, class4, class5, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_522, Subjects.ObjektorientetaSistemanalize, Types.LaboratoryWork, Teachers.Nikifovora);
		class2 = new Class(Classrooms.S1_512, Subjects.ObjektorientetaSistemanalize, Types.Lecture, Teachers.Nikifovora);
		class3 = new Class(Classrooms.S1_413, Subjects.SistemuImitacijasUnModelesanasTehnologija, Types.Lecture, Teachers.Merkurjevs);

		day2 = new Day(class1, class2, class3, Class.empty, Class.empty, Class.empty, Class.empty);

		class3 = new Class("???", "???", Types.Lecture_PracticeWork, "???");
		class4 = new Class(Classrooms.S1_407, Subjects.VadibasInformacijasSistemuProjektesana, Types.Lecture, Teachers.RomanovsAsProf);
		class5 = new Class(Classrooms.D2_447, Subjects.SistemuImitacijasUnModelesanasTehnologija, Types.LaboratoryWork, Teachers.Pecerska);

		day3 = new Day(Class.empty, Class.empty, class3, class4, class5, Class.empty, Class.empty);

		Week evenWeek = new Week(day1, day2, day3, Day.empty, Day.empty);

		return new Program(oddWeek, evenWeek);
	}

	private static Program getIT2() {
		Class class1, class2, class3, class4, class5;
		Day day2, day3, day4;

		class1 = new Class(Classrooms.D2_529, Subjects.LielasDatuBazes, Types.LaboratoryWork, Teachers.AuzinsEiduks);
		class2 = new Class(Classrooms.D2_529_541, Subjects.LielasDatuBazes, Types.Lecture, Teachers.Auzins + ", " + Teachers.Eiduks);
		class3 = new Class(Classrooms.D2_435, Subjects.ParvaldibasElementuIntegracija, Types.Lecture_LaboratoryWork, Teachers.Bikovska);
		class4 = new Class(Classrooms.D2_435, Subjects.ParvaldibasElementuIntegracija, Types.Lecture_LaboratoryWork, Teachers.Bikovska);

		day2 = new Day(class1, class2, class3, class4, Class.empty, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_435, Subjects.GeografiskasInformacijasTehnologijas, Types.Lecture_PracticeWork, Teachers.Lektauers);
		class2 = new Class(Classrooms.D2_435, Subjects.ParvaldibasInformacijasSistemuModelesanasDatorizetieLidzekli, Types.Lecture_PracticeWork, Teachers.RomanovsAsProf);
		class3 = new Class(Classrooms.D2_435, Subjects.ParvaldibasInformacijasSistemuModelesanasDatorizetieLidzekli, Types.Lecture_LaboratoryWork, Teachers.RomanovsAsProf);

		day3 = new Day(class1, class2, class3, Class.empty, Class.empty, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_447, Subjects.AugstasVeiktspejasSkaitlosanasTehnologijaCUDA, Types.Lecture_LaboratoryWork, Teachers.Lektauers);
		class2 = new Class(Classrooms.D2_447, Subjects.AugstasVeiktspejasSkaitlosanasTehnologijaCUDA, Types.Lecture_LaboratoryWork, Teachers.Lektauers);

		day4 = new Day(class1, class2, Class.empty, Class.empty, Class.empty, Class.empty, Class.empty);

		Week oddWeek = new Week(Day.empty, day2, day3, day4, Day.empty);

		class2 = new Class(Classrooms.D2_529_541, Subjects.LielasDatuBazes, Types.Lecture, Teachers.Auzins + ", " + Teachers.Eiduks);
		class3 = new Class(Classrooms.D2_435, Subjects.ParvaldibasElementuIntegracija, Types.Lecture_LaboratoryWork, Teachers.Bikovska);
		class4 = new Class(Classrooms.D2_435, Subjects.ParvaldibasElementuIntegracija, Types.Lecture_LaboratoryWork, Teachers.Bikovska);
		class5 = new Class(Classrooms.D2_435, Subjects.ParvaldibasElementuIntegracija, Types.Lecture_LaboratoryWork, Teachers.Bikovska);

		day2 = new Day(Class.empty, class2, class3, class4, class5, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_435, Subjects.GeografiskasInformacijasTehnologijas, Types.Lecture_PracticeWork, Teachers.Lektauers);
		class2 = new Class(Classrooms.D2_435, Subjects.ParvaldibasInformacijasSistemuModelesanasDatorizetieLidzekli, Types.Lecture_PracticeWork, Teachers.RomanovsAsProf);
		class3 = new Class(Classrooms.D2_435, Subjects.ParvaldibasInformacijasSistemuModelesanasDatorizetieLidzekli, Types.Lecture_LaboratoryWork, Teachers.RomanovsAsProf);

		day3 = new Day(class1, class2, class3, Class.empty, Class.empty, Class.empty, Class.empty);

		class1 = new Class(Classrooms.D2_447, Subjects.AugstasVeiktspejasSkaitlosanasTehnologijaCUDA, Types.Lecture_LaboratoryWork, Teachers.Lektauers);
		class2 = new Class(Classrooms.S1_413, Subjects.AugstasVeiktspejasSkaitlosanasTehnologijaCUDA, Types.Lecture_LaboratoryWork, Teachers.Lektauers);

		day4 = new Day(class1, class2, Class.empty, Class.empty, Class.empty, Class.empty, Class.empty);

		Week evenWeek = new Week(Day.empty, day2, day3, day4, Day.empty);

		return new Program(oddWeek, evenWeek);
	}
}
