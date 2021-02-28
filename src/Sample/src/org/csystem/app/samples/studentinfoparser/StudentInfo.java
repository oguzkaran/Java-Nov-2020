package org.csystem.app.samples.studentinfoparser;

import org.csystem.app.samples.date.DateUtil;

public class StudentInfo {
    public String name;
    public String birthDate;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    public double getGrade()
    {
        return midtermGrade * 0.3 + finalGrade * 0.6;
    }

    public String getDate()
    {
        String [] birthDateInfo = birthDate.split("[/]");
        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);

        return DateUtil.getDateTR(day, month, year);
    }

    public String toString()
    {
        double grade = getGrade();
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midtermGrade: %d, finalGrade: %d, grade: %f, status:%s}";

        return String.format(fmt, name, getDate(), lectureName, midtermGrade, finalGrade, grade,  grade >= 50 ? "Geçti" : "Kaldı");
    }
}
