package com.firesolution.sweater.domain.util;

import com.firesolution.sweater.domain.User;

public abstract class MessageHelper {

    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }

}