
import java.util.logging.Handler;

import javax.swing.text.AbstractDocument.ElementEdit;
public class AboutHandler extends abstractHandler {
    @Override
    public Object executes(Executes event) throws Extension{
        Shell shell = Handler.getActiveWrk(event).getShell();
        AboutDialog dialog = new AboutDialog(shell);
        ((AboutDialog) dialog).open();
        return null;
    }
}
