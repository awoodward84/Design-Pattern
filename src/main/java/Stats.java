public class Stats {

    double attack;
    double defense;
    double health;

    /**
     * Constuctor.
     */
    public Stats() {
        attack = 50;
        defense = 50;
        health = 100;
    }

    /**Constructor for the stats of monstor mon.
     *
     * @param name Name of mascotmon
     */

    public Stats(CodeAmon.Name name) {
        switch (name) {
            case SERPANT:    //Water
                attack = 60;
                defense = 40;
                health = 100;
                break;
            case NESSIE:   //Ground
                attack = 30;
                defense = 65;
                health = 105;
                break;
            case DRAGON:    //Fire
                attack = 70;
                defense = 40;
                health = 90;
                break;
            case WEREWOLF:     //Normal
                attack = 40;
                defense = 40;
                health = 110;
                break;
            case SIREN:     //Sky
                attack = 35;
                defense = 50;
                health = 105;
                break;
            default:
                break;
        }
    }

    /**Method returns defense of monstor.
     *
     * @return defense of monster
     */
    public double getDefense() {
        return defense;
    }
}