package com.fote.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.forte.component.forcoolqhttpapi.beans.msg.MsgOn;
import com.forte.component.forcoolqhttpapi.beans.msg.PostType;
import com.forte.component.forcoolqhttpapi.beans.msg.QQPrivateMsg;
import com.forte.component.forcoolqhttpapi.beans.result.LoginInfo;
import com.forte.component.forcoolqhttpapi.beans.send.SendPrivateMsg;
import com.forte.component.forcoolqhttpapi.utils.JSONDataUtil;
import com.forte.component.forcoolqhttpapi.utils.PostTypeUtils;
import com.forte.qqrobot.beans.messages.msgget.MsgGet;
import com.forte.qqrobot.scanner.FileScanner;

import java.util.Map;
import java.util.Set;

/**
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public class Test1 {

    public static void main(String[] args) throws Exception {

        String json = "{\"data\":{\"nickname\":\"法欧莉斯卡雷特\",\"user_id\":2257290268},\"retcode\":0,\"status\":\"ok\"}";

        LoginInfo loginInfo = JSONObject.toJavaObject(JSON.parseObject(json).getJSONObject("data"), LoginInfo.class);

        System.out.println(loginInfo);

    }

}
