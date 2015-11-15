
package resourse;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends Word {

    private List<Word> words = new ArrayList<>();

    public Sentence(){
        
    }
    
    public Sentence(String s){
        String[] tmp = s.split("[\\p{Punct}\\s]");
        for(String str : tmp)        {
            words.add(new Word(str));
        }
    }

    public void replace(int l, String substr) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWord().length() == l) {
                words.get(i).setWord(substr);
            }
        }
    }

    @Override
    public String toString() {
        return "Sentence [ word = " + words.toString() + "]";
    }

    public List<Word> getSentence() {
        return words;
    }

}
