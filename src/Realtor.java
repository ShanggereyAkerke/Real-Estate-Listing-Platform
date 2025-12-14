public class Realtor{
    private int id;
    private String licenseID;
    private String name;
    private String Number;
    private int yearsOfExperience;
    private double commissionRate;

    public Realtor(){}

   public Realtor(int id, String licenseID, String name, String Number, int yearsOfExperience, double commissionRate){
        this.id = id;
        this.licenseID = licenseID;
        this.name = name;
        this.Number = Number;
        this.yearsOfExperience = yearsOfExperience;
        this.commissionRate = commissionRate;
    }
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}

    public String getLicenseID() {
        return licenseID;}
    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;}

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}

    public String getNumber() {
        return Number;}
    public void setNumber(String number) {
        this.Number = number;}

    public int getYearsOfExperience() {
        return yearsOfExperience;}
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;}

    public double getCommissionRate() {
        return commissionRate;}
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;}

    public double calculateCost(double price){
        return price * (commissionRate /100);
    }
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("LicenseID: " + licenseID);
        System.out.println("Name: " + name);
        System.out.println("Number: " + Number);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Comission Rate: " + commissionRate);
    }


}
