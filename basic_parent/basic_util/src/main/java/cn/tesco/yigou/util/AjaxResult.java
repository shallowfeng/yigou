package cn.tesco.yigou.util;

public class AjaxResult {

    private Boolean success;
    private String message;
    private Object obj;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public static AjaxResult getAjaxResult(){
        return new AjaxResult();
    }
}
