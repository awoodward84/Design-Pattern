public class BattleScenario {

        CodeAmon mon1;
        CodeAmon mon2;
        Stats mon1Stats;
        //Stats mon2Stats;
        Environment battleWeather;

        public BattleScenario(CodeAmon pmon1, CodeAmon pmon2) {
            setMon1(pmon1);
            setMon2(pmon2);
        }

        /**
         * Sets environment of the battlefield, and sets buff/debuff modifiers for all Mascotmons on the
         * field. If the Mascotmon's type is buffed by the environment,they receive a 25% multiplier to
         * their attack and defense stat. If the Mascotmon's type is debuffed by the environment, they
         * receive a reduction of 25% to their attack and defense stat.
         * @param pweather is the weather enum to use from Environment class
         */
        public void setEnvironment(Environment.Weather pweather) {
            battleWeather = new Environment(pweather);
        }

        //Getter method for returning batte environment
        public Environment getEnvironment() {
            return battleWeather;
        }

        /**
         * Initial battle method which contains print descriptions.
         */
        public void initiateBattle() {

            // initiate stats for mon1 and mon2
            mon1Stats = new Stats(mon1.name);
            //mon2Stats = new Stats(mon2.name);
            System.out.println("Woooo: "
                    + mon1Stats.health);

            System.out.println("\nWelcome everyone to the Mascotmon training arena!");
            System.out.println("It is a " + battleWeather.weath.toString().toLowerCase()
                    + " day here at Frank Kush Field");
            System.out.println("Today, on the attacking team we have " + mon1.name + " "
                    + mon1.description);
            System.out.println("Their opponent, on the defending team is " + mon2.name + " "
                    + mon2.description);
            System.out.println(mon2.name + " prepares for the incoming attack");

            CodeAmon winner = fight();
            System.out.println(winner.name + " has won with " + winner.stats.health
                    + " health left");
        }

        /**
         * Sample fight scenario of two rounds.
         * Each Mascotmon uses one random attack per round; this attack multiplier is used to calculate
         * damage output against opposing mascotmon.
         */
        public CodeAmon fight() {
            int round = 1;
            double damage1;
            double damage2;

            Attack attack1;
            Attack attack2;

            while (true) {
                //Mon 1's turn:
                System.out.println("\n" + mon1.name + " launches an attack against " + mon2.name + "!");
                attack1 = mon1.attack();

                //Calculate damage:
                damage1 = calculateDamage(attack1, mon1, mon2);
                System.out.println(damage1 + " damage dealt");

                //Adjust mon2's health:
                mon2.stats.health = mon2.stats.health - damage1;
                System.out.println(mon2.name + " has " + mon2.stats.health + " health left");

                //Mon 2's turn:
                System.out.println("\n" + mon2.name  + " launches an attack against "
                        + mon1.name + "!");
                attack2 = mon2.attack();

                //Calculate damage:
                damage2 = calculateDamage(attack2, mon2, mon1);
                System.out.println(damage2 + " damage dealt");

                //Adjust mon1's health:
                mon1.stats.health = mon1.stats.health - damage2;
                System.out.println(mon1.name + " has " + mon1.stats.health + " health left");

                //Battle terminating condition:
                //Changed this to add a more even termiating condition: Deterministic approach
                if (mon2.stats.health <= 0.0 || mon1.stats.health <= 0.0) {
                    if (mon2.stats.health <= 0.0) {
                        System.out.println(mon2.name + " has fainted in round " + round);
                        return mon1;
                    } else if (mon1.stats.health <= 0.0) {
                        System.out.println(mon1.name + " has fainted in round " + round);
                        return mon2;
                    }
                }
                round++;
            }
        }


        public void setMon1(CodeAmon pmonOne) {
            mon1 = pmonOne;
        }


        public void setMon2(CodeAmon pmonTwo) {
            mon2 =  pmonTwo;
        }


        /**
         * TO DO: Implement for Assignment 3
         * This method implements the calculation of damage for one specific attack.
         * One monster attacks with the given damage, the dealt damage is then calculated through
         * (pAttackDamage * pattacker.weatherBonus * pattacker.typeBonus) -
         (pdefender.stats.defense * pdefender.weatherBonus * pdefender.typeBonus)
         * If the initial pAttackDamage is 0, then the damage dealt is 0. If the totalDamage calculated
         * is negative, the totalDamage dealt should be 1. Any positive value is the total damage
         * dealt. Weather bonus: see the Environment which you can assume is correct. You need to check
         * though if the weather bonus is applied
         * correctly, since maybe the method does not use the environment correctly.
         * or debuffed based on the weather. EG. fire monsters have a stat advantage of +25% in sunny
         * weather while they have a stat disadvantage of -25% in the rain.
         * If the attack chosen, matches the monsters type, the attacker will get an extra 20% on
         * its attack. Type bonus: Certain monsters have an attack bonus against others:
         *  5   Fire against Water: Water gains 25% while Fire looses 25%
         *  4   Fire against Ground: Fire gains 25% while Ground looses 25%
         *  6   Ground against Water: Ground gains 25% while Water looses 25%
         *      Normal mon: never gain any type bonus and are weaker during droughts.
         * These bonuses do not stack up, they are just applied for every attack.
         * @param pattack is the attack value given to the method where that attack value is based
         *                on the monsters damage value.
         * @param pattacker the attacking monster
         * @param pdefender the defending monster (the defending monster will never get damage)
         *                to calculate damage output.
         * @return total damage output
         */
        public double calculateDamage(Attack pattack, CodeAmon pattacker, CodeAmon pdefender) {
            double result = 0;
            String attackTyp = pattack.getType();
            double attackDam = pattack.getDamage();

            double typebonusAttacker = 1;
            double typebonusDefender = 1;

            double envbonusAttack = 1;
            double envbonusDefend = 1;
            double attackBonus = 1;

            String buff = battleWeather.getBuffedType();
            String debuff = battleWeather.getDebuffedType();

            double defense = pdefender.stats.defense;
            if (attackDam == 0.0) {
                return 0;
            } else {
                if (pattacker.name.equals(CodeAmon.Name.DRAGON)
                        && pdefender.name.equals(CodeAmon.Name.SERPANT)) {
                    typebonusAttacker = 0.75;
                    typebonusDefender = 1.25;
                }
                if (pattacker.name.equals(CodeAmon.Name.SERPANT)
                        && pdefender.name.equals(CodeAmon.Name.DRAGON)) {
                    typebonusAttacker = 1.25;
                    typebonusDefender = 0.75;
                }
                if (pattacker.name.equals(CodeAmon.Name.DRAGON)
                        && pdefender.name.equals(CodeAmon.Name.NESSIE)) {
                    typebonusAttacker = 1.25;
                    typebonusDefender = 0.75;
                }
                if (pattacker.name.equals(CodeAmon.Name.NESSIE)
                        && pdefender.name.equals(CodeAmon.Name.DRAGON)) {
                    typebonusAttacker = 0.75;
                    typebonusDefender = 1.25;
                }
                if (pattacker.name.equals(CodeAmon.Name.NESSIE)
                        && pdefender.name.equals(CodeAmon.Name.SERPANT)) {
                    typebonusAttacker = 1.25;
                    typebonusDefender = 0.75;
                }
                if (pattacker.name.equals(CodeAmon.Name.SERPANT)
                        && pdefender.name.equals(CodeAmon.Name.NESSIE)) {
                    typebonusAttacker = 0.75;
                    typebonusDefender = 1.25;
                }
                /////Environmental Bonus here
                if (pattacker.type.equals(buff)) {
                    envbonusAttack = 1.25;
                }
                if (pdefender.type.equals(debuff)) {
                    envbonusDefend = 0.75;
                }
                if (pattacker.type.equals(debuff)) {
                    envbonusAttack = 0.75;
                }
                if (pdefender.type.equals(buff)) {
                    envbonusDefend = 1.25;
                }
                if (attackTyp.equals("Fire") && pattacker.name.equals(CodeAmon.Name.DRAGON)) {
                    attackBonus = 1.20;
                }
                if (attackTyp.equals("Water") && pattacker.name.equals(CodeAmon.Name.SERPANT)) {
                    attackBonus = 1.20;
                }
                if (attackTyp.equals("Ground") && pattacker.name.equals(CodeAmon.Name.NESSIE)) {
                    attackBonus = 1.20;
                }
                if (attackTyp.equals("Normal") && pattacker.name.equals(CodeAmon.Name.WEREWOLF)) {
                    attackBonus = 1.20;
                }

                result = (attackDam * envbonusAttack * attackBonus * typebonusAttacker) - (defense
                        * envbonusDefend * typebonusDefender);
                if (result < 0) {
                    result = 1;
                }
                return result;
            }
        }
    }
