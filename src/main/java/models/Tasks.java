package models;

public class Tasks {

    Categories Task_Categories;

    Integer Points_For_Task;

    Integer Max_Points;

    public Tasks(Categories Task_Categories, Integer Points_For_Task, Integer Max_Points){
        this.Task_Categories = Task_Categories;
        this.Points_For_Task = Points_For_Task;
        this.Max_Points = Max_Points;
    }

    public Categories getTask_Categories() {
        return Task_Categories;
    }

    public Integer getPoints_For_Task() {
        return Points_For_Task;
    }

    public Integer getMax_Points() {
        return Max_Points;
    }
}
