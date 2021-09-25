package com.honsoft;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
 
/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo
{
	
	 /**
     * The greeting to display.
     */
    @Parameter( property = "sayhi.greeting", defaultValue = "${project.version}" )
    private String greeting;
    
    /**
     * My Array.
     */
    @Parameter
    private String[] myArray = new String[1];
    
    public void execute() throws MojoExecutionException
    {
        getLog().info(greeting );
        for(String array : myArray) {
        	getLog().info(array);
        }
    }
}