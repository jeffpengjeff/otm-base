/**
 * Copyright (c) 2018, Gabriel Gomes (gomes@me.berkeley.edu)
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

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
