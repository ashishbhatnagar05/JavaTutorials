package com.multithreading.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Before;
import org.junit.Test;

public class PrinterThreadRunner extends ThreadRunner {

	private final static int THREADCOUNT = 20;

	private Printer printer;

	@Before
	public void setup() {
		printer = new Printer();
	}

	// test object
	@Test
	public void testRunnable() {

		run(getRunnableForPrinter(), THREADCOUNT);

	}

	@Test
	public void testCallable() throws InterruptedException, ExecutionException {

		List<Future<Integer>> futures = call(getCallableForPrinter(), THREADCOUNT);
		List<Integer> results = new ArrayList<Integer>();
		for (Future<Integer> future : futures) {
			future.get();
		}
		System.out.println(results);

	}

	private Callable<Integer> getCallableForPrinter() {

		return new Callable<Integer>() {
			public Integer call() throws Exception {
				return printer.getValue();
			}

		};

	}

	private Runnable getRunnableForPrinter() {

		return new Runnable() {
			public void run() {
				printer.print();

			}
		};

	}
}
