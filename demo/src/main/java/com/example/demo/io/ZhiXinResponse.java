package com.example.demo.io;

import java.util.List;

/**
 * 天气返回实体类
 */
public class ZhiXinResponse {
    private List<Results> results;
    private String status;
    private String status_code;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }
}
