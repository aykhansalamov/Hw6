

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Species getSpecies() {
        return species;
    }



    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species + " {" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.deepToString(habits) +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " objects collected by garbage collector in Pet class");
    }

    public Pet() {

    }





    public Pet(String nickName, Species species, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }



    public void respond() {
        System.out.println("Hello, owner. I am " + species + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void setHabits(String eat, String drink, String sleep) {
    }
}

