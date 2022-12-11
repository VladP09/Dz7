public class Aspirant extends Student {
    public String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship(){
        if (averageMark==5.00){
            return 5000;
        }
        else{
            return 3000;
        }
    }

}
