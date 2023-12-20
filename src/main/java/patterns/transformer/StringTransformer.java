package patterns.transformer;

import patterns.StringDrink;


public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
