package Lab4;

public class Eagle extends Bird{
    public Eagle(String bird, String name, int weight, String sex) {
        super(bird, name, weight, sex);
        System.out.println(bird + " " + name + " " + weight + " " + sex);
    }
}
