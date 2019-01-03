package com.designpattern.behaviour.visitor;

public class KeyBoard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);

	}

}
