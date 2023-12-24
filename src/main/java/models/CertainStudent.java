package models;

public class CertainStudent extends Students{
    private Courses[] Course_Progress;
    public CertainStudent(String FirstName, String LastName, String NameOfGroup) {
        super(FirstName, LastName, NameOfGroup);
    }

    public Courses[] getCourse_Progress() {
        return Course_Progress;
    }
}
