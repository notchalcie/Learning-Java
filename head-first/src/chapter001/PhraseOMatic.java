package chapter001;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordBank1 = {"I ", "You ", "They "};
        String[] wordBank2 = {"killed ", "saved "};
        String[] wordBank3 = {"the criminal", "the citizens"};

        int rand1 = (int) (wordBank1.length * Math.random());
        int rand2 = (int) (wordBank2.length * Math.random());
        int rand3 = (int) (wordBank3.length * Math.random());

        String word1 = wordBank1[rand1];
        String word2 = wordBank2[rand2];
        String word3 = wordBank3[rand3];

        System.out.println(word1 + word2 + word3);
    }
}