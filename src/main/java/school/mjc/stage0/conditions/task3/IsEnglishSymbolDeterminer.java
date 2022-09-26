package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char symbol1 = 'a';
        for (int i = 0; i < symbol1.length(); i++)
            if (symbol1.charAt(i) > 'A' && symbol1.charAt(i) < 'Z') {
                System.out.println("English");
            } else {
                System.out.println("Non English");
            }
    }
}
