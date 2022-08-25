import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestClass {
    Human father = new Human("Vito", "Karleone", 1955,
            95,
            new String[][]{{ DayOfWeek.MONDAY.name() + "do exercise"}}
    );
    Human mother = new Human("Jane", "Karleone", 1956,
            85,
            new String[][]{{DayOfWeek.TUESDAY.name() + "do exercise"}, {DayOfWeek.WEDNESDAY.name(), "relax"}}
    );
    Human childTest = new Human("Mika", "Karleone", 1999,
            90,
            new String[][]{{DayOfWeek.TUESDAY.name() + "do exercise"}, {DayOfWeek.WEDNESDAY.name(), "relax"}});
    Human childTest2 = new Human("Nika", "Karleone", 1995,
            85,
            new String[][]{{DayOfWeek.TUESDAY.name() + "do exercise"}, {DayOfWeek.WEDNESDAY.name(), "relax"}});
    Pet p = new Pet("Rock", Species.DOG, 5, 75, new String[]{"eat, drink, run"});

    Family family = new Family(mother, father, new ArrayList<>(), p);




    ArrayList<Human> addingChild() {
        family.addChild(childTest);
        return family.getChildren();
    }

        @Test
    public void testCounFamily() {


        assertEquals(family.countFamily(), 2);
    }

    @Test
    public void testAddChild() {
       addingChild();

        assertEquals(family.countFamily(), 3);
    }
    @Test
    public void testDeleteChild() { // Delete the child object by index that located into children
        addingChild();
        family.deleteChild(0);

        assertEquals(family.countFamily(), 2);
    }
    @Test
    public void testDeleteChild2() { // Delete the child object by reference that located into children
        addingChild();
        family.deleteChildByName(childTest);

        assertEquals(0, family.getChildren().size());
    }
    @Test
    public void testDeleteChild3() { // Delete the child object that not located into children
        addingChild();
        family.deleteChildByName(childTest2);

        assertEquals(1, family.getChildren().size());
    }

}
