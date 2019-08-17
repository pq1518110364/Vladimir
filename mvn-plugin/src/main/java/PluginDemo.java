import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "sayhi")
public class PluginDemo extends AbstractMojo {

    @Parameter
    private String hello;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("say hello!!!!"+hello);
    }
}
