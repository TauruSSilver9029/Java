package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        BirdCage V1 = new BirdCage();
        Eagle A1 = new Eagle("Eagle","Vala", 100, "Male");
        V1.putAnimal(A1);
        Eagle A2 = new Eagle("Eagle","Lilu", 100, "Female");
        V1.putAnimal(A2);
        Eagle A3 = new Eagle("Eagle","Abara", 100, "Male");
        V1.putAnimal(A3);


        LionCage V2 = new LionCage();
        Lion B1 = new Lion("Lion","Kala", 1000, "Male");
        V2.putAnimal(B1);
        Lion B2 = new Lion("Lion","Nala", 1000, "Male");
        V2.putAnimal(B2);
        Lion B3 = new Lion("Lion","Mala", 1000, "Male");
        V2.putAnimal(B3);
        Lion B4 = new Lion("Lion","Ala", 1000, "Male");
        V2.putAnimal(B4);

        HoovesCage V3 = new HoovesCage();
        Zebra C1 = new Zebra("Zebra","Emma", 1200, "Female");
        V3.putAnimal(C1);
        Zebra C2 = new Zebra("Zebra","Alex", 1200, "Male");
        V3.putAnimal(C2);
        Giraffe C3 = new Giraffe("Guraffe", "Sophia", 1200, "Female");
        V3.putAnimal(C3);
        Giraffe C4 = new Giraffe("Guraffe", "Amelia", 1200, "Female");
        V3.putAnimal(C4);

        List<Wild> listOfWild = new ArrayList<>();
        listOfWild.add(new Wild(1));
        test(listOfWild);
    }

    private static void test(List<? extends Wild> list){
        for(Wild wilds : list){
            System.out.print(wilds);
        }
    }

}
