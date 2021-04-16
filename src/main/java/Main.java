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
            //Beginning of a new world
            Trainer train = new Trainer("Michael");
            Trainer train1 = new Trainer("Denis");

            Trainer train2 = new Trainer(train.createList(), train.getName());
            Trainer train3 = new Trainer(train1.createList(), train1.getName());

           // final CodeAmon attacker1 = new SparkyCodeAMon();
           // final CodeAmon defender1 = new AlbertCodeAMon();
            //final CodeAmon attacker2 = new BullyCodeAMon();
            //final CodeAmon defender2 = new RalphieCodeAMon();
            CodeAmonFactory factory = new CodeAmonFactory();
            CodeAmon attacker1 = null;
            CodeAmon defender1 = null;
            CodeAmon attacker2 = null;
            CodeAmon defender2 = null;
            attacker1 = factory.createCodeAmonFactory(CodeAmon.Name.SPARKY);
            defender1 = factory.createCodeAmonFactory(CodeAmon.Name.ALBERT);
            attacker2 = factory.createCodeAmonFactory(CodeAmon.Name.BULLY);
            defender2 = factory.createCodeAmonFactory(CodeAmon.Name.RALPHIE);
           // train2.addCodeMonster(attacker1);
           // train2.addCodeMonster(defender2);

           // train3.addCodeMonster(attacker1);
           // train3.addCodeMonster(defender1);


            //Create First battle scenario with two mons
            BattleScenario fight1 = new BattleScenario(attacker1, defender1);
            //Set the weather
            fight1.setEnvironment(Environment.Weather.sunny);
            //Initiate battle
            fight1.initiateBattle();
            System.out.println("This is the end of the training simulation");

            //Create Second battle scenario with two mons
           /* BattleScenario fight2 = new BattleScenario(attacker2, defender2, Environment.Weather.rainy);
            //Set the weather
            //fight2.setEnvironment(Environment.Weather.rainy);
            //Initiate battle
            fight2.initiateBattle();
            System.out.println("This is the end of the training simulation"); */
        }
    }
