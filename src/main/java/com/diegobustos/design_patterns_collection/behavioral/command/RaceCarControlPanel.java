package com.diegobustos.design_patterns_collection.behavioral.command;

public class RaceCarControlPanel {
    private Command startEngineCommand;
    private Command stopEngineCommand;

    public void setStartEngineCommand(Command startEngineCommand) {
        this.startEngineCommand = startEngineCommand;
    }

    public void setStopEngineCommand(Command stopEngineCommand) {
        this.stopEngineCommand = stopEngineCommand;
    }

    public void pressStartButton() {
        if (startEngineCommand != null) startEngineCommand.execute();
    }

    public void pressStopButton() {
        if (stopEngineCommand != null) stopEngineCommand.execute();
    }
}
