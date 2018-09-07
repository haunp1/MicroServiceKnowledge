package vn.com.knowledge.common;

/**
 * @author ThanhVQ
 */
public class Message {
    private Message() {}

    public static final int FIND_NOT_ENTITY_CODE = 404;
    public static final String FIND_NOT_ENTITY_MESSAGE = "Can't find entity";

    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MESSAGE = "Done, it was okay";


    public static final int CONFLIT_CODE = 409;
    public static final String CONFLIT_MESSAGE = "Duplicate entry";

}
