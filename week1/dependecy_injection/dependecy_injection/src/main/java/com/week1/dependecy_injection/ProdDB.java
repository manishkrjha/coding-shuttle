package com.week1.dependecy_injection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "application.env", havingValue = "PROD")
public class ProdDB implements DB{
    @Override
    public String getDatabase() {
        return "gvth_prod_gl";
    }
}
