package com.week1.dependecy_injection;

import org.springframework.stereotype.Service;

@Service
public class DBService {

    private DB db;

    public DBService(DB db) {
        this.db = db;
    }

    public String getDBConfig(){
        return db.getDatabase();
    }
}
