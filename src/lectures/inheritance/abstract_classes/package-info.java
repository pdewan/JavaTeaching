/**
 * PRAXIS_INFO
 * We have here three class IS-A hierarchies, two of which use the new
 * concept of abstract classes.
 * 
 * Two hierarchies divide courses into regular courses and freshman seminars under
 * UNC's old numbering scheme, which is needed for these two courses to make
 * sense. 
 * Under this scheme, all freshman seminars had the same course number (6), 
 * so this number can be a named constant instead of a (non-final) variable.
 * 
 * One of these hierarchies uses abstract classes and one does not.
 * 
 * We will also see a display hierarchy to create user interfaces to display a course
 * that matches some title.
 * 
 * The display hierarchy will use factory methods to create the courses. 
 * 
 */
/**
 * NAVIGATION INFO
 * ACourseDisplayer
 * ACourseDisplayer1 
 * ACourseDisplayer2
 * AnotherRegularCourse
 * AnotherFreshmanSeminar
 * ARegularCourse
 * ACourse
 * AFreshmanSeminar
 * 
 */

package lectures.inheritance.abstract_classes;
//Go to ACourseDisplayer first