import java.util.LinkedList;

public class World {
    CodeAmonFactory factory = new CodeAmonFactory();
    CodeAmon attacker1 = null;
    CodeAmon defender1 = null;
    CodeAmon attacker2 = null;
    CodeAmon defender2 = null;
    BattleScenario fight;


    public World() {
    }


    /**
     * Method created a new world with two trainers.
     * @param train2 First trainer to enter the world.
     * @param train3 Second trainer to enter the world
     */
    public void setNewWorld(Trainer train2, Trainer train3) {
        attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
        defender1 = factory.createCodeAmonFactory(CodeAmon.Name.ALBERT);
        attacker2 = factory.createCodeAmonFactory(CodeAmon.Name.BULLY);
        defender2 = factory.createCodeAmonFactory(CodeAmon.Name.RALPHIE);

        train2.addCodeMonster(attacker1);
        train2.addCodeMonster(defender1);

        train3.addCodeMonster(attacker2);
        train3.addCodeMonster(defender2);
        startBattle(train2, train3);
    }

    /**
     * Starts the battle between the Trainers.
     * @param train2 First trainer to start the battle.
     * @param train3 Second trainer to start the battle.
     */
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
