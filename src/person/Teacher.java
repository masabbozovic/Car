package person;

public class Teacher extends Person {

    private String mainSubject;
    private int experienceYear;

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
    }

    public Teacher(String name, String surname, String jmbg, String mainSubject, int experienceYear) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.experienceYear = experienceYear;
    }

    @Override
    public void showData() {

        System.out.println("Main subject: " + getMainSubject());
        System.out.println("Experience year: " + getExperienceYear());
        super.showData();
    }

}
