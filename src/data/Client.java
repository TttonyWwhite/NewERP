import util.ClientLevel;
import util.ClientType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CLIENT", schema = "NEWERPDB")
public class Client implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "clientName")
    private String name;

    @Column(name = "clientType")
    @Enumerated(EnumType.ORDINAL)
    private ClientType clientType;

    @Column(name = "clientLevel")
    @Enumerated(EnumType.ORDINAL)
    private ClientLevel clientLevel;

    @Column(name = "telNumber")
    private long telNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "postcode")
    private long postcode;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "toGet")
    private double toGet;

    @Column(name = "toPay")
    private double toPay;

    @Column(name = "defaultSalesmanID")
    private long defaultSalesmanID;

    @Column(name = "defaultSalesmanName")
    private String defaultSalesmanName;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public ClientLevel getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(ClientLevel clientLevel) {
        this.clientLevel = clientLevel;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPostcode() {
        return postcode;
    }

    public void setPostcode(long postcode) {
        this.postcode = postcode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getToGet() {
        return toGet;
    }

    public void setToGet(double toGet) {
        this.toGet = toGet;
    }

    public double getToPay() {
        return toPay;
    }

    public void setToPay(double toPay) {
        this.toPay = toPay;
    }

    public long getDefaultSalesmanID() {
        return defaultSalesmanID;
    }

    public void setDefaultSalesmanID(long defaultSalesmanID) {
        this.defaultSalesmanID = defaultSalesmanID;
    }

    public String getDefaultSalesmanName() {
        return defaultSalesmanName;
    }

    public void setDefaultSalesmanName(String defaultSalesmanName) {
        this.defaultSalesmanName = defaultSalesmanName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                telNumber == client.telNumber &&
                postcode == client.postcode &&
                Double.compare(client.toGet, toGet) == 0 &&
                Double.compare(client.toPay, toPay) == 0 &&
                defaultSalesmanID == client.defaultSalesmanID &&
                Objects.equals(name, client.name) &&
                clientType == client.clientType &&
                clientLevel == client.clientLevel &&
                Objects.equals(address, client.address) &&
                Objects.equals(emailAddress, client.emailAddress) &&
                Objects.equals(defaultSalesmanName, client.defaultSalesmanName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, clientType, clientLevel, telNumber, address, postcode, emailAddress, toGet, toPay, defaultSalesmanID, defaultSalesmanName);
    }
}
