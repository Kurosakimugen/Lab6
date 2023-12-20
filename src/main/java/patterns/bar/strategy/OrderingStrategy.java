package patterns.bar.strategy;

import patterns.StringDrink;
import patterns.StringRecipe;
import patterns.bar.StringBar;

public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
