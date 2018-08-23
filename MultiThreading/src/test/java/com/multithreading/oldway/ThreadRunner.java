package com.multithreading.oldway;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadRunner {

	public void run(final Runnable runnable, final int THREADCOUNT) {

		for (int i = 0; i < THREADCOUNT; i++) {
			new Thread(runnable).start();
		}

	}

	public <V> List<V> call(final Callable<V> callable, final int THREADCOUNT)
			throws InterruptedException, ExecutionException {

		List<V> results = new ArrayList<V>();

		for (int i = 0; i < THREADCOUNT; i++) {

			FutureTask<V> futureTask = new FutureTask<V>(callable);
			new Thread(futureTask).start();
			results.add(futureTask.get());

		}

		return results;
	}
}
