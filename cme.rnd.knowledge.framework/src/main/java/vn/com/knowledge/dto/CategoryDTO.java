package vn.com.knowledge.dto;

/**
 * @author NhanVT3
 */

public class CategoryDTO extends BaseDTO {

    private String name;

    private String description;

    private boolean IsDeleted;

    /**
     * @return  the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *              the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return isDeleted
     */
    public boolean isDeleted() {
        return IsDeleted;
    }

    /**
     * @param isDeleted
     */
    public void setDeleted(boolean isDeleted) {
        IsDeleted = isDeleted;
    }

}
