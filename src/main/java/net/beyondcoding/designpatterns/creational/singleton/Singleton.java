package net.beyondcoding.designpatterns.creational.singleton;

/**
 * Exampel singleton design pattern.
 */
public class Singleton
{
    // Use volitile to make thread safe
    private static volatile Singleton instance;

    private Singleton()
    {
        // Private constructor as Singletons cannot be directly instantiated
    }

    public static Singleton getInstance()
    {
        if( instance == null )
        {
            // Make this thread safe
            synchronized ( Singleton.class )
            {
                if( instance == null )
                {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
