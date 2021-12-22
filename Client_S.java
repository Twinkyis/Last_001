package Last.Strategy;

public class Client_S {
    Strategy strategy;

    public void getStrategy (Strategy strategy) {this.strategy = strategy;}
    public void executeStrategy(int []arr) {strategy.sort(arr); }

}
