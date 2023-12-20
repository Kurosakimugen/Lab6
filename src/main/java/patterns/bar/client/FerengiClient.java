package patterns.bar.client;

import patterns.bar.strategy.OrderingStrategy;
import patterns.bar.strategy.SmartStrategy;

public class FerengiClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
