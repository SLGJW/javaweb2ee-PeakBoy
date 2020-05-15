package com.danger.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String userdesc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserdesc() {
        return userdesc;
    }

    public void setUserdesc(String userdesc) {
        this.userdesc = userdesc;
    }
}
