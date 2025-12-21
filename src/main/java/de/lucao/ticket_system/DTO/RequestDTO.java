package de.lucao.ticket_system.DTO;

import de.lucao.ticket_system.Enum.AnfrageType;
import de.lucao.ticket_system.Objects.User;

public class RequestDTO {

    private Long anfrageId;
    private String inhalt;
    private String requestMail;
    private AnfrageType anfrageType;
    private User responder;
}
