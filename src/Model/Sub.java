/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */

package Model;

public class Sub {
    //Variables
    private String bread;
    private String meat;
    private String cheese;
    private String[] veggies;
    private String condiment;

    //Getters and Setters
    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getMeat() {
        return meat;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public String[] getVeggies() {
        return veggies;
    }
    public void setVeggies(String[] veggies) {
        this.veggies = veggies;
    }
    public String getCondiment() {
        return condiment;
    }
    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    //Constructors
    public Sub() {
    }
    public Sub(String bread, String meat, String cheese, String[] veggies, String condiment) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.condiment = condiment;
    }
}
