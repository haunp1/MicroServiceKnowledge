package vn.com.knowledge.common;

public interface EndPoint {

    /* original */
    String VENDOR_BASE_URL = "/vendors";
    String VENDOR_OPERATE_BY_ID = "/{id}";
    String VENDOR_OPERATE_NAME = "/search";

    /* categories */
    String CATEGORY_BASE_URL = "/categories";
    String CATEGORY_OPERATE_BY_ID = "/{id}";

    /* attributes*/
    String ATTRIBUTE_BASE_URL = "/attributes";
    String ATTRIBUTE_OPERATE_BY_ID = "/{id}";
    String ATTRIBUTE_OPERATE_BY_NAME = "/find/{name}";
    String ATTRIBUTE_OPERATE_BY_CONTAIN_NAME = "/contain";

    /* products*/
    String PRODUCT_BASE_URL = "/products";
    String PRODUCT_OPERATE_BY_ID = "/{id}";
    String PRODUCT_OPERATE_BY_NAME = "/find/{name}";
    String PRODUCT_OPERATE_BY_CONTAIN_NAME = "/contain";

    /* categories */
    String IMAGE_BASE_URL = "/images";
    String IMAGE_OPERATE_BY_ID = "/{id}";
}
