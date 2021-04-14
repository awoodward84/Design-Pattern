public class Environment {
    boolean day;
    Weather weath;
    String buffedType;
    String debuffedType;
    private static final Environment instance = new Environment();

    private Environment() {
    }

    /**
     * Eager Initialization, simplest method of creating a singleton class.
     * @return One Instance of Environment type.
     */
    public static Environment getInstance() {
        return instance;
    }
    /*public Environment() {
        this(Weather.neutral);
    } */

    /**
     * Environment constructor takes on type weather.
     * @param weather Condition in which battle takes place.
     */
    public void setEnvironmentType(Weather weather) {
        if(weather.equals(Weather.sunny)) {
            this.buffedType = "Fire";        //Sparky
            this.debuffedType = "Water";     //Albert
            this.weath = Weather.sunny;
        } if(weather.equals(Weather.rainy)) {
            this.buffedType = "Water";      //Albert
            this.debuffedType = "Fire";     //Sparky
            this.weath = Weather.rainy;
        } if(weather.equals(Weather.drought)) {
            this.buffedType = "Ground";     //Ralphie
            this.debuffedType = "Normal";   //Bully
            this.weath = Weather.drought;
        } else {
                this.buffedType = "";
                this.debuffedType = "";
        }
      /*  switch (weather) {
            case sunny:
                this.buffedType = "Fire";        //Sparky
                this.debuffedType = "Water";     //Albert
                break;
            case rainy:
                this.buffedType = "Water";      //Albert
                this.debuffedType = "Fire";     //Sparky
                break;
            case drought:
                this.buffedType = "Ground";     //Ralphie
                this.debuffedType = "Normal";   //Bully
                break;
            default:
                this.buffedType = "";
                this.debuffedType = "";
                break;
        } */
    }

    public Weather getWeath() {
        return weath;
    }

    public String getBuffedType() {
        return buffedType;
    }

    public String getDebuffedType() {
        return debuffedType;
    }

    public enum Weather {
        sunny, rainy, drought, neutral
    }
}
