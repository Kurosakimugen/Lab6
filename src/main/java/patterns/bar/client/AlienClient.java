package patterns.bar.client;

import patterns.StringDrink;
import patterns.StringRecipe;
import patterns.bar.Bar;
import patterns.bar.StringBar;
import patterns.bar.strategy.OrderingStrategy;

public abstract class AlienClient implements Client {
  private OrderingStrategy strategy;

  public AlienClient() {
      this.strategy = createOrderingStrategy();
  }

  @Override
  public void happyHourStarted(Bar bar) {
      strategy.happyHourStarted((StringBar) bar);
  }

  @Override
  public void happyHourEnded(Bar bar) {
      strategy.happyHourEnded((StringBar) bar);
  }

  @Override
  public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
      strategy.wants(drink, recipe, bar);
  }

  protected abstract  OrderingStrategy createOrderingStrategy();
}
