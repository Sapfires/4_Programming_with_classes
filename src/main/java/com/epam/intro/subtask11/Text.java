package com.epam.intro.subtask11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Text {
    private Sentence header;
    private List<Sentence> value;

    public Text(Sentence header, List<Sentence> value) {
        this.header = header;
        this.value = value;
    }

    public void addSentences(int position, List<Sentence> sentences) {
        value.addAll(position, sentences);
    }

    public void printlnHeader() {
        System.out.println("Header: " + header);
    }

    public void printlnText() {
        System.out.println("Text: " + value.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(". ")));
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence();
        sentence1.addWords(Collections.singletonList(new Word("Наша")));
        sentence1.addWords(Collections.singletonList(new Word("Таня")));
        sentence1.addWords(Collections.singletonList(new Word("громко")));
        sentence1.addWords(Collections.singletonList(new Word("плачет")));
        Sentence sentence2 = new Sentence();
        sentence2.addWords(Collections.singletonList(new Word("Не")));
        sentence2.addWords(Collections.singletonList(new Word("утонет")));
        sentence2.addWords(Collections.singletonList(new Word("в")));
        sentence2.addWords(Collections.singletonList(new Word("речке")));
        sentence2.addWords(Collections.singletonList(new Word("мяч")));
        List<Sentence> sentences = new ArrayList<>();
        Sentence header = new Sentence();
        header.addWords(Collections.singletonList(new Word("Стишок")));
        header.addWords(Collections.singletonList(new Word("про")));
        header.addWords(Collections.singletonList(new Word("Таню")));
        sentences.add(sentence1);
        sentences.add(sentence2);
        Text text = new Text(header, sentences);
        text.printlnHeader();
        text.printlnText();
        Sentence sentence3 = new Sentence();
        sentence3.addWords(Collections.singletonList(new Word("Уронила")));
        sentence3.addWords(Collections.singletonList(new Word("в")));
        sentence3.addWords(Collections.singletonList(new Word("речку")));
        sentence3.addWords(Collections.singletonList(new Word("мячик")));
        Sentence sentence4 = new Sentence();
        sentence4.addWords(Collections.singletonList(new Word("Тише")));
        sentence4.addWords(Collections.singletonList(new Word(",")));
        sentence4.addWords(Collections.singletonList(new Word("Танечка")));
        sentence4.addWords(Collections.singletonList(new Word(",")));
        sentence4.addWords(Collections.singletonList(new Word("не")));
        sentence4.addWords(Collections.singletonList(new Word("плачь")));
        List<Sentence> missedSentences = new ArrayList<>();
        missedSentences.add(sentence3);
        missedSentences.add(sentence4);
        text.addSentences(1, missedSentences);
        text.printlnHeader();
        text.printlnText();
    }
}
