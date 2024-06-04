import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {

    private final BigDecimal TICKET_PRICE = BigDecimal.valueOf(100);

    private int ID;

    private String concertHall;

    private int eventCode;

    private long time;

    private boolean isPromo;

    private String stadiumSector;

    private double weight;

    private LocalDateTime creationTime;

    private BigDecimal price;

    public Ticket(int ID, String concertHall, int eventCode, long time,
                  boolean isPromo, String stadiumSector, double weight) {
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.weight = weight;
        creationTime = LocalDateTime.now();
        price = TICKET_PRICE;
    }

    public Ticket(String concertHall, int eventCode, long time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        creationTime = LocalDateTime.now();
        price = TICKET_PRICE;
    }

    public Ticket() {
        creationTime = LocalDateTime.now();
        price = TICKET_PRICE;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
