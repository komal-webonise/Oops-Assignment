package com.webonise.mobilepackage;

/**
 * Created by webonise on 9/8/16.
 */
public class Browse {
    //enter the query
    String query;
//get the query
    public String getQuery() {
        return query;
    }
//set the query
    public void setQuery(String query) {
        this.query = query;
    }
    //display the results
    String displayResult()
    {
        return getQuery();
    }
}
