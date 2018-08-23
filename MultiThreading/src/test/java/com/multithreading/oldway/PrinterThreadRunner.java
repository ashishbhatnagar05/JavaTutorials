package com.multithreading.oldway;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

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

		List<Integer> results = call(getCallableForPrinter(), THREADCOUNT);
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
