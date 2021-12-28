package task5.task2;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    public BusinessLogic businessLogic;

    public MenuController(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    public List<Book> WorkCommand(int command, String data){
        List<Book> list = new ArrayList<>();
        switch (command){
            case 1:
                list = businessLogic.getByAuthor(data);
                break;
            case 2:
                list = businessLogic.getByPublisher(data);
                break;
            case 3:
                list = businessLogic.getByYear(data);
                break;
            case 4:
                list = businessLogic.sortByPublishers();
                break;
        }
        return list;
    }
}
