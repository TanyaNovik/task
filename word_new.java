/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourse;

/**
 *
 * @author Tanya
 */
public class Word {

    private String word;

    public Word() {

    }

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return " " + word + "  ";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
