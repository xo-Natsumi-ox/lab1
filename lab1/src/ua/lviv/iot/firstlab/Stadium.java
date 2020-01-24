package ua.lviv.iot.firstlab;

public class Stadium {
    private static int number_of_stadiums;
    private int number_of_viewers;
    private String name;
    private int power_of_lighting_inlux;
    private int opening_year;
    private String town;
    protected boolean working_now;
    protected String country;


    Stadium() {

    }

    public Stadium(int Number_of_stadiums, int number_of_viewers, String name, int power_of_lighting_inlux, int opening_year, String town, boolean working_now, String country) {
        this.number_of_viewers = number_of_viewers;
        this.name = name;
        this.power_of_lighting_inlux = power_of_lighting_inlux;
        this.opening_year = opening_year;
        this.town = town;
        this.working_now = working_now;
        this.country = country;
        number_of_stadiums = Number_of_stadiums;

    }

    public Stadium(int Number_of_stadiums, int number_of_viewers, String name, int power_of_lighting_inlux, int opening_year) {
        this(Number_of_stadiums, number_of_viewers, name, power_of_lighting_inlux, opening_year, "unknown", false, "Ukraine");
    }

    public int getNumber_of_viewers() {
        return number_of_viewers;
    }

    public void setNumber_of_viewers(int number_of_viewers) {
        this.number_of_viewers = number_of_viewers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower_of_lighting_inlux() {
        return power_of_lighting_inlux;
    }

    public void setPower_of_lighting_inlux(int power_of_lighting_inlux) {
        this.power_of_lighting_inlux = power_of_lighting_inlux;
    }

    public int getOpening_year() {
        return opening_year;
    }

    public void setOpening_year(int opening_year) {
        this.opening_year = opening_year;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public static int getNumber_of_stadiums() {
        return number_of_stadiums;
    }

    public static void setNumber_of_stadiums(int number_of_stadiums) {
        Stadium.number_of_stadiums = number_of_stadiums;
    }

    public boolean isWorking_now() {
        return working_now;
    }

    public void setWorking_now(boolean working_now) {
        this.working_now = working_now;
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
                "number_of_stadiums = " + number_of_stadiums +
                ", number_of_viewers = " + number_of_viewers +
                ", name = '" + name + '\'' +
                ", power_of_lighting_inlux = " + power_of_lighting_inlux + " lux" +
                ", opening_year = " + opening_year +
                ", town = '" + town + '\'' +
                ", working_now = " + working_now +
                ", country = '" + country + '\'' +
                '}';
    }

    public void resetValues(int Number_of_stadiums, int number_of_viewers, String name, int power_of_lighting_inlux, int opening_year, String town, boolean working_now, String country) {
        this.number_of_viewers = number_of_viewers;
        this.name = name;
        this.power_of_lighting_inlux = power_of_lighting_inlux;
        this.opening_year = opening_year;
        this.town = town;
        this.working_now = working_now;
        this.country = country;
        number_of_stadiums = Number_of_stadiums;
    }

    void printNumber_of_stadiums() {
        System.out.println("static number_of_stadiums = " + number_of_stadiums);
    }

    static void printNumber_of_viewers(Stadium stadiumname) {
        System.out.println("number_of_viewers " + stadiumname.name + " = " + stadiumname.number_of_viewers);
    }

    static void printOpening_year(Stadium stadiumname) {
        System.out.println("opening_year " + stadiumname.name + " = " + stadiumname.opening_year);
    }

    static void printPower_of_lighting_inlux(Stadium stadiumname) {
        System.out.println("power_of_lighting_inlux in " + stadiumname.name + " = " + stadiumname.power_of_lighting_inlux);
    }
}
