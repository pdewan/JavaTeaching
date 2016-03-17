package lectures.test.junit;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.notification.RunListener;

public class ProgrammaticJUnitRun  extends RunListener {
	@Override
	public void testFailure(Failure failure) {
	       try {
			super.testFailure(failure);
			System.out.println ("Failure:" + failure);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testFinished(Description description) {
		try {
			super.testFinished(description);
			System.out.println ("Test finished:"+ description);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	public static void main (String[] args) {
		RunNotifier aRunNotifier = new RunNotifier();
		aRunNotifier.addListener(new ProgrammaticJUnitRun());
		try {
			Runner aRunner = new BlockJUnit4ClassRunner(ACartesianPointJUnitTester.class);
			// InitializationError
//			Runner aRunner = new BlockJUnit4ClassRunner(ACartesianPointParametrizedJUnitTester.class);
//			Runner aRunner = new BlockJUnit4ClassRunner(ASinglePointBeforeClassJUnitMultiTester.class);
			// IniitializationError
//			Runner aRunner = new BlockJUnit4ClassRunner(ACartesianPointParametrizedJUnitMultiTester.class);
			aRunner.run(aRunNotifier);
		} catch (org.junit.runners.model.InitializationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
