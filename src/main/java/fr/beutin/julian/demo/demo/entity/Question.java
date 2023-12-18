package fr.beutin.julian.demo.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question extends AbstractEntity{

    @Column(name = "ask")
    private String ask;

    @Column(name = "level")
    private String level;

    @Column(name = "answer")
    private String answer;

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    Technology technology;

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
