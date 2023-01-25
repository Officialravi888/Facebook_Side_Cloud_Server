package org.project.SpringCloudConfigServer.controller;

import org.project.SpringCloudConfigServer.Bean.LoginDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginDetailController {
        String login ="https://www.facebook.com/v12.0/dailog/auth";
        String authUrl ="https://www.facebook.com/login";
@GetMapping(value = "/logindetail")
    public LoginDetails getLoginDetails(){
        return new LoginDetails(login, authUrl);
    }
}
