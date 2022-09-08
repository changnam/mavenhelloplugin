package com.honsoft;

import java.util.HashMap;
import java.util.Map;

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
        
        Map<String,Object> envs = new HashMap<>();
		envs.put("file.separator", System.getProperty("file.separator"));
		envs.put("java.class.path", System.getProperty("java.class.path"));
		envs.put("java.home", System.getProperty("java.home"));
		envs.put("java.vendor", System.getProperty("java.vendor"));
		envs.put("java.vendor.url", System.getProperty("java.vendor.url"));
		envs.put("java.version", System.getProperty("java.version"));
		envs.put("line.separator", System.getProperty("line.separator"));
		envs.put("os.arch", System.getProperty("os.arch"));
		envs.put("os.name", System.getProperty("os.name"));
		envs.put("os.version", System.getProperty("os.version"));
		envs.put("path.separator", System.getProperty("path.separator"));
		envs.put("user.dir", System.getProperty("user.dir"));
		envs.put("user.home", System.getProperty("user.home"));
		envs.put("user.name", System.getProperty("user.name"));
		
		for (String key : envs.keySet()){
			getLog().info(key+" : "+envs.get(key));
		}
		
        for(String array : myArray) {
        	getLog().info(array);
        }
        
        
    }
}