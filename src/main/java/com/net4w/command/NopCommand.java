package com.net4w.command;

/**
 * 没有任何命令（空执行），用于初始化每个操作，什么都不做
 * 可以省掉对null的判断
 *
 * @author WangPingChun
 */
public class NopCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
