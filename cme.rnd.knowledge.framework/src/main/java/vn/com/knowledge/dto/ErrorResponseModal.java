package vn.com.knowledge.dto;

public class ErrorResponseModal extends ResponseModal {
    public ErrorResponseModal(int status, String exception) {
        this.setStatus(status);
        this.setException(exception);
        this.setSuccessful(false);
        this.setMsg("Unsuccessful!");
    }
}
