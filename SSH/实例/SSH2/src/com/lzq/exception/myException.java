package com.lzq.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class myException extends RuntimeException {

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	@Override
	public void printStackTrace(PrintStream arg0) {
		super.printStackTrace(arg0);
	}

	@Override
	public void printStackTrace(PrintWriter arg0) {
		super.printStackTrace(arg0);
	}

}
