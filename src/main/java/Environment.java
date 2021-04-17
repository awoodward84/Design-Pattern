public class Environment {
    boolean day;
    Weather weath;
    String buffedType = null;
    String debuffedType = null;

    /**
     * Creating the one instance for the singleton pattern.
     */
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
    /**
     * Sets the weather type to user specifications.
     * @param weather used to set the environment type
     */
    public void setEnvironmentType(Weather weather) {
        if(weather.equals(Weather.sunny)) {
            this.buffedType = "Fire";        //Sparky
            this.debuffedType = "Water";     //Albert
            this.weath = Weather.sunny;
        } else if(weather.equals(Weather.rainy)) {
            this.buffedType = "Water";      //Albert
            this.debuffedType = "Fire";     //Sparky
            this.weath = Weather.rainy;
        } else if(weather.equals(Weather.drought)) {
            this.buffedType = "Ground";     //Ralphie
            this.debuffedType = "Normal";   //Bully
            this.weath = Weather.drought;
        } else {
                this.buffedType = "";
                this.debuffedType = "";
        }
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
