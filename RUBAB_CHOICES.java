package com.example.RUBABKHALID_QUIZ_APP.APP_ENTITIES;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public RUBAB_CHOICES {

    public RUBAB_CHOICES(int My_ id, String ListOfChoices, Boolean iscorrect) {
        this.My_id = My_id;
        this.ListOfChoices = ListOfChoices;
        this.iscorrect = iscorrect;
    }

    public RUBAB_CHOICES() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int My_id;
    private String ListOfChoices;
    private Boolean iscorrect;

    public int getMy_Id() {
        return id;
    }

    public String getListOfChoices() {
        return ListOfChoices;
    }

    public void setId(int My_id) {
        this.My_id = My_id;
    }

    public void setListOfChoice(String ListOfChoices) {
        this.ListOfChoices = ListOfChoices;
    }

    public Boolean getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(Boolean iscorrect) {
        this.iscorrect = iscorrect;
    }
}
