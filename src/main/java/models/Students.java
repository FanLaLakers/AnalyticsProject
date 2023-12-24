package models;

public class Students {
    String FirstName;
    String LastName;
    String NameOfGroup;

    public Students (String FirstName, String LastName, String NameOfGroup) {
       this.FirstName = FirstName;
       this.LastName = LastName;
       this.NameOfGroup = NameOfGroup;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getNameOfGroup() {
        return NameOfGroup;
    }
}

