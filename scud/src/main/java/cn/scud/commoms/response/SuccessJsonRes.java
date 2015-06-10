package cn.scud.commoms.response;


import cn.scud.commoms.CodeDefined;

/**
 * Created by Victor on 2014/4/12.
 */
public class SuccessJsonRes extends AbstractJsonRes {
    public SuccessJsonRes() {
        super(CodeDefined.SUCCESS, CodeDefined.getMessage(CodeDefined.SUCCESS));
    }
}
