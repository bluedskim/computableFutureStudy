package net.shed.lab.computable_future;

import java.util.logging.Logger;

public class LongRunJob {
	private static Logger logger = Logger.getLogger(LongRunJob.class.getName());

	void run() {
		logger.info("start");
		logger.info("end");
	}
}
