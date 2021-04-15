/**
 * Strategy pattern interface.
 * Decouples the information and allows the context to change dynamically.
 */
public interface CodeAmonStrategyBase {


    public Attack codeAMonAttack(CodeAmon attacker, int num);

}
