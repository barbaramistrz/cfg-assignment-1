package com.codefirstgirls;

public class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    @Override
    public String getSummary(){
        return "Magazines are a work in progress, please check in later.";
    }
}
