package org.csystem.app.samples.studentinfoparser;

public class StudentInfoParser {
    public StudentInfo studentInfo;

    //...
    public StudentInfoParser(String str)
    {
        /*
            <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
            Oğuz Karan:10/09/1976:Programlamaya Giriş:76:89
        */
        String [] studentInfoStr = str.split("[:]+");

        //...

        studentInfo = new StudentInfo();
        studentInfo.name = studentInfoStr[0];
        studentInfo.birthDate = studentInfoStr[1];
        studentInfo.lectureName = studentInfoStr[2];
        studentInfo.midtermGrade = Integer.parseInt(studentInfoStr[3]);
        studentInfo.finalGrade = Integer.parseInt(studentInfoStr[4]);
    }
}
