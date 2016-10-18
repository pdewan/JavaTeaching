/**
 * PRAXIS-INFO
 * We saw in the previous praxis how to use the observer pattern to 
 * keep multiple OE views of an object consistsent. 
 * 
 * Here we will see how to create our own views
 * object consistent with the object, the observer pattern is relevant to
 * the problem of keeping multiple views of an object consistent.
 * 
 * 
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
 */

package lectures.mvc.toolkit;