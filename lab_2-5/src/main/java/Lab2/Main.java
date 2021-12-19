package Lab2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //Java to Json converter
        Converter.toJSON(new Person("Alex", "Popenko", "+38000000001", "Kiev", "26 February 2002"));
        Person person = Converter.toJavaObject();
        System.out.println(person);

        //Json to Java Object
        ObjectMapper mapper = new ObjectMapper();
        //Read file and convert to Java Object
        InputStream fileInputStream = new FileInputStream("Person.json");
        Person post = mapper.readValue(fileInputStream, Person.class);
        fileInputStream.close();

        System.out.println("\nJSON to Java Object");
        System.out.println("First Name: " + post.getFirst_name());
        System.out.println("Last Name: " + post.getLast_name());
        System.out.println("Phone number: " + post.getPhone());
        System.out.println("Birth: " + post.getBirth());
        System.out.println("Address: " + post.getAddress());


        boolean res = person.equals(post);

        System.out.println("\n-- " + person.getFirst_name() + " - VS - " + post.getFirst_name());
        System.out.println(res);

    }

}
