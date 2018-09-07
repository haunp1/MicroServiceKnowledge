package vn.com.knowledge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author ThanhVQ
 */

@Entity
@Table(name = "Attribute")
public class AttributeEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 417474726962757465L;

    @Column(name = "name", unique = true, nullable = false)
    @Size(max = 50, min = 5)
    private String name;


    @Column(name = "description")
    @Size(min = 5, max = 100)
    private String description;

    @Column(name = "isDeleted", columnDefinition = "tinyint(1) default 0")
    private boolean isDeleted;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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
}
