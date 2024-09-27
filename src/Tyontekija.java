public class Tyontekija {

    private String ttname;
    private String jobTitle;
    private int yearsOfExperience;

    public String getTtname() {
        return ttname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + ttname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }


    public Tyontekija(String ttname, String jobTitle, int yearsOfExperience) {
        this.ttname = ttname;
        this.jobTitle = jobTitle;
        this.yearsOfExperience = yearsOfExperience;
    }
}

