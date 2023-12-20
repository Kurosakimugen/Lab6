package patterns.bar.client;

import patterns.StringDrink;
import patterns.StringRecipe;
import patterns.bar.BarObserver;
import patterns.bar.StringBar;

public interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
