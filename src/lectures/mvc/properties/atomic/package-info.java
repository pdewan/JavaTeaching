/**
 * PRAXIS-INFO
 * 
 * We will now address a persistent problem in our animations - how to refresh
 * the display of an object without getting the warning that we should not be
 * asking ObjectEditor explicitly to refresh the object.
 * 
 * This is part of a bigger problem: how to create multiple views of an object
 * that are kept consistent.
 * 
 * This, in turn, is part of an even bigger problem: how to decompose the
 * functionality of an interactive application into different objects.
 * 
 * The solution to the last problem is a recurring "pattern" called MVC - for
 * Model-View-Controller.
 * 
 * A component of MVC is a pattern called Observer, which provides a solution
 * to the first and second problems.
 * 
 * In lecture slides, we start with the last problem and gradually reduce it.
 * 
 * Here we will start with the second problem and gradually increase it.
 * 
 * NAVIGATION-INFO
 * 
 * ANonObservableLine
 * AnObservableLine
 * APropertyListenerSupport
 *
 */
package lectures.mvc.properties.atomic;