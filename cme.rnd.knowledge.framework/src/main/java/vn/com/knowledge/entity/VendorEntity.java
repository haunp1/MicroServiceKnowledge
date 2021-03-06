package vn.com.knowledge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author LocLD1
 */

@Entity
@Table(name = "Vendor")
public class VendorEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8689163668960994563L;

    @Size(min = 5, max = 50)
    @Column(name = "name", unique = true)
    private String name;

    @Size(min = 5, max = 100)
    @Column(name = "description")
    private String description;



    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


}
