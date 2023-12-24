package models;

public class Courses{
    Tasks Tasks_From_Section;
    Integer Course_Points;
    Integer Max_Course_Points = 3243;
    Double Course_Percentage;
    public Courses(Tasks Tasks_From_Section, Integer Course_Points){
        this.Tasks_From_Section = Tasks_From_Section;
        this.Course_Points = Course_Points;
    }

    public Tasks getTasks_From_Section() {
        return Tasks_From_Section;
    }

    public Integer getCourse_Points() {
        return Course_Points;
    }

    public Double getCourse_Percentage() {
        return Course_Percentage;
    }
}
