import java.util.LinkedList;

public class World {
    CodeAmonFactory factory = new CodeAmonFactory();
    LinkedList<Trainer> listOfTrainers;
    CodeAmon attacker1 = null;
    CodeAmon defender1 = null;
    CodeAmon attacker2 = null;
    CodeAmon defender2 = null;
    BattleScenario fight;
    Trainer train;
public World() {

}
    public World(LinkedList<Trainer> trainersList) {
        this.listOfTrainers = trainersList;
    }

    public void setNewWorld(Trainer train2, Trainer train3) {
        attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
        defender1 = factory.createCodeAmonFactory(CodeAmon.Name.ALBERT);
        attacker2 = factory.createCodeAmonFactory(CodeAmon.Name.BULLY);
        defender2 = factory.createCodeAmonFactory(CodeAmon.Name.RALPHIE);

        train2.addCodeMonster(attacker1);
        train2.addCodeMonster(defender2);

        train3.addCodeMonster(attacker2);
        train3.addCodeMonster(defender2);
        startBattle(train2, train3);
    }

    public void startBattle(Trainer train2, Trainer train3) {
        fight = new BattleScenario(train2, train3);
        fight.setEnvironment(Environment.Weather.sunny);
        //Initiate battle
        fight.initiateBattle();

        //fight.setEnvironment(Environment.Weather.rainy);
       // fight.initiateBattle();

        //fight.setEnvironment(Environment.Weather.drought);
       // fight.initiateBattle();
    }
}
