package javaLearn._5;

public abstract class Profession {
    String professionName;
    String industry;

    public Profession(String name, String in){
        professionName = name;
        industry = in;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void doJob();

    @Override
    public String toString(){
        return "Profession Info: " + "\nProfession Name: " + professionName + "\nIndustry: " + industry + "\n";
    }
}

class Developer extends Profession{
    private String specialty;

    public Developer(String professionName, String industry, String specialty){
        super(professionName, industry);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void doJob(){
        System.out.println("Developer writes code ...");
    }

    @Override
    public String toString(){
        return "Developer Info: " + "\nProfession Name: " + this.getProfessionName() + "\nIndustry: " + this.getIndustry()
                 + "\nSpecialty: " + specialty;
    }
}

class Pilot extends Profession{
    private String aircraftType;

    public Pilot(String professionName, String industry, String aircraftType){
        super(professionName, industry);
        this.aircraftType = aircraftType;
    }

    @Override
    public void doJob() {
        System.out.println("Pilot controls " + this.aircraftType);
    }

    @Override
    public String toString(){
        return "Pilot Info: " + "\nProfession Name: " + this.getProfessionName() + "\nIndustry: " + this.getIndustry()
                + "\nAircraft type: " + aircraftType;
    }
}

class ProfessionDemo{
    public static void main(String[] args) {
        Developer developer = new Developer("Developer","IT","Java");
        Pilot pilot = new Pilot("Pilot", "Aviation","Boeing 737-800");
        Profession profession = new Developer("Developer","IT","C++");

        System.out.println(developer);
        System.out.println("==============");
        System.out.println(pilot);
        System.out.println("==============");
        System.out.println(profession);
    }
}