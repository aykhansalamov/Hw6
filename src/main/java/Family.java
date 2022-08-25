import java.util.ArrayList;


public class Family {
    private Human mother;
    private Human father;
    private Human child;
    private ArrayList<Human> children;
    private Pet pet;



    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }


    public void addChild(Human ch) {
        this.children.add(ch);
    }

    // {
    //    System.out.println(countFamily());
    //  }

    public void deleteChild(int indexOfChild) {
        children.remove(indexOfChild);
    }
    public void deleteChildByName(Human child) {
        children.remove(child);
    }

    public int countFamily() {

        return this.children.size() + 2;

    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " objects collected by garbage collector in Family class");
    }

}