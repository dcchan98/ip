
public class Duke {


    public static void main(String[] args) {
        Ui myDukeBot = new Ui();
        Storage myStorage = new Storage();
        myDukeBot.greeting();
        myStorage.createDirectory("ToDo");
        myStorage.populateList(myDukeBot);
        myDukeBot.list();
        myDukeBot.listener();
        myStorage.updateDirectory(myDukeBot);
        System.out.println("End");

    }

}
