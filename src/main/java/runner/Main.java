package runner;

import xml.JaxbLoader;

public class Main {

    public static void main(String[] args){
        try {
            String configfile = "config\\intersection.xml";
            JaxbLoader.load_scenario(configfile,true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
