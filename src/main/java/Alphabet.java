import java.util.*;
import java.io.*;
public class Alphabet {
        public static boolean AlphabetSearching(String str) {
            if ((str != null) && (!str.equals("")) && (str.matches(".*[A-Z]+.*"))){
                return true;
            }
            else{
                return false;
            }

        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(AlphabetSearching(s.nextLine()));
        }

    }
