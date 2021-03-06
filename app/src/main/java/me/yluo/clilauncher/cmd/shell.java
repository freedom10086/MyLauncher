package me.yluo.clilauncher.cmd;

import android.text.TextUtils;

import me.yluo.clilauncher.data.ArgType;
import me.yluo.clilauncher.utils.ShellUtils;


public class shell extends base{
    @Override
    protected String execCommand() throws Exception{
        String commandStr = EXECCONTEXT.commandStr;
        if(EXECCONTEXT.args!=null&&EXECCONTEXT.args.length>0){
            commandStr=commandStr+" "+TextUtils.join(" ",EXECCONTEXT.args);
        }
        return ShellUtils.execShell(commandStr);
    }

    @Override
    public int argType(int i) {
        return ArgType.UNDEFINIED;
    }

    @Override
    public int[] getArgsNum() {
        int[] a = new  int[2];
        a[0] = 0;
        a[1] = Integer.MAX_VALUE;
        return a;
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
