package com.mj.dslist.projections;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    // Note: The method names should match the column names in the SQL query
}
