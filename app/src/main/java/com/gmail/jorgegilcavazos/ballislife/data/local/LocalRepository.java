package com.gmail.jorgegilcavazos.ballislife.data.local;

public interface LocalRepository {

    void saveFavoritePostsViewType(int viewType);

    int getFavoritePostsViewType();
}