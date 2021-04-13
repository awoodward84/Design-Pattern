import java.util.LinkedList;

public class Trainer {
    String name;
    LinkedList<CodeAmon> listOfMonster;

    public Trainer(String trainName) {
        this.name = trainName;
    }
    public Trainer(LinkedList<CodeAmon> code, String tName) {
        this.listOfMonster = code;
        this.name = tName;
    }


    public void addMonster(CodeAmon mon) {
        if(listOfMonster.size() >= 6 ) {
            System.out.println(getName() + ", have to many code-a-mons");
        } else {
            listOfMonster.add(mon);
        }
    }

    public String getName() {
        return name;
    }
    public LinkedList<CodeAmon> createList(){
        return new LinkedList<CodeAmon>();
    }

}
