package com.epam.intro.subtask11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sentence {
    private List<Word> words = new ArrayList<>();

    public List<Word> getWords() {
        return words;
    }
    public void addWords(int position, List<Word> words) {
        this.words.addAll(position, words);
    }

    public void addWords( List<Word> words) {
        this.words.addAll(words);
    }
    public void deleteWord(int position) {
        words.remove(position);
    }

    @Override
    public String toString() {
        return words.stream().map(Word::getValue).collect(Collectors.joining(" "));
    }
}
