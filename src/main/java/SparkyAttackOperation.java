public class SparkyAttackOperation implements CodeAmonStrategyBase{
    /**
     *
     * @param attacker Type of Codeamon implmented through the Factory pattern
     * @param num Random number to choose which attack is necessary.
     * @return the attack used
     */
    @Override
    public Attack codeAMonAttack(CodeAmon attacker,int num) {
        String desc = "";
        Attack attack = null;
        if (num == 0) {
            desc = " uses fire breath, increasing attack stat by 10%";
            attacker.stats.attack *= 1.10;
            attack = new Attack(0, "None");
        } else if (num == 1) {
            desc = " uses Inferno";
            attack = new Attack(attacker.stats.attack, "Fire");
        } else if (num == 2) {
            desc = " uses spiked tail ";
            attack = new Attack(attacker.stats.attack, "Normal");
            //System.out.println("Attack value: " + attacker.stats.attack);
        } else {
            desc = " uses Lightning spell";
            attack = new Attack(attacker.stats.attack, "Ground");
        }
        System.out.println(attacker.name.toString().toLowerCase() + desc);
        return attack;
        }

    }