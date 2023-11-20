/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package net.shed.lab.computable_future;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import org.junit.Test;

public class ComputablefutureTest {
	private static Logger logger = Logger.getLogger(ComputablefutureTest.class.getName());

	@Test
	public void appHasAGreeting() throws InterruptedException, ExecutionException {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
		logger.info(String.format("future1=%s", future1.get()));
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
		logger.info(String.format("future2=%s", future2.get()));
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");
		logger.info(String.format("future3=%s", future3.get()));

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);
		combinedFuture.get();

		assertTrue(future1.isDone());
		assertTrue(future2.isDone());
		assertTrue(future3.isDone());
	}
}
