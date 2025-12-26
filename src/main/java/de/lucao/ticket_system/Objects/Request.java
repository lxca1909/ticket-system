package de.lucao.ticket_system.Objects;

import de.lucao.ticket_system.Enum.RequestType;
import jakarta.persistence.*;

@Entity
@Table(name = "t_ticket")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false, name = "requestId")
    private Long requestId;

    @Column(name = "content")
    private String content;

    @Column(name = "requestMail")
    private String requestMail;

    @Column(name = "requestType")
    private RequestType requestType;

    @Column(name = "responderId")
    private Long responderId; //TODO: tabelle und eigenes Beantworter / Resolver Object dafür erstellen -- dementsprechend vielleicht auch eine User Object

    public Request(String content, String requestMail, RequestType requestType, Long responderId) {
        this.content = content;
        this.requestMail = requestMail;
        this.responderId = responderId;
        this.requestType = requestType;
    }

    public Request() {
        super();
    }

    public Long getRequestId() {
        return requestId;
    }
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
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
        return "Anfragen ID: " + this.requestId +
                " Inhalt: " + this.content +
                " AnfrageType: " + this.requestType;
    }

}
