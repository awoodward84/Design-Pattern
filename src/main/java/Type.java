public class Type {

    String type;

    public Type() {
        type = "Normal";
    }

    /**
     * Specifies the type of mascotmon.
     * @param name Takes on the name to specify.
     */
    public Type(CodeAmon.Name name) {
        if (name.equals(CodeAmon.Name.ALBERT)) {
            type = "Water";
        } else if (name.equals(CodeAmon.Name.RALPHIE)) {
            type = "Ground";
        } else if (name.equals(CodeAmon.Name.SPARKY)) {
            type = "Fire";
        } else {
            type = "Normal";
        }
    }
}

