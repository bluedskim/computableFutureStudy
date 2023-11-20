package net.shed.lab.computable_future;

public class Logger extends java.util.logging.Logger {

	protected Logger(String name, String resourceBundleName) {
		super(name, resourceBundleName);
	}

	public void info(String format, String msg) {
		super.info(String.format(format, msg));
	}
}
