package com.net4w.command;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 制造一个遥控器，有5个功能
        final RemoteController remoteController = new RemoteController(5);

        // 电灯开关命令
        final LightReceiver lightReceiver = new LightReceiver();
        final LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        final LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 将电灯开关设置到遥控器的第一行按钮
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("on button was pushed");
        remoteController.onButtonWasPushed(0);
        System.out.println("off button was pushed");
        remoteController.offButtonWasPushed(0);
        System.out.println("undo button was pushed");
        remoteController.undoButtonWasPushed();

        // 电视开关命令
        final TelevisionReceiver televisionReceiver = new TelevisionReceiver();
        final TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(televisionReceiver);
        final TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(televisionReceiver);
        // 将电视开关设置到遥控器的第二行按钮
        remoteController.setCommand(1, televisionOnCommand, televisionOffCommand);

        System.out.println("on button was pushed");
        remoteController.onButtonWasPushed(1);
        System.out.println("off button was pushed");
        remoteController.offButtonWasPushed(1);
        System.out.println("undo button was pushed");
        remoteController.undoButtonWasPushed();
    }
}
