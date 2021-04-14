
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

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


    public void addCodeMonster(CodeAmon mon) {
        if(listOfMonster.size() >= 6 ) {
            System.out.println(getName() + ", you have to many code-a-mons");
        } else {
            listOfMonster.add(mon);
        }
    }

    /**
     * Retrieves a fighter or defender
     * @return
     */
    public CodeAmon retrieveMonster() {
        CodeAmon fighter = null;
        for (CodeAmon codeAmon : listOfMonster) {
            if (codeAmon != null) {
                fighter = codeAmon;
                break;
            }
        }
        return fighter;
    }
    public String getName() {
        return name;
    }
    public LinkedList<CodeAmon> createList(){
        return new LinkedList<CodeAmon>();
    }

    /**
     * Function rewards trainers with an additional code-a-mon
     */
  /*  public void rewardedCodeAMon(){
        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        CodeAmon reward = null;
        switch(rand) {
            case 1:
                reward = new CodeAmon(CodeAmon.Name.DRAGON);
                break;
            case 2:
                reward = new CodeAmon(CodeAmon.Name.SERPANT);
                break;
            case 3:
                reward = new CodeAmon(CodeAmon.Name.WEREWOLF);
                break;
            case 4:
                reward = new CodeAmon(CodeAmon.Name.NESSIE);
                break;
            case 5:
                reward = new CodeAmon(CodeAmon.Name.SIREN);
                break;
            default:
                break;
        } if(reward != null) {
            addCodeMonster(reward);
        }
    } */

}
