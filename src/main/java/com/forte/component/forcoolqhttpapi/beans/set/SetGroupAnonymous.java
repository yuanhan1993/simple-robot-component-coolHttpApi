package com.forte.component.forcoolqhttpapi.beans.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SetGroupAnonymous implements Set {
    /*
            group_id	number	-	群号
            enable	boolean	true	是否允许匿名聊天
     */
    private String group_id;
    private boolean enable = true;

    public static final String API = "/set_group_anonymous";

    @Override
    public String getApi() {
        return API;
    }
}
