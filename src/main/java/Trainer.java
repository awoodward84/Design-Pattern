
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Trainer {
    String name;
    LinkedList<CodeAmon> listOfMonster;
    int streak;

    public Trainer(String trainName) {
        this.name = trainName;
    }

    /**
     * Constructor creates trainers with a list of code a mon a name and a winning streak.
     * @param code List of codeamon.
     * @param tname Name of Codeamon.
     * @param winningStreak How often the trainer wins.
     */
    public Trainer(LinkedList<CodeAmon> code, String tname, int winningStreak) {
        this.listOfMonster = code;
        this.name = tname;
        this.streak = winningStreak;
    }

    /**
     * Adds a monster to the Trainer's list of codeamon.
     * @param mon Specified monster.
     */
    public void addCodeMonster(CodeAmon mon) {
        if (listOfMonster.size() >= 6) {
            System.out.println(getName() + ", you have too many code-a-mons");
        } else {
            listOfMonster.add(mon);
        }
    }

    public int getStreak() {
        return streak;
    }

    public void incrementStreak(Trainer train) {
        train.streak = train.streak++;
    }

    /**
     * Retrieves a fighter or defender.
     * @return
     */
    public CodeAmon retrieveMonster(Trainer train) {
        CodeAmon fighter = null;
        for (int i = 0; i < train.listOfMonster.size(); i++) {
            if (train.listOfMonster.get(i) != null) {
                fighter = train.listOfMonster.get(i);
                break;
            }
        }
        return fighter;
    }

    public String getName() {
        return name;
    }

    public LinkedList<CodeAmon> createList() {
        return new LinkedList<CodeAmon>();
    }

    public void setListOfMonster(LinkedList<CodeAmon> listOfMonster) {
        this.listOfMonster = listOfMonster;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    /**
     * Removes a codeamon from the trainers list.
     * @param train Which specific trainer.
     * @param monster Type of monster to be removed.
     */
    public void removeCodeAmon(Trainer train, CodeAmon monster) {

        if (train.listOfMonster.isEmpty()) {
            return;
        } else {
            for (int i = 0; i < train.listOfMonster.size(); i++) {
                if (train.listOfMonster.get(i).equals(monster)) {
                    train.listOfMonster.remove(i);
                    System.out.println(train.getName() + ", you have lost this round "
                            + " thus losing the code a mon " + monster.name);
                    break;
                }
            }
        }
    }

    /**
     * Function rewards trainers with an additional code-a-mon.
     */
    public void rewardedCodeAMon(Trainer train) {
        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        CodeAmonFactory fact = new CodeAmonFactory();
        CodeAmon reward = null;
        switch (rand) {
            case 1:
                reward = fact.createCodeAmonFactory(CodeAmon.Name.SPARKY);
                break;
            case 2:
                reward = fact.createCodeAmonFactory(CodeAmon.Name.ALBERT);
                break;
            case 3:
                reward = fact.createCodeAmonFactory(CodeAmon.Name.BULLY);
                break;
            case 4:
                reward = fact.createCodeAmonFactory(CodeAmon.Name.RALPHIE);
                break;
            default:
                break;
        }
        if (reward != null) {
            train.addCodeMonster(reward);
        }
    }

}
