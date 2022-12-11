public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (averageMark == 5.00){
            return 3000;
        }
        else{
            return 2000;
        }
    }




}
