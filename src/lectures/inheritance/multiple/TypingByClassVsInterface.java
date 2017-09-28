package lectures.inheritance.multiple;

import lectures.inheritance.abstract_classes.AFreshmanSeminar;
import lectures.inheritance.abstract_classes.FreshmanSeminar;

public class TypingByClassVsInterface {
	static void processClass (AFreshmanSeminar course) {
		
	}
	
    static void processInterface (FreshmanSeminar course) {
		
	}
    
    static void callProcess() {
//    	processClass (new ALoggedFreshmanSeminar("Intro. Prog.", "CS", 110));
    	processInterface (new ALoggedFreshmanSeminar("Random Thoughts", "CS"));

    }

}
