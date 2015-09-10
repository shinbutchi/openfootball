package com.shin.spring.openfootball.model.response;

import java.io.Serializable;

/**
 * Created by shin on 9/11/2015.
 */
public class TeamInformation implements Serializable {

    private static final long serialVersionUID = -5967797915628504705L;
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
