package Lab4;

public class Giraffe extends Hooves{
    public Giraffe(String hooves, String name, int weight, String sex) {
        super(hooves, name, weight, sex);
        System.out.println(hooves + " " + name + " " + weight + " " + sex);
    }
}
