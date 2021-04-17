

public class CodeAmonFactory {
    /**
     * Function returns specific code a mon based on the factory implementation.
     * @param name Name of the Code a mon user wishes to retrieve.
     * @return Code a mon.
     */
    public CodeAmon createCodeAmonFactory(CodeAmon.Name name){
        CodeAmon monster = null;
        if(name.equals(CodeAmon.Name.ALBERT)) {
            return new AlbertCodeAMon();
        } else if(name.equals(CodeAmon.Name.RALPHIE)) {
            return new RalphieCodeAMon();
        } else if(name.equals(CodeAmon.Name.BULLY)){
            return new BullyCodeAMon();
        } else if(name.equals(CodeAmon.Name.SPARKY)) {
            return new SparkyCodeAMon();
        } else {
            return null;
        }
    }
}
