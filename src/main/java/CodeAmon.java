import java.util.concurrent.ThreadLocalRandom;

public abstract class CodeAmon {
    String description;
    public String type;
    public Name name;
    public Stats stats;
    //public double weatherBonus = 1.0;
    //public double typeBonus = 1.0;
    public int bufCounter = 0;
    private CodeAmonStrategyBase strategy;
    /**
     * Constructor for class.
     */
   /* public CodeAmon() {
        int rand = ThreadLocalRandom.current().nextInt(0, 4);
        if (rand == 0) {
            name = Name.ALBERT;
        } else if (rand == 1) {
            name = Name.RALPHIE;
        } else if (rand == 2) {
            name = Name.SPARKY;
        } else {
            name = Name.BULLY;
        }
        getType();
        getStats();
        getDescription();
    } */

    /**
     * Constructor taske on name.
    // * @param name of mascotmon.
     */
   /* public CodeAmon(Name name) {
        this.name = name;
        getType();
        getStats();
        getDescription();
        getStrategy();
    } */

    public void getStrategy() {
        if(name.equals(Name.ALBERT)) {
            strategy = new AlbertAttackOperation();
        } else if(name.equals(Name.SPARKY)) {
            strategy = new SparkyAttackOperation();
        } else if(name.equals(Name.RALPHIE)) {
            strategy = new RalphieAttackOperation();
        } else if(name.equals(Name.BULLY)) {
            strategy = new BullyAttackOperation();
        } else {
            strategy = null;
        }
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void getType() {
        Type t = new Type(name);
        this.type = t.type;
    }


    public Name getName() {
        return name;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getStats() {
        stats = new Stats(name);


    }

    public void getDescription() {
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
        //Utilizing the strategy pattern here.
       return strategy.codeAMonAttack(this, attackNumber);
    }
    public enum Name {
        ALBERT, RALPHIE, SPARKY, BULLY
    }
    /*public enum Name {
        SERPANT, NESSIE, DRAGON, WEREWOLF, SIREN
    } */
}