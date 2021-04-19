

public class BullyAttackOperation implements CodeAmonStrategyBase {

    /**
     *Utilizing the strategy pattern to create Bully's attack.
     * @param attacker Type of Codeamon implemented through the Factory pattern.
     * @param num Random number to choose which attack is necessary.
     * @return the attack used
     */
    @Override
    public Attack codeAMonAttack(CodeAmon attacker,int num) {
        String desc = "";
        Attack attack = null;
        if (num == 0) {
            desc = " uses paw claws, increasing health stat by 10%";
            double health = attacker.stats.health * 1.10;
            attacker.stats.health = Math.round(health);
            attack = new Attack(0, "None");
        } else if (num == 1) {
            desc = " uses jaw munching";
            attack = new Attack(attacker.stats.attack, "Normal");
        } else if (num == 2) {
            desc = " uses Splash";
            attack = new Attack(attacker.stats.attack, "Water");
        } else {
            desc = " uses furry tail";
            attack = new Attack(attacker.stats.attack, "Ground");
        }
        System.out.println(attacker.name.toString().toLowerCase() + desc);
        return attack;
    }
}
