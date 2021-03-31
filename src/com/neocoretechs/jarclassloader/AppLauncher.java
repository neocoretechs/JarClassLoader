package com.neocoretechs.jarclassloader;


/**
 * This class loader loads classes, native libraries and resources from
 * the top JAR and from JARs inside top JAR. The loading process looks
 * through JARs hierarchy and allows their tree structure, i.e. nested JARs.
 * <p>
 * The top JAR and nested JARs are included in the classpath and searched
 * for the class or resource to load. The nested JARs could be located
 * in any directories or subdirectories in a parent JAR.
 * <p>
 * All directories or subdirectories in the top JAR and nested JARs are
 * included in the library path and searched for a native library.
 * For example, the library "Native.dll" could be in the JAR root directory
 * as "Native.dll" or in any directory as "lib/Native.dll"
 * or "abc/xyz/Native.dll".
 * <p>
 * This class delegates class loading to the parent class loader and
 * successfully loads classes, native libraries and resources when it works
 * not in a JAR environment.
 * <p>
 * Create a launcher class to start your class
 * <code>com.mycompany.MyApp main()</code> method to start your application
 * <code>
*/
public class AppLauncher {

	    public static void main(String[] args) {
	        JarClassLoader jcl = new JarClassLoader();
	        try {
	            jcl.invokeMain("com.mycompany.MyApp", args);
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }
	    } // main()

	
}
