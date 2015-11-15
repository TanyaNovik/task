
package novik_pr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import resourse.Sentence;


public class WorkFiles {

readFiles(String fileName){
    StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String tmp;
            while ((tmp = br.readLine()) != null) {
                sb.append(tmp);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}

}
