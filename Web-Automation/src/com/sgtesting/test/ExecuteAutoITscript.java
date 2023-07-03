package com.sgtesting.test;

public class ExecuteAutoITscript {

	public static void main(String[] args) {
		executeScript();

	}
	private static void executeScript()
	{
		try
		{
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("C:\\ExampleAutomation\\FirstTestscript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
