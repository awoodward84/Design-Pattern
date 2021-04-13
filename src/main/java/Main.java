import java.util.ArrayList;

public class Main {
    /**
     * Michael Woodward
     * SER316 Spring 21 Session B
     * @param args
     */
        /**
         * Main starting class of project.
         * @param args Parameters can take in or set to on project.
         */
        public static void main(String[] args) {
            Trainer train = new Trainer("Michael");
            Trainer train1 = new Trainer("Denis");

            Trainer train2 = new Trainer(train.createList(), train.getName());
            Trainer train3 = new Trainer(train1.createList(), train1.getName());

            /*   CodeAmon attacker1 = new CodeAmon(CodeAmon.Name.DRAGON);
            CodeAmon defender1 = new CodeAmon(CodeAmon.Name.SERPANT);
            final CodeAmon attacker2 = new CodeAmon(CodeAmon.Name.WEREWOLF);
            final CodeAmon defender2 = new CodeAmon(CodeAmon.Name.NESSIE);

            //Create First battle scenario with two mons
            BattleScenario fight1 = new BattleScenario(attacker1, defender1);
            //Set the weather
            fight1.setEnvironment(Environment.Weather.sunny);
            //Initiate battle
            fight1.initiateBattle();
            System.out.println("This is the end of the training simulation");

            //Create Second battle scenario with two mons
            BattleScenario fight2 = new BattleScenario(attacker2, defender2);
            //Set the weather
            fight2.setEnvironment(Environment.Weather.rainy);
            //Initiate battle
            fight2.initiateBattle();
            System.out.println("This is the end of the training simulation"); */
        }
    }
