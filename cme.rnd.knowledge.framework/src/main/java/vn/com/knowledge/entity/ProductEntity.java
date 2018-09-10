package vn.com.knowledge.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ThanhVQ
 */

@Entity
@Table(name = "Product")
public class ProductEntity extends BaseEntity implements Serializable {

//    private static final long serialVersionUID = 417474726962757465L;

    @Column(name = "name", unique = true, nullable = false)
    @Size(max = 50, min = 5)
    private String name;


    @Column(name = "description")
    @Size(min = 5, max = 100)
    private String description;

    @Column(name = "isDeleted", columnDefinition = "tinyint(1) default 0")
    private boolean isDeleted;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Product_Category",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
    Set<CategoryEntity> categoryEntitySet = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Product_Vendor",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "vendor_id") }
    )
    Set<VendorEntity> vendorEntitySet = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Product_Attribute",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "attribute_id") }
    )
    Set<AttributeEntity> attributeEntitySet = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Set<CategoryEntity> getCategoryEntitySet() {
        return categoryEntitySet;
    }

    public void setCategoryEntitySet(Set<CategoryEntity> categoryEntitySet) {
        this.categoryEntitySet = categoryEntitySet;
    }

    public Set<VendorEntity> getVendorEntitySet() {
        return vendorEntitySet;
    }

    public void setVendorEntitySet(Set<VendorEntity> vendorEntitySet) {
        this.vendorEntitySet = vendorEntitySet;
    }

    public Set<AttributeEntity> getAttributeEntitySet() {
        return attributeEntitySet;
    }

    public void setAttributeEntitySet(Set<AttributeEntity> attributeEntitySet) {
        this.attributeEntitySet = attributeEntitySet;
    }
}
