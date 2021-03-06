package me.yluo.clilauncher.cmd;

import me.yluo.clilauncher.data.ArgType;
import me.yluo.clilauncher.utils.DeviceUtils;


public class memory extends base{

    @Override
    protected String execCommand() throws Exception{
        String s = "";
        s = "memory available : "+DeviceUtils.getAvailMemory(EXECCONTEXT.context)+"MB\n";
        s += "memory total : "+DeviceUtils.getTotalMemory(EXECCONTEXT.context) +"MB\n";
        s += "\n\t\t=====info=====\n"+DeviceUtils.getMenInfo();
        return s;
    }

    @Override
    public int argType(int i) {
        return ArgType.UNDEFINIED;
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
    public boolean isAsync() {
        return true;
    }
}
