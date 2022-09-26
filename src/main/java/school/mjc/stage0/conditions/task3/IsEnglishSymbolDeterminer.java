package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char symbol1 = 'a';
        if (symbol1 == 'a' || symbol1 == 'b' || symbol1 == 'c' || symbol1 == 'd' || symbol1 == 'e' || symbol1 == 'f' || symbol1 == 'g' || symbol1 == 'h' || symbol1 == 'i' || symbol1 == 'j' || symbol1 == 'k' || symbol1 == 'l' || symbol1 == 'm' || symbol1 == 'n' || symbol1 == 'o' || symbol1 == 'p' || symbol1 == 'q' || symbol1 = 'r' || symbol1 == 's' || symbol1 == 't' || symbol1 == 'u' || symbol1 == 'v' || symbol1 == 'w' || symbol1 == 'x' || symbol1 == 'y' || symbol1 == 'z') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }

    }
}

