/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Sep 05, 2022
 */

package Model;

public class Combo extends Sub {
    //Variables
    private String drink;
    private String side;

    //Getters and Setters
    public String getDrink() {
        return drink;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }

    //Constructors
    public Combo() {
        super();
    }
    public Combo(String bread, String meat, String cheese, String[] veggies, String condiment, String drink, String side) {
        super(bread, meat, cheese, veggies, condiment);
        this.drink = drink;
        this.side = side;
    }
    public Combo(Sub sub, String drink, String side) {
        super(sub.getBread(), sub.getMeat(), sub.getCheese(), sub.getVeggies(), sub.getCondiment());
        this.drink = drink;
        this.side = side;
    }
}
