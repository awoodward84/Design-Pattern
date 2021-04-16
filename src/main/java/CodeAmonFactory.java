

public class CodeAmonFactory {

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
