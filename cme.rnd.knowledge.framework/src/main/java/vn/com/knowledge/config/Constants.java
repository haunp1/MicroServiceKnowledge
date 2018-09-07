package vn.com.knowledge.config;

public interface Constants {

    /* original */
    String VENDOR_BASE_URL = "/vendors";
    String VENDOR_OPERATE_BY_ID = "/{id}";

    /* categories */
    String CATEGORY_BASE_URL = "/categories";
    String CATEGORY_OPERATE_BY_ID = "/{id}";

    /* attributes*/
    String ATTRIBUTE_BASE_URL = "/attributes";
    String ATTRIBUTE_OPERATE_BY_ID = "/{id}";
    String ATTRIBUTE_OPERATE_BY_NAME = "/find/{name}";
    String ATTRIBUTE_OPERATE_BY_CONTAIN_NAME = "/contain";
}
