package ticket.booking.entities;

import java.util.List;

public class User {
//    name, pass, hashpass, ticket obj, userId
    private String userId;
    private String name;
    private String pass;
    private String hashPass;
    private List<Ticket> ticketsBooked;
}
