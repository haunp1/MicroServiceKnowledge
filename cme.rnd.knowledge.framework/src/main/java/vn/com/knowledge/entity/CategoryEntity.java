package vn.com.knowledge.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author NhanVT3
 */

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    @Size(min = 5, max = 100)
    @Column(name = "description")
    private String description;

    @Size(max = 50, min = 5)
    @Column(name = "name",unique = true)
    private String name;



    @Column(name = "isDeleted", columnDefinition = "tinyint(1) default 1")
    private boolean isDeleted;


    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return isDeleted
     */
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
     *
     * @param deleted
     */
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }




}
