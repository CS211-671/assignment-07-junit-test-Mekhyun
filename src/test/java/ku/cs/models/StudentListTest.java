package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    public void testStudentListFindStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405891", "Mek");
        studentList.addNewStudent("6610405892", "Stamp");
        studentList.addNewStudent("6610405893", "Jay");

        Student student = studentList.findStudentById("6610405891");

        String expected = "6610405891";
        String actual = student.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testGiveScoreToID() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405891", "Mek");
        studentList.addNewStudent("6610405892", "Stamp");
        studentList.addNewStudent("6610405893", "Jay");

        studentList.giveScoreToId("6610405891", 100);
        double expected = 100;
        double actual = studentList.findStudentById("6610405891").getScore();

        assertEquals(expected, actual);
    }

    @Test
    public void testViewGradeOf() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405891", "Mek");
        studentList.addNewStudent("6610405892", "Stamp");
        studentList.addNewStudent("6610405893", "Jay");

        studentList.giveScoreToId("6610405891", 100);
        studentList.viewGradeOfId("6610405891");
        String expected = "A";
        String actual = studentList.viewGradeOfId("6610405891");

        assertEquals(expected, actual);
    }

}