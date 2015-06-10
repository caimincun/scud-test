package cn.scud.commoms.response;


import cn.scud.commoms.CodeDefined;

/**
 * Created by Victor on 2014/4/12.
 */
public class ErrorJsonRes extends AbstractJsonRes {

    public ErrorJsonRes(int code) {
        super(code, CodeDefined.getMessage(code));
    }

    public ErrorJsonRes(int code ,String msg){
        super(code,msg);
    }
}
