package com.kiumitech.astute.basis;

public class SingleResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static SingleResponse buildSuccess() {
        SingleResponse<Void> response = new SingleResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static <T extends DTO> SingleResponse<T> of(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static SingleResponse buildFail(String message) {
        SingleResponse<Void> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }
}
