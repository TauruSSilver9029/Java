package Lab4;

public class Animals {

    private String name;
    private int weight;
    // is this boy?
    private String sex;
    private String animal;

    public Animals(String animal, String name, int weight, String sex) {
        this.animal = animal;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public String getAnimal(){
        return animal;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSexSex() {
        return sex;
    }

    public void setSex(boolean isMale) {
        this.sex = sex;
    }

}
