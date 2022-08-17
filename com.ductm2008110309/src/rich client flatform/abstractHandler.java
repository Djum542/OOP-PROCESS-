import java.util.concurrent.Executor;
import java.util.logging.Handler;

public class abstractHandler {
    public Object executes(Executor event) {
        Shell shell = new Shell();
        AboutDialog dialog = new AboutDialog(shell);
        ((AboutDialog) dialog).open();
        return null;
    }
}
