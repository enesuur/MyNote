package com.enesuur.mynotelab;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
    private String header;
    private Date date;
    private String filePath;

    public Note(String head, Date date, String filePath) {
        this.header = head;
        this.date = date;
        this.filePath = filePath;
    }

    public Note() {

    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
