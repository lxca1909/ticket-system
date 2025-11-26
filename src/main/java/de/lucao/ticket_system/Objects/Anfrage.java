package de.lucao.ticket_system.Objects;

import de.lucao.ticket_system.Enum.AnfrageType;
import jakarta.persistence.*;

@Entity
@Table(name = "anfrage")
public class Anfrage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "anfrageId")
    private Long anfrageId;

    @Column(name = "inhalt")
    private String inhalt;

    @Column(name = "anfragerMail")
    private String anfragerMail;

    @Column(name = "anfrageType")
    private AnfrageType anfrageType;

    @Column(name = "beantworterID")
    private String beantworterID; //TODO: tabelle und eigenes Beantworter / Resolver Object dafür erstellen -- dementsprechend vielleicht auch eine User Object

    public Anfrage(String inhalt, String anfragerMail, AnfrageType anfrageType, String beantworterID) {
        this.inhalt = inhalt;
        this.anfragerMail = anfragerMail;
        this.beantworterID = beantworterID;
        this.anfrageType = anfrageType;
    }

    public Anfrage() {
        super();
    }

    public Long getAnfrageId() {
        return anfrageId;
    }
    public void setAnfrageId(Long anfrageId) {
        this.anfrageId = anfrageId;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public String getAnfragerMail() {
        return anfragerMail;
    }
    public String getBeantworterID() {
        return beantworterID;
    }
    public void setBeantworterID(String beantworterID) {
        this.beantworterID = beantworterID;
    }
    public void setAnfragerMail(String anfragerMail) {
        this.anfragerMail = anfragerMail;
    }

    @Override
    public String toString() {
        return "Anfragen ID: " + this.anfrageId +
                " Inhalt: " + this.inhalt +
                " AnfrageType: " + this.anfrageType;
    }

}
