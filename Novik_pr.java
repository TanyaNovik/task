
package novik_pr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import resourse.Sentence;


public class Novik_pr {

    private static final String fileName = "file.txt";

    public static void main(String[] args) {

        List<Sentence> text = new ArrayList();
        String sb = readFiles(fileName);
        String[] s = sb.split("\\.");
        for(String str : s){
            text.add(new Sentence(str));
        }
        Scanner sc = new Scanner(System.in, "Windows-1251");

        System.out.println("Enter substring :");
        String substr = sc.nextLine();

        System.out.println("Enter number :");
        int l = sc.nextInt();
        
        System.out.println(text.toString());
        for (int i = 0; i < text.size(); i++) {
            text.get(i).replace(l, substr);
        }
        System.out.println(text.toString());

    }

}
