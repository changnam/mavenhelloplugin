package com.honsoft;

import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello")
public class HelloMojo implements org.apache.maven.plugin.Mojo {

    private Log log;

    @Override
    public void execute() {
        log.info("Hello, world --- hello mojo");
    }

    @Override
    public void setLog(Log log) {
        this.log = log;
    }

    @Override
    public Log getLog() {
        return log;
    }
}
