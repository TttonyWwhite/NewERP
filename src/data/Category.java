import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "isLeaf")
    private boolean isLeaf;

    @Column(name = "fatherCategoryID")
    private int fatherCategoryID;

    /*与goods的一对多关系*/
    @OneToMany(mappedBy = "category")
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Set<Goods> goodsSet;

    public Category() {
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

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public int getFatherCategoryID() {
        return fatherCategoryID;
    }

    public void setFatherCategoryID(int fatherCategoryID) {
        this.fatherCategoryID = fatherCategoryID;
    }

    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }
}
