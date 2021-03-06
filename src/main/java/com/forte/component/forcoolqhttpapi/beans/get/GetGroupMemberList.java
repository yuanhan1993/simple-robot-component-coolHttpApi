package com.forte.component.forcoolqhttpapi.beans.get;

import com.forte.component.forcoolqhttpapi.beans.result.GroupMemberList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 获取群成员列表
 *
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetGroupMemberList implements Get<GroupMemberList> {
    /*
    字段名	数据类型	默认值	说明
    group_id	number	-	群号
     */


    private String group_id;
    public static final String API = "/get_group_member_list";

    @Override
    public String getApi() {
        return API;
    }


    /**
     * 获取响应值的接收封装类型，需要是一个具体的实现类
     */
    @Override
    public Class<GroupMemberList> getResultType() {
        return GroupMemberList.class;
    }
}
