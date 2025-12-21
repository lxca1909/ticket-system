package de.lucao.ticket_system.Objects;

import de.lucao.ticket_system.Enum.AnfrageType;
import jakarta.persistence.*;

@Entity
@Table(name = "anfrage")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false, name = "requestId")
    private Long anfrageId;

    @Column(name = "content")
    private String content;

    @Column(name = "request_mail")
    private String requestMail;

    @Column(name = "anfrageType")
    private AnfrageType anfrageType;

    @Column(name = "beantworterID")
    private Long responderId; //TODO: tabelle und eigenes Beantworter / Resolver Object dafür erstellen -- dementsprechend vielleicht auch eine User Object

    public Request(String content, String requestMail, AnfrageType anfrageType, Long responderId) {
        this.content = content;
        this.requestMail = requestMail;
        this.responderId = responderId;
        this.anfrageType = anfrageType;
    }

    public Request() {
        super();
    }

    public Long getAnfrageId() {
        return anfrageId;
    }
    public void setAnfrageId(Long anfrageId) {
        this.anfrageId = anfrageId;
    }

    public String getInhalt() {
        return content;
    }

    public void setInhalt(String content) {
        this.content = content;
    }

    public String getRequestMail() {
        return requestMail;
    }
    public Long getResponder() {
        return responderId;
    }
    public void setResponder(Long responderId) {
        this.responderId = responderId;
    }
    public void setRequestMail(String requestMail) {
        this.requestMail = requestMail;
    }

    @Override
    public String toString() {
        return "Anfragen ID: " + this.anfrageId +
                " Inhalt: " + this.content +
                " AnfrageType: " + this.anfrageType;
    }

}
