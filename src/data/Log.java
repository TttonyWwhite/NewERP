
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "LOG")
public class Log implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "logID")
    private String logID;

    @Column(name = "operationTime")
    private Date operationTime;
}
