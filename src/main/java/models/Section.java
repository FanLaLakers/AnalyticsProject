package models;

public class Section {
    String Section_Name;
    Tasks[] jobs;

    public Section(String Section_Name, Tasks[] jobs) {
        this.Section_Name = Section_Name;
        this.jobs = jobs;
    }

    public String getSection_Name() {
        return Section_Name;
    }

    public Tasks[] getJobs() {
        return jobs;
    }
}
