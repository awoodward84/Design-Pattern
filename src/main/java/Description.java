public class Description {

    public String description;

    public Description() {
        description = "New mascot";
    }

    /**
     *  Description of the mascotmon.
     * @param name Takes on the names of the mascotmon.
     */
    public Description(CodeAmon.Name name) {
        String n = name.toString();

        if (n.equals("ALBERT")) {
            description = "The Alligator";
        } else if (n.equals("RALPHIE")) {
            description = "The Buffalo";
        } else if (n.equals("SPARKY")) {
            description = "The Sun Devil";
        } else if (n.equals("BULLY")) {
            description = "The Bull Dog";
        } else {
            description = "New mascot";
        }
    }
}