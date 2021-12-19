package Lab4;

public class Zebra extends Hooves{
    public Zebra(String hooves, String name, int weight, String sex) {
        super(hooves, name, weight, sex);
        System.out.println(hooves + " " + name + " " + weight + " " + sex);
    }
}
