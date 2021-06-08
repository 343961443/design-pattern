package com.zs.sample.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class CommandInvoker {
    private List<ICommand> commandList = new ArrayList<ICommand>();

    public void addCommandList(ICommand command) {
        this.commandList.add(command);
    }

    public void executeCommandList() {
        for (ICommand iCommand : commandList) {
            iCommand.execute();
        }
        commandList.clear();
    }
}
