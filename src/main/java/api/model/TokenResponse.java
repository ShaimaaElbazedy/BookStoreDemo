package api.model;

public class TokenResponse {
    //Variables Declarations
    private String token;
    private String expires;
    private String status;
    private String result;

    //Setters&Getters
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getExpires() {
        return expires;
    }
    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
