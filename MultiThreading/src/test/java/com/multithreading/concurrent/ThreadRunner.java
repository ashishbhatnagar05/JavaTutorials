package com.multithreading.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadRunner {

	public void run(final Runnable runnable, final int THREADCOUNT) {

		final ExecutorService executorService = Executors.newFixedThreadPool(THREADCOUNT);

		for (int i = 0; i < THREADCOUNT; i++) {
			executorService.execute(runnable);
		}

		executorService.shutdown();
	}

	public <V> List<Future<V>> call(final Callable<V> callable, final int THREADCOUNT)
			throws InterruptedException, ExecutionException {

		final ExecutorService executorService = Executors.newFixedThreadPool(THREADCOUNT);

		final List<Callable<V>> calls = new ArrayList<Callable<V>>();

		for (int i = 0; i < THREADCOUNT; i++) {
			calls.add(callable);
		}
		try {
			return executorService.invokeAll(calls);
		} finally {
			executorService.shutdown();
		}
	}
}
