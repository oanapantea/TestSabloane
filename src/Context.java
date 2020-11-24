public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Phone ph){
        strategy.render(ph);
    }
}
