import java.util.regex.Pattern;

public class ABC {

    public static void main(String[] args) {

        String input = "2[xyz]4[xy]z";
        String output = "xyzxyzxyzxyxyxyxyz";

        Pattern pattern = Pattern.compile("[\\[ ,.!?\\]]");

        String []S = pattern.split(input);


        for(String word:S)

            System.out.println(word);
    }
}