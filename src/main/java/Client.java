import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private FinancialAdvisor financialAdvisor;

    public Client() {}

    public Client(String name, String email, String phone, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.financialAdvisor = financialAdvisor;
    }

    // Getter and Setter methods (no setter for clientID is required)
}
