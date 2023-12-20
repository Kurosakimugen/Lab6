package patterns.bar.client;

import patterns.bar.strategy.ImpatientStrategy;
import patterns.bar.strategy.OrderingStrategy;

public class RomulanClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
