import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Enter a number or letter");
        if(StringUtils.isNumeric(sc.nextLine())){
            System.out.println("You entered a number");
        } else {
            System.out.println("You entered a letter");
        }
        System.out.println("------------------------");
        System.out.println("Enter a word, phrase, or sentence");
        String userInput = sc.nextLine().trim();
        System.out.println("Here is what you entered with the case of each character reversed:");
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println("");
        System.out.println("Here is what you entered reversed:");
        System.out.println(StringUtils.reverse(userInput));
        System.out.println("------------------------");
    }
}
