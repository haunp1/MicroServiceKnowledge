package vn.com.knowledge.common;


public final class Message {

    // common message
    public static final String PREDICATE_BUILD_FAILED = "Predicate building failed.";
    public static final String REQUEST_TIMEOUT = "Request time out, please login again.";
    public static final String MISSING_DATA = "Missing data.";
    public static final String DATA_INCORRECT = "Data Incorrect.";
    public static final String USER_HAS_NOT_BEEN_ADDED = "User hasn't been added to system yet.";

    // success
    public static final String SUCCESSFUL = "Successful.";
    public static final String USER_SAVE_SUCCESS = "User has been successfully saved.";

    // failed
    public static final String CONTRACT_CASE_CANNOT_DELETE = "Cannot delete Case. Can only delete the last Case of the unit, not published or not signed signature.";
    public static final String CONTRACT_CASE_IN_LEASE_CANNOT_DELETE = "Cannot delete Case %s. Can only delete the last Case of the unit, not published or not signed signature.";
    public static final String EMAIL_SENDING_FAILED = "Email sending failed.";

    // not found
    public static final String CATEGORY_NOT_FOUND = "Category not found.";
    public static final String TENANT_NOT_FOUND = "Tenant not found.";
    public static final String CHECKLIST_NOT_FOUND = "Checklist not found.";
    public static final String MASTER_CHECKLIST_NOT_FOUND = "Master checklist not found.";
    public static final String COMMEND_NOT_FOUND = " Commend not found.";
    public static final String COUNTRY_NOT_FOUND = "Country not found.";
    public static final String CONTRACT_CASE_NOT_FOUND = "Case not found.";
    public static final String PROPERTY_NOT_FOUND = "Property not found.";
    public static final String UNIT_NOT_FOUND = "Unit not found.";
    public static final String USER_NOT_FOUND = "User not found.";
    public static final String CONTRACT_NOT_FOUND = "Contract not found.";
    public static final String LEASE_INFO_NOT_FOUND = "Lease information is not found.";
    public static final String ROLE_NOT_FOUND = "Role not found.";
    public static final String TASK_CHECK_LIST_NOT_FOUND = "Task Checklists not found.";
    public static final String HISTORY_NOT_FOUND = "History not found.";
    public static final String CHECKLIST_CASE_HISTORY_NOT_FOUND = "Checklist case history not found.";
    public static final String CHECKLISTCASE_CASE_NOT_FOUND = "Checklist item not found.";

    // unique
    public static final String DUPLICATE_TENANT_ID = "TenantId must be unique.";
    public static final String DUPLICATE_UNIT_NAME = "Unit name must be unique.";
    public static final String DUPLICATE_COUNTRY_NAME = "Country name must be unique.";
    public static final String DUPLICATE_USERNAME = "Username must be unique.";
    public static final String DUPLICATE_ROLE_NAME = "Role name must be unique.";
    public static final String DUPLICATE_CATEGORY_NAME = "Category name must be unique.";
    public static final String DUPLICATE_PROPERTY_NAME = "Property name must be unique.";
    public static final String DUPLICATE_MASTER_CHECKLIST_NAME = "Master checklist name must be unique.";
    public static final String CONTRACT_NUMBER_MUST_BE_UNIQUE = "Contract number must be unique.";

    // concurrency
    public static final String CATEGORY_DELETE_FAIL = "Delete category failed, Category is in used at one or more checklist case.";

    // other
    public static final String STAGE_NOT_CONSISTENT = "There is already a published case %s in this timeline.";
    public static final String CASE_TYPE_NOT_CONSISTENT = "There is already a HandOver/TakeOver: %s case at the moment.";
    public static final String PREVIOUS_CASE_NOT_FOUND = "Unable to create TakeOver case. There is not exist handover case before.";
    public static final String CHECK_LIST_CASE_NOT_FOUND = "There should be at least 1 checklist item.";
    public static final String RE_PUBLIC_FAIL = "This case has been completed in mobile app. You can not re-publish it.";
    public static final String RE_UPDATE_CHECKLIST_FAILED = "Cannot delete/deactivate check list while task is running."; //TODO: Confirm this message with BA
    public static final String PROPERTY_DELETE_FAIL = "Cannot delete property.";
    public static final String PUBLIC_FAILED = "Can't publish case. Case %s must be published & finished first.";
    public static final String CASE_TYPE_INVALID = "Handover case can't have pre-inspection stage.";
    public static final String WRONG_VALIDATE = "Wrong Checklist name format.";
    public static final String ROLE_DELETE_FAIL = "Can't delete role.";
    public static final String COMPLETE_TASK_FAIL = "You don't complete the task yet.";
    public static final String COMPLETE_TASK_FAIL_RELEASED = "This task released.";
    public static final String FAIL_DELETE_COUNTRY = "Unable to delete Country %s. There is already a Property for it.";
    public static final String TIME_INVALID = "The Takeover/Handover: %s date is overlap with previous Case.";
    public static final String LEASE_TIME_INVALID = "The Lease: %s date is overlap with exist Lease.";

    private Message() {
    }
}