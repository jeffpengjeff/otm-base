package tests;

import org.junit.Test;
import utils.OTMUtils;

public class Tests {

    @Test
    public void test_version(){
        System.out.println(OTMUtils.getBaseGitHash());
    }



}
