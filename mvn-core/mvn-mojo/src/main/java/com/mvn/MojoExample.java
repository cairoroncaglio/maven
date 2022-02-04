package com.mvn;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo(name = "mojo-example")
public class MojoExample extends AbstractMojo {

    @Parameter(property = "mojo-example.mojovalue", defaultValue = "Default Mojo Value")
    private String mojovalue;

    public void execute() throws MojoExecutionException {
        getLog().info("Mojo with parameter, value: " + mojovalue);
    }
}
