package com.example.listviewex;

/**
 * Created by user on 2017-03-20.
 */

public class GameData {

    private int icon;
    private String title;
    private String comment;

    public GameData(int icon, String title, String comment) {
        this.icon = icon;
        this.title = title;
        this.comment = comment;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }
}
