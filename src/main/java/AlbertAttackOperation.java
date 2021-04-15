

public class AlbertAttackOperation implements CodeAmonStrategyBase{

    @Override
    public Attack codeAMonAttack(CodeAmon attacker,int num){
        String desc = "";
        Attack attack = null;
        if (num == 0) {
            desc = " uses Snake bite, increasing defense stat by 10%";
            attacker.stats.defense *= 1.10;
            attack = new Attack(0, "None");
        } else if (num == 1) {
            desc = " uses Squeeze";
            attack = new Attack(attacker.stats.attack, "Ground");
        } else if (num == 2) {
            desc = " uses tail whip";
            attack = new Attack(attacker.stats.attack, "Normal");
        } else {
            desc = " uses Sea Salt";
            attack = new Attack(attacker.stats.attack, "Water");
        }
        System.out.println(attacker.name.toString().toLowerCase() + desc);
        return attack;
    }
}
