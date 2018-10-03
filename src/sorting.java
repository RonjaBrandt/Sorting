import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ronja on 2018-10-03.
 */
public class sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<String> words = new ArrayList<>();

        words.add("Foody");
        words.add("Goody");
        words.add("Maths");
        words.add("Films");
        words.add("Zorro");

        words.sort(null);

    for (String word :words){
        System.out.println(word);
    }

    }
}
