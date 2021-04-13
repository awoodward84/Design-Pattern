import java.util.concurrent.ThreadLocalRandom;

public class CodeAmon {
    String description;
    public String type;
    public Name name;
    public Stats stats;
    //public double weatherBonus = 1.0;
    //public double typeBonus = 1.0;
    public int bufCounter = 0;

    /**
     * Constructor for class.
     */
    public CodeAmon() {
        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        if (rand == 0) {
            name = Name.SERPANT;
        } else if (rand == 1) {
            name = Name.NESSIE;
        } else if (rand == 2) {
            name = Name.DRAGON;
        } else {
            name = Name.WEREWOLF;
        }
        getType();
        getStats();
        getDescription();
    }

    /**
     * Constructor taske on name.
     * @param name of mascotmon.
     */
    public CodeAmon(Name name) {
        this.name = name;
        getType();
        getStats();
        getDescription();
    }

    private void getType() {
        Type t = new Type(name);
        this.type = t.type;
    }

    public Name getName() {
        return name;
    }

    private void getStats() {
        stats = new Stats(name);


    }

    private void getDescription() {
        Description desc = new Description(name);
        this.description = desc.description;
    }

    /**
     * Method randomly determines an attack to use based on the defending Mascotmon and
     * returns the base damage of the attack selected. The self-buff (attackNumber 0) can only be
     * used 3 times during a battle. You can assume that this method uses the values it is supposed
     * to use and is correct.
     * @return attack damage
     */
    public Attack attack() {
        double attackDamage = 0;
        int attackNumber = 0;

        while (true) {
            attackNumber = ThreadLocalRandom.current().nextInt(0, 4);
            if (attackNumber == 0 && bufCounter <= 2) {
                bufCounter++;
                break;
            } else if (attackNumber != 0) {
                break;
            }
        }

        String desc = "";
        Attack attack = null;

        switch (name) {
            case SERPANT:
                if (attackNumber == 0) {
                    desc = " uses Snake bite, increasing defense stat by 10%";
                    stats.defense *= 1.10;
                    attack = new Attack(0, "None");
                } else if (attackNumber == 1) {
                    desc = " uses Squeeze";
                    attack = new Attack(stats.attack, "Ground");
                } else if (attackNumber == 2) {
                    desc = " uses tail whip";
                    attack = new Attack(stats.attack, "Normal");
                } else {
                    desc = " uses Sea Salt";
                    attack = new Attack(stats.attack, "Water");
                }
                break;
            case NESSIE:
                if (attackNumber == 0) {
                    desc = " uses Lock Tight, increasing defense stat by 10%";
                    stats.defense *= 1.10;
                    attack = new Attack(0, "None");
                } else if (attackNumber == 1) {
                    desc = " uses Ground Stomp";
                    attack = new Attack(stats.attack, "Ground");
                } else if (attackNumber == 2) {
                    desc = " uses Staredown";
                    attack = new Attack(stats.attack, "Normal");
                } else {
                    desc = " uses Shakedown";
                    attack = new Attack(stats.attack, "Fire");
                }
                break;
            case DRAGON:
                if (attackNumber == 0) {
                    desc = " uses fire breath, increasing attack stat by 10%";
                    stats.attack *= 1.10;
                    attack = new Attack(0, "None");
                } else if (attackNumber == 1) {
                    desc = " uses Inferno";
                    attack = new Attack(stats.attack, "Fire");
                } else if (attackNumber == 2) {
                    desc = " uses spiked tail ";
                    attack = new Attack(stats.attack, "Normal");
                    System.out.println("Attack value: " + stats.attack);
                } else {
                    desc = " uses Lightning spell";
                    attack = new Attack(stats.attack, "Ground");
                }
                break;
            case WEREWOLF:
                if (attackNumber == 0) {
                    desc = " uses paw claws, increasing health stat by 10%";
                    double health = stats.health * 1.10;
                    stats.health = Math.round(health);
                    attack = new Attack(0, "None");
                } else if (attackNumber == 1) {
                    desc = " uses jaw munching";
                    attack = new Attack(stats.attack, "Normal");
                } else if (attackNumber == 2) {
                    desc = " uses Splash";
                    attack = new Attack(stats.attack, "Water");
                } else {
                    desc = " uses furry tail";
                    attack = new Attack(stats.attack, "Ground");
                }
                break;
            case SIREN:
                if (attackNumber == 0) {
                    desc = " uses Wings, increasing health stat by 10%";
                    double health = stats.health * 1.10;
                    stats.health = Math.round(health);
                    attack = new Attack(0, "None");
                } else if (attackNumber == 1) {
                    desc = " uses seductive songs";
                    attack = new Attack(stats.attack, "Normal");
                } else if (attackNumber == 2) {
                    desc = " uses Sharp teeth";
                    attack = new Attack(stats.attack, "Water");
                } else if (attackNumber == 3) {
                    desc = " uses Spell";
                    attack = new Attack(stats.attack, "Ground");
                } else {
                    desc = " uses Alarm";
                    attack = new Attack(stats.attack, "Sky");
                }
                break;
            default:
                break;
        }

        System.out.println(name.toString().toLowerCase() + desc);
        return attack;
    }

    public enum Name {
        SERPANT, NESSIE, DRAGON, WEREWOLF, SIREN
    }
}