package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Valers {


    private final static int CageLimit=2;

    List<Animals> result = new ArrayList<Animals>();

    public void putAnimal(Animals a) {


        int numAnimals=result.size();

        if (result.size() >= 2) {
            System.out.println("This cage is full!\n");
            return;
        }

        else {
            this.result.add(a);
            System.out.println("Animal added in cage");
            System.out.println("  ");
        }
    }

    public int getCageAnimals() {
        return result.size();
    }

}
