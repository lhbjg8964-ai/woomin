package a0825.enum1;

public enum StatusCode {
    SUCCESS(200,"요청이 성공했습니다"),
    BAD_REQUEST(400,"잘못된 요청입니다."),
    NOT_FOUND(404,"페이지를 찾을 수 없습니다."),
    SERVER_ERROR(500,"서버 내부 오류입니다.");

    // 필더 선언
    private final int code;
    private final String massage;
    public int getCode() {
        return code;
    }
    public String getMassage() {
        return massage;
    }
    private StatusCode(int code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
