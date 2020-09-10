package com.kevin.dd;

/**
 * @description:
 * @author: kevin
 * @create: 2020-09-10 19:35
 */

public class Message {

    private String msgtype;
    private MessageInfo text;

    public String getMsgtype() {
        return msgtype;
    }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public MessageInfo getText() {
        return text;
    }
    public void setText(MessageInfo text) {
        this.text = text;
    }


}
