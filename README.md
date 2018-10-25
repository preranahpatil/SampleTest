# SampleTest
README on how to build/test/execute your application
The files:Addition.java and Test.java are in the src folder

If runing from command line:

1.	Enter following command to compile the code - javac sample.java
2.	A class file gets generate- sample.class
3.	To run the code: java sample [argument list]
4.	Example: java sample “abc123”/java sample “abc123” -x
5.	Testing: Considering that you have junit-4.XX.jar and hamcrest installed, compile on Linux or MacOs using following command: javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar Test.java.
6.	Run the test: javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Test.java
-----------------------------------------------------------------------
or

1.import the Entire Project in Eclipse
2. In Run configuration put argument list: “abc123”/ “abc123” -x
3.Run as Java Application.
4. To run Test cases: Run Test.java as JUNIT.
