import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s;
        String current;
        int uniqueCount = 0;
        int count;
        int largest = 0;
        String letter = "";

        System.out.println("Please enter a word or phrase. this program will display the most frequent letter:");
        s = scan.nextLine();

        for (int i  = 0 ; i < s.length(); i++) {
            current = s.substring(i, i+1);
            if (i == 0 || !s.substring(0, i).contains(current) ){
                count = 1;

                for (int j = i + 1; j < s.length(); j++) {
                    if (current.equals(s.substring(j, j+1))) {
                        count++;
                        if (count > largest) {
                            largest = count;
                            letter = current;
                        }
                    }
                }
            }
        }
        System.out.println(letter + " with " + largest);
    }
}
