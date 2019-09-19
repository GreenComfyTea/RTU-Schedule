package com.example.rtuschedule;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class MainActivity extends AppCompatActivity {

	private int programId;
	private int weekId;
	private int dayId;

	private SeekBar programSeekBar;
	private SeekBar weekSeekBar;
	private SeekBar daySeekBar;

	private TextView classroom1;
	private TextView classroom2;
	private TextView classroom3;
	private TextView classroom4;
	private TextView classroom5;
	private TextView classroom6;
	private TextView classroom7;

	private TextView subject1;
	private TextView subject2;
	private TextView subject3;
	private TextView subject4;
	private TextView subject5;
	private TextView subject6;
	private TextView subject7;

	private TextView type1;
	private TextView type2;
	private TextView type3;
	private TextView type4;
	private TextView type5;
	private TextView type6;
	private TextView type7;

	private TextView teacher1;
	private TextView teacher2;
	private TextView teacher3;
	private TextView teacher4;
	private TextView teacher5;
	private TextView teacher6;
	private TextView teacher7;

	private TextView adTextView;
	private TextView fiTextView;
	private TextView it1TextView;
	private TextView it2TextView;

	private TextView oddTextView;
	private TextView evenTextView;

	private TextView mondayTextView;
	private TextView tuesdayTextView;
	private TextView wednesdayTextView;
	private TextView thursdayTextView;
	private TextView fridayTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initSeekBars();
		initTextViews();

		initDefaultId();

		weekSeekBar.setProgress(weekId);
		daySeekBar.setProgress(dayId);

		initSeekBarListeners();
		initTextViewListeners();

		updateSchedule(programId, weekId, dayId);
	}

	private void initDefaultId() {
		OffsetDateTime offset = OffsetDateTime.now();

		programId = 0;
		weekId = getWeekParity(offset);
		dayId = getDayOfWeek(offset);
	}

	private int getWeekParity(OffsetDateTime offset) {
		int dayOfYear = offset.getDayOfYear();
		int weekOfYear = dayOfYear / 7;
		int weekParity = weekOfYear % 2;

		weekParity = weekParity == 1
				? weekParity - 1
				: weekParity + 1;

		return weekParity;
	}

	private int getDayOfWeek(OffsetDateTime offset) {
		DayOfWeek day = offset.getDayOfWeek();

		return day.getValue() - 1;
	}

	private void updateSchedule(int programId, int weekId, int dayId) {
		Program program = Programs.getProgram(programId);

		Week week;
		switch (weekId) {
			case 0: week = program.getOddWeek();
				break;
			case 1: week = program.getEvenWeek();
				break;
			default: week = program.getOddWeek();
				break;
		}

		Day day;
		switch (dayId) {
			case 0: day = week.getMonday();
				break;
			case 1: day = week.getTuesday();
				break;
			case 2: day = week.getWednesday();
				break;
			case 3: day = week.getThursday();
				break;
			case 4: day = week.getFriday();
				break;
			default: day = week.getMonday();
				break;
		}

		updateSchedule(day);
	}

	private void updateSchedule(Day day) {
		classroom1.setText(day.getClass1().getClassroom());
		classroom2.setText(day.getClass2().getClassroom());
		classroom3.setText(day.getClass3().getClassroom());
		classroom4.setText(day.getClass4().getClassroom());
		classroom5.setText(day.getClass5().getClassroom());
		classroom6.setText(day.getClass6().getClassroom());
		classroom7.setText(day.getClass7().getClassroom());

		subject1.setText(day.getClass1().getSubject());
		subject2.setText(day.getClass2().getSubject());
		subject3.setText(day.getClass3().getSubject());
		subject4.setText(day.getClass4().getSubject());
		subject5.setText(day.getClass5().getSubject());
		subject6.setText(day.getClass6().getSubject());
		subject7.setText(day.getClass7().getSubject());

		type1.setText(day.getClass1().getType());
		type2.setText(day.getClass2().getType());
		type3.setText(day.getClass3().getType());
		type4.setText(day.getClass4().getType());
		type5.setText(day.getClass5().getType());
		type6.setText(day.getClass6().getType());
		type7.setText(day.getClass7().getType());

		teacher1.setText(day.getClass1().getTeacher());
		teacher2.setText(day.getClass2().getTeacher());
		teacher3.setText(day.getClass3().getTeacher());
		teacher4.setText(day.getClass4().getTeacher());
		teacher5.setText(day.getClass5().getTeacher());
		teacher6.setText(day.getClass6().getTeacher());
		teacher7.setText(day.getClass7().getTeacher());
	}

	private void initSeekBars() {
		programSeekBar = findViewById(R.id.programSeekBar);
		weekSeekBar = findViewById(R.id.weekSeekBar);
		daySeekBar = findViewById(R.id.daySeekBar);
	}

	private void initTextViews() {
		classroom1 = findViewById(R.id.classroom1_TextView);
		classroom2 = findViewById(R.id.classroom2_TextView);
		classroom3 = findViewById(R.id.classroom3_TextView);
		classroom4 = findViewById(R.id.classroom4_TextView);
		classroom5 = findViewById(R.id.classroom5_TextView);
		classroom6 = findViewById(R.id.classroom6_TextView);
		classroom7 = findViewById(R.id.classroom7_TextView);

		subject1 = findViewById(R.id.subject1_TextView);
		subject2 = findViewById(R.id.subject2_TextView);
		subject3 = findViewById(R.id.subject3_TextView);
		subject4 = findViewById(R.id.subject4_TextView);
		subject5 = findViewById(R.id.subject5_TextView);
		subject6 = findViewById(R.id.subject6_TextView);
		subject7 = findViewById(R.id.subject7_TextView);

		type1 = findViewById(R.id.type1_TextView);
		type2 = findViewById(R.id.type2_TextView);
		type3 = findViewById(R.id.type3_TextView);
		type4 = findViewById(R.id.type4_TextView);
		type5 = findViewById(R.id.type5_TextView);
		type6 = findViewById(R.id.type6_TextView);
		type7 = findViewById(R.id.type7_TextView);

		teacher1 = findViewById(R.id.teacher1_TextView);
		teacher2 = findViewById(R.id.teacher2_TextView);
		teacher3 = findViewById(R.id.teacher3_TextView);
		teacher4 = findViewById(R.id.teacher4_TextView);
		teacher5 = findViewById(R.id.teacher5_TextView);
		teacher6 = findViewById(R.id.teacher6_TextView);
		teacher7 = findViewById(R.id.teacher7_TextView);

		adTextView = findViewById(R.id.adTextView);
		fiTextView = findViewById(R.id.fiTextView);
		it1TextView = findViewById(R.id.it1TextView);
		it2TextView = findViewById(R.id.it2TextView);

		oddTextView = findViewById(R.id.oddTextView);
		evenTextView = findViewById(R.id.evenTextView);

		mondayTextView = findViewById(R.id.mondayTextView);
		tuesdayTextView = findViewById(R.id.tuesdayTextView);
		wednesdayTextView = findViewById(R.id.wednesdayTextView);
		thursdayTextView = findViewById(R.id.thursdayTextView);
		fridayTextView = findViewById(R.id.fridayTextView);
	}

	private void initSeekBarListeners() {
		programSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				programId = progress;
				updateSchedule(programId, weekId, dayId);
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});

		weekSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				weekId = progress;
				updateSchedule(programId, weekId, dayId);
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});

		daySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				dayId = progress;
				updateSchedule(programId, weekId, dayId);
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});
	}

	private void initTextViewListeners() {
		adTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				programSeekBar.setProgress(0);
			}
		});

		fiTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				programSeekBar.setProgress(1);
			}
		});

		it1TextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				programSeekBar.setProgress(2);
			}
		});

		it2TextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				programSeekBar.setProgress(3);
			}
		});

		oddTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				weekSeekBar.setProgress(0);
			}
		});

		evenTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				weekSeekBar.setProgress(1);
			}
		});

		mondayTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				daySeekBar.setProgress(0);
			}
		});

		tuesdayTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				daySeekBar.setProgress(1);
			}
		});

		wednesdayTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				daySeekBar.setProgress(2);
			}
		});

		thursdayTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				daySeekBar.setProgress(3);
			}
		});

		fridayTextView.setOnClickListener(new TextView.OnClickListener() {
			@Override
			public void onClick(View view) {
				daySeekBar.setProgress(4);
			}
		});
	}
}