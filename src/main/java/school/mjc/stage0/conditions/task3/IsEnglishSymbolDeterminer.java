package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char symbol1 = 'a';
        if (symbol1 == 'a' || symbol1 == 'b' || symbol1 == 'c' || symbol1 == 'd' || symbol1 == 'e' || symbol1 == 'f' || symbol1 == 'g' || symbol1 == 'h') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }

    }
}

