package com.yang.mylauncher.cmd;

public class unknown extends base {


    @Override
    protected String execCommand() {
        return "command not found !!!";
    }


    @Override
    public int argType(int i) {
        return -1;
    }

    @Override
    public int[] getArgsNum() {
        return new int[2];
    }

    @Override
    public String getUsageInfo() {
        return null;
    }


    @Override
    public boolean isAsync(){
        return false;
    }

}
