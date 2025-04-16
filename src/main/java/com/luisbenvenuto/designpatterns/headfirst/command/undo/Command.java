package com.luisbenvenuto.designpatterns.headfirst.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
