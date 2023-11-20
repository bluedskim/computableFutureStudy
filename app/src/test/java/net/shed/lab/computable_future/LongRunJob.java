package net.shed.lab.computable_future;

import java.util.logging.Logger;

public class LongRunJob {
	int LOOP_CNT = 1000 * 100;
	private static Logger logger = Logger.getLogger(LongRunJob.class.getName());

	String jobId;

	public LongRunJob(String jobId) {
		this.jobId = jobId;
	}

	String run() {
		logger.info("start " + jobId + " / thread=" + Thread.currentThread().getName());
		for(int i = 0 ; i < LOOP_CNT ; i++) {}
		logger.info("end " + jobId);
		return jobId + " done / thread=" + Thread.currentThread().getName();
	}
}
