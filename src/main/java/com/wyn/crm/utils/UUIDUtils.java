package com.wyn.crm.utils;

import java.util.UUID;

public class UUIDUtils {
    /**
     * 回去uuid的值
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
