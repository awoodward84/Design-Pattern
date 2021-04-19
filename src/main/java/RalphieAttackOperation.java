public class RalphieAttackOperation implements CodeAmonStrategyBase {

    /**
     *Utilizing the strategy pattern to create Bully's attack.
     * @param attacker Type of Codeamon implmented through the Factory pattern
     * @param num Random number to choose which attack is necessary.
     * @return the attack used
     */
    @Override
    public Attack codeAMonAttack(CodeAmon attacker,int num) {
        String desc = "";
        Attack attack = null;

        if (num == 0) {
            desc = " uses Lock Tight, increasing defense stat by 10%";
            attacker.stats.defense *= 1.10;
            attack = new Attack(0, "None");
        } else if (num == 1) {
            desc = " uses Ground Stomp";
            attack = new Attack(attacker.stats.attack, "Ground");
        } else if (num == 2) {
            desc = " uses Staredown";
            attack = new Attack(attacker.stats.attack, "Normal");
        } else {
            desc = " uses Shakedown";
            attack = new Attack(attacker.stats.attack, "Fire");
        }
        System.out.println(attacker.name.toString().toLowerCase() + desc);
        return attack;
    }
}
