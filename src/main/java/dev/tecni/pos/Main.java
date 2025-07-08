package dev.tecni.pos;

import java.io.File;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import dev.tecni.pos.configs.AppConfig;
import dev.tecni.pos.views.LoginView;

/**
 * TD POS
 * Point of Sell
 * @author TecniDEV
 */
public class Main 
{
    public static void main( String[] args )
    {
        File properties = new File(AppConfig.fileName);
        if (properties.exists()) {
            boolean dark = Boolean.parseBoolean(AppConfig.get("darkTheme"));
            if (dark) FlatDarkLaf.setup();
            else FlatLightLaf.setup();
        } else {
            FlatLightLaf.setup();
            // TODO: make configuration wizard
        }
        new LoginView().setVisible(true);
    }
}
