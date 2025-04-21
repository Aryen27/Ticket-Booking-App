package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private static final String USERS_PATH= "../localDb/Users.json";
    private static final ObjectMapper objectMapper= new ObjectMapper();


    public UserBookingService(User user1) throws IOException
    {
        this.user= user1;
        File users= new File(USERS_PATH);
        userList= objectMapper.readValue(users, new TypeReference<List<User>>() {}); //TypeRef is to deserialize json data to list of users(List<User>)
    }
}
