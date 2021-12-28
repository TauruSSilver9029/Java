package task5.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task {
    public static void main(String[] args) throws IOException {
        BusinessLogic bs = new BusinessLogic();
        MenuController mc = new MenuController(bs);
        MainUI(mc);
    }

    public static void createMenu(){
        System.out.println("_____________________________________");
        System.out.println("press 1 to get books by Author");
        System.out.println("press 2 to get books by Publisher");
        System.out.println("press 3 to get newer books than year");
        System.out.println("press 4 to sort books by publishers");
        System.out.println("press 5 to save data in file");
        System.out.println("press 6 to import data from file");
        System.out.println("press 7 to quit");
    }

    public static int readChar(Scanner in) throws IOException {
        System.out.print("Input a number: ");
        return in.nextInt();
    }

    public static void MainUI(MenuController mc) throws IOException {
        boolean started = true;
        String data = "";
        Scanner in = new Scanner(System.in);

        while(started){
            createMenu();
            switch (readChar(in)){
                case 1:
                    data = readData("Author",in);
                    printres(mc.WorkCommand(1, data));
                    break;
                case 2:
                    data = readData("Publisher",in);
                    printres(mc.WorkCommand(2, data));
                    break;
                case 3:
                    data = "" + readChar(in);
                    printres(mc.WorkCommand(3, data));
                    break;
                case 4:
                    printres(mc.WorkCommand(4, data));
                    break;
                case 5:
                    in.nextLine();
                    System.out.println("Enter path to save in:");
                    String filePath = in.nextLine();
                    saveInFile(mc.WorkCommand(4, data), filePath);
                    break;
                case 6:
                    in.nextLine();
                    System.out.println("Enter path to load from:");
                    String path = in.nextLine();
                    System.out.println(loadFromFile(path));
                    break;
                case 7:
                    started = false;
                    break;
                default:
                    break;
            }
            System.out.println(" ");
        }
        in.close();
    }

    public static String readData(String data, Scanner in) throws IOException {
        System.out.print("Input " + data +": ");
        return in.next();
    }

    public static void printres(List<Book> books){
        if(books.isEmpty()){
            System.out.println("Nothing was found");
        }
        else{
            books.forEach(i -> System.out.println(i.title +" "+i.author+" "+ i.publisher+" "+i.year));
        }
    }

    public static void saveInFile(List<Book> books, String path) throws IOException {
        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream(path))) {
            output.writeObject(books);
        }
    }

    public static List<Book> loadFromFile(String path) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Book>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
