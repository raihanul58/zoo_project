/**
 * Name: Md Raihanul Kabir Rafi
 * R- number: r0913740
 */

package fact.it.zoo.model;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private int numberOfVisitors;
    private ArrayList<AnimalWorld> animalWorlds;

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public ArrayList<AnimalWorld> getAnimalWorlds() {
        return animalWorlds;
    }

    public int getNumberOfAnimalWorlds(){
        return -1;
    }

    public void addAnimalWorld(AnimalWorld animalWorld) {

    }

    public AnimalWorld searchAnimalWorldByName(String name) {
        return new AnimalWorld();
    }

    public void registerVisitor(Visitor visitor) {

    }
}
