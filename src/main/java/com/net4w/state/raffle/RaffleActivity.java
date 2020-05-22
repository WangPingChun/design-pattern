package com.net4w.state.raffle;

/**
 * @author WangPingChun
 */
public class RaffleActivity {
    /**
     * 表示当前的状态，是变化的.
     */
    private State state;
    private int count;
    private final State noRaffleState = new NoRaffleState(this);
    private final State canRaffleState = new CanRaffleState(this);
    private final State dispenseState = new DispenseState(this);
    private final State dispenseOutState = new DispenseOutState(this);


    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deductMoney() {
        this.state.deductMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int current = this.count;
        count--;
        return current;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }
}
