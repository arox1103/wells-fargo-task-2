import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    public Portfolio() {}

    public Portfolio(String name, String description, Client client) {
        this.name = name;
        this.description = description;
        this.client = client;
    }

    // Getter and Setter methods (no setter for portfolioID is required)
}
