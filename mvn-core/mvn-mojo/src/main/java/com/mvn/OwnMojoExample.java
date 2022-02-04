package com.mvn;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;


@Mojo( name = "mojo-name")
public class OwnMojoExample extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info( "" +
                "Own mojo example.\n" +
                "Own mojo example.\n" +
                "Own mojo example.\n" +
                "Own mojo example.\n" +
                "Own mojo example.\n" );
    }
}
