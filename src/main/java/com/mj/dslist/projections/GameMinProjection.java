package com.mj.dslist.projections;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    // Note: The method names should match the column names in the SQL query
}
