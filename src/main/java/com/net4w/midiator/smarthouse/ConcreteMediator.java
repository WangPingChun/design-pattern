package com.net4w.midiator.smarthouse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WangPingChun
 */
public class ConcreteMediator extends Mediator {
    private final Map<String, Colleague> colleagueMap = new HashMap<>();
    private final Map<String, String> interMap = new HashMap<>();

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof Tv) {
            interMap.put("Tv", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((Tv) colleagueMap.get(interMap.get("Tv"))).startTv();
            } else if (stateChange == 1) {
                ((Tv) colleagueMap.get(interMap.get("Tv"))).stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof Tv) {
            // todo 如果是tv发出的消息在这边处理
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            // todo 如果是窗帘发出的消息在这边处理
        }
    }

    @Override
    public void sendMessage() {

    }
}
