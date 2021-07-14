package dsaa.lab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class document {
    public static void loadDocument(String name, Scanner scan) {
        boolean eod = false;
        while(!eod) {
            String line = scan.nextLine();
            if (line.length() != 0 && line.charAt(0) != '#'){
                String[] words = line.split(" ");
                for (String s: words) {
                    if (s.equalsIgnoreCase("eod")) eod = true;
                    if (correctLink(s)){
                        String[] link = s.split("=");
                        System.out.println(link[1].toLowerCase(Locale.ROOT));
                    }
                }
            }
        }
        /*
        {
          
           
            {
            ;
              {
                     {
                       
                    }
          ) {
                     
                    }
                }
            }
        } 
         */
    }



    // accepted only small letters, capitalic letter, digits nad '_' (but not on the begin)
    public static boolean correctLink(String link) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String other = "1234567890_";
        String[] words;
        if (link.length() < 6) return false;
        if (link.charAt(4) == '=') {
            words = link.split("=");
        } else return false;
        if (!words[0].equalsIgnoreCase("link")) return false;
        if (!letters.contains(String.valueOf(link.charAt(5)).toLowerCase(Locale.ROOT))) return false;
        for (int i = 0; i < words[1].length(); i++) {
            String temp = String.valueOf(words[1].charAt(i)).toLowerCase(Locale.ROOT);
            return letters.contains(temp) || other.contains(temp);
        }
        return true;
    }

}