/**
 * Strategy pattern interface.
 * Decouples the information and allows the context to change dynamically.
 */
public interface CodeAmonStrategyBase {

    /**
     *Function each strategy implements.
     * @param attacker Type of Codeamon implmented through the Factory pattern.
     * @param num Random number to choose which attack is necessary.
     * @return An attack from a monster chosen at runtime.
     */
    public Attack codeAMonAttack(CodeAmon attacker, int num);

}
