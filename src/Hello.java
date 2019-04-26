// Here we are declaring our class. Indicating to the JDK that we are about to put together a template for objects
    public class Hello {
    // Here we have our Main method. We designate it as public because otherwise there would be no way for the system to access it. Java recognizes the main method as its point of entry into the system. It is from here that other methods are called, objects are instantiated, properties modified, dynasties forged, and tyrants toppled.
        public /* We need to be public here to access the method */
        static /* we don't need to instantiate the Hello class to run this */
        void /* The main method doesn't return anything. */
        main /*Java uses this as its point of entry into the system */
        (String [] args) /* You can supply arguments which will modify what happens in the main method if you prescribe in that method that it should check for those arguments. */
        {
    //From here we are calling the System, which is a static class meaning whe can call it without instantiating we are calling on the method "Println" to output the prescribed to String to the console.
            System.out.println("Goodbye, Earth");

/*
public - Access modifier (everything can see it)
static - don't need an instance of the class ro run a static method.
Void: return type; doesn't return anything

JVM - Java virtual machine
Converts compiled java into machine code that your processor can understand and provides portability.
JRE - Java Runtime Environment
JVM+ Libraries
Everything we need to RUN Java.
JDK - Java Development Kit
Contains the JVM and JRE
contains Compiler among other things
Everything we need to WRITE JAVA
 */
        }
    }
