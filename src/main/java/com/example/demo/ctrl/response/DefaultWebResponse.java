package com.example.demo.ctrl.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DefaultWebResponse {
    private Object data;
    private String status;
    private String msg;

    public static class Builder {
        public static DefaultWebResponse success(Object data) {
            DefaultWebResponse response = new DefaultWebResponse();
            response.setData(data);
            response.setMsg("");
            response.setStatus("success");
            return response;
        }

        public static DefaultWebResponse fail(String message) {
            DefaultWebResponse response = new DefaultWebResponse();
            response.setStatus("error");
            response.setMsg(message);
            return response;
        }
    }
}
