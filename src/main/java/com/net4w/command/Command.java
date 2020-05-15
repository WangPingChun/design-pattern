package com.net4w.command;

/**
 * 创建命令接口.
 *
 * @author WangPingChun
 */
public interface Command {

    void execute();

    void undo();
}
