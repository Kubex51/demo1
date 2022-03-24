package com.example.demo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class ParametersController
{
    private static Properties getProp(){
        Properties prop = new Properties();
        File f = new File(System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.properties");
        try (FileInputStream fis = new FileInputStream(f)) {
            prop.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
    static String getProperty(String property){
        return getProp().getProperty(property);
    }
    static String[] getArrayProperty(String property){
        return getProp().get(property).toString().split("#");
    }
}
