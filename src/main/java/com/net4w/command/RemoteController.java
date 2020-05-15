package com.net4w.command;

/**
 * @author WangPingChun
 */
public class RemoteController {
    /**
     * 开按钮的命令数组.
     */
    private final Command[] onCommands;
    /**
     * 关按钮的命令数组.
     */
    private final Command[] offCommands;
    /**
     * 执行撤销的命令.
     */
    private Command undoCommand;

    public RemoteController(int commandCount) {
        this.onCommands = new Command[commandCount];
        this.offCommands = new Command[commandCount];
        for (int i = 0; i < commandCount; i++) {
            this.onCommands[i] = new NopCommand();
            this.offCommands[i] = new NopCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        this.onCommands[index] = onCommand;
        this.offCommands[index] = offCommand;
    }

    public void onButtonWasPushed(int index) {
        // 找到按下的开的按钮，并调用对应方法
        this.onCommands[index].execute();
        // 记录这次的操作，记录撤销
        this.undoCommand = onCommands[index];
    }

    public void offButtonWasPushed(int index) {
        // 找到按下的关的按钮，并调用对应方法
        this.offCommands[index].execute();
        // 记录这次的操作，记录撤销
        this.undoCommand = offCommands[index];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
