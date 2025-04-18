package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private Integer trainNo;
    private String source;
    private String destination;
    private String stations;
    private Map<String, Time> stops;
    private List<List<Integer>> seats;
}
