package edu.psu.ist440.team2.translator;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

	private static DataModel input;

	@BeforeClass
	public static void createInput() throws IOException {
		// TODO: set up your sample input object here.
		input = new DataModel();

	}

	private Context createContext() {
		TestContext ctx = new TestContext();

		// TODO: customize your context here if needed.
		ctx.setFunctionName("Translator");
		return ctx;
	}

	@Test
	public void testDummy() throws Exception {
		Assert.assertEquals("", "");
	}

	// @Test
	public void testLambdaFunctionHandler() throws Exception {
		LambdaFunctionHandler handler = new LambdaFunctionHandler();
		Context ctx = createContext();

		DataModel output = handler.handleRequest(input, ctx);

		// TODO: validate output here if needed.
		// Assert.assertEquals("Hello from Lambda!", output);
	}
}