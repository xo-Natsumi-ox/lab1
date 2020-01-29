package ua.lviv.iot.firstlab;

public class Stadium {
    private static int numberOfStadiums;
    private int numberOfViewers;
    private String name;
    private int powerOfLightingInLux;
    private int openingYear;
    private String town;
    protected boolean workingNow;
    protected String country;


    public Stadium() {

    }

    public void resetValues(int numberOfStadium, int numberOfViewers, String name, int powerOfLightingInLux, int openingYear, String town, boolean workingNow, String country) {
        this.numberOfViewers = numberOfViewers;
        this.name = name;
        this.powerOfLightingInLux = powerOfLightingInLux;
        this.openingYear = openingYear;
        this.town = town;
        this.workingNow = workingNow;
        this.country = country;
        numberOfStadiums = numberOfStadium;
    }

    public Stadium(int numberOfStadium, int numberOfViewers, String name, int powerOfLightingInLux, int openingYear, String town, boolean workingNow, String country) {
        this.resetValues(numberOfStadium, numberOfViewers, name, powerOfLightingInLux, openingYear, town, workingNow, country);
    }

    public Stadium(int numberOfStadium, int numberOfViewers, String name, int powerOfLightingInLux, int openingYear) {
        this.resetValues(numberOfStadium, numberOfViewers, name, powerOfLightingInLux, openingYear, town, workingNow, country);
    }


    public static int getNumberOfStadiums() {
        return numberOfStadiums;
    }

    public static void setNumberOfStadiums(int numberOfStadiums) {
        Stadium.numberOfStadiums = numberOfStadiums;
    }

    public int getNumberOfViewers() {
        return numberOfViewers;
    }

    public void setNumberOfViewers(int numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfLightingInLux() {
        return powerOfLightingInLux;
    }

    public void setPowerOfLightingInLux(int powerOfLightingInLux) {
        this.powerOfLightingInLux = powerOfLightingInLux;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public boolean isWorkingNow() {
        return workingNow;
    }

    public void setWorkingNow(boolean workingNow) {
        this.workingNow = workingNow;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "numberOfStadiums = " + numberOfStadiums +
                ", numberOfViewers = " + numberOfViewers +
                ", name = '" + name + '\'' +
                ", powerOfLightingInLux = " + powerOfLightingInLux +
                ", openingYear = " + openingYear +
                ", town = '" + town + '\'' +
                ", workingNow = " + workingNow +
                ", country = '" + country + '\'' +
                '}';
    }

    void printNumberOfStadiums() {
        System.out.println("static numberOfStadiums = " + numberOfStadiums);
    }

    static void printNumberOfViewers(Stadium stadiumname) {
        System.out.println("numberOfViewers " + stadiumname.name + " = " + stadiumname.numberOfViewers);
    }

    static void printOpeningYear(Stadium stadiumname) {
        System.out.println("openingYear " + stadiumname.name + " = " + stadiumname.openingYear);
    }

    static void printPowerOfLightingInLux(Stadium stadiumname) {
        System.out.println("powerOfLightingInLux in " + stadiumname.name + " = " + stadiumname.powerOfLightingInLux);
    }
}
