package org.project.SpringCloudConfigServer.Bean;

public class LoginDetails {
private String loginUrl;
private String authUrl;

    public LoginDetails(String loginUrl, String authUrl) {
        this.loginUrl = loginUrl;
        this.authUrl = authUrl;
    }
    public LoginDetails(){

    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
}
