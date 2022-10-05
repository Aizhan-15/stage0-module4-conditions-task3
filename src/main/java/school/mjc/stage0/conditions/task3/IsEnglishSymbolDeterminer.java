package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char symbol1 = 'a';
        if (symbol1 == 'a' || symbol1 == 'b' || symbol1 == 'c' || symbol1 == 'd' || symbol1 == 'e' || symbol1 == 'f' || symbol1 == 'g' || symbol1 == 'h' || symbol1 == 'i') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
        if (symbol1 == 'A' || symbol1 == 'B' || symbol1 == 'C' || symbol1 == 'D' || symbol1 == 'E' || symbol1 == 'F' || symbol1 == 'G' || symbol1 == 'H' || symbol1 == 'I') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}

