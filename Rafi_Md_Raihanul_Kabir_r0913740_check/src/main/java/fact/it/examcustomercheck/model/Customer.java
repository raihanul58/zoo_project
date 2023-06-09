/**
 * Name: Md Raihanul Kabir Rafi
 * R- number: r0913740
 */

package fact.it.examcustomercheck;

public class Customer{
    private String name;
    private boolean citizen;
    private int yearOfRegistration;

    public boolean isCitizen() {
        return citizen;
    }

    public void setCitizen(boolean citizen) {
        this.citizen = citizen;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }



}