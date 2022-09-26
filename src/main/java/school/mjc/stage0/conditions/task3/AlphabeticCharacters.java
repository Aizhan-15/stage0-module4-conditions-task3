package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char ch = 'i';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        if (ch != 'a' || ch != 'b' || ch != 'c' || ch != 'd' || ch != 'e' || ch != 'f' || ch != 'g' || ch != 'h' || ch != 'i' || ch != 'j' || ch != 'k' || ch != 'l' || ch != 'm' || ch != 'n' || ch != 'o' || ch != 'p' || ch != 'q' || ch != 'r' || ch != 's' || ch != 't' || ch != 'u' || ch != 'v' || ch != 'w' || ch != 'x' || ch != 'y' || ch != 'z') {
            System.out.println("wrong alphabet!");
        }
    }
}
