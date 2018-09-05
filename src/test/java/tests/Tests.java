package tests;

import error.OTMException;
import org.junit.Test;
import xml.JaxbLoader;

import static org.junit.Assert.assertNotNull;

public class Tests {

    @Test
    public void test_load_testconfig(){
        try {
            jaxb.Scenario scenario = JaxbLoader.load_test_scenario("diverges.xml", true);
            assertNotNull(scenario);
        } catch (OTMException e) {
            e.printStackTrace();
        }
    }
}
