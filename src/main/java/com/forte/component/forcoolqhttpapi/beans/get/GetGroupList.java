package com.forte.component.forcoolqhttpapi.beans.get;

import com.forte.component.forcoolqhttpapi.beans.result.GroupList;

/**
 *
 * 获取群列表
 *
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public class GetGroupList implements Get<GroupList> {

    private static final String API = "/get_group_list";
    @Override
    public String getApi(){
        return API;
    }


    /**
     * 获取响应值的接收封装类型，需要是一个具体的实现类
     */
    @Override
    public Class<GroupList> getResultType() {
        return GroupList.class;
    }
}
