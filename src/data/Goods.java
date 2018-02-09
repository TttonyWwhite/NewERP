import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "GOODS")
public class Goods implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "goodsID")
    private String goodsID;

    @Column(name = "goodsName")
    private String goodsName;

    @Column(name = "goodsType")
    private String goodsType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rid")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
