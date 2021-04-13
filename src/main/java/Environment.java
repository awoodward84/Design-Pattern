public class Environment {
    boolean day;
    Weather weath;
    String buffedType;
    String debuffedType;
    //double buffModifier;
    //double debuffModifier;

    public Environment() {
        this(Weather.neutral);
    }

    /**
     * Environment constructor takes on type weather.
     * @param weather Condition in which battle takes place.
     */
    public Environment(Weather weather) {
        this.weath = weather;
        //this.buffModifier = 1.25;
        //this.debuffModifier = 0.75;
        switch (weather) {
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
        }
    }
    public Environment(Weather weatherType, boolean day){
        this.weath = weatherType;
        switch (weatherType) {
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
        }

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
