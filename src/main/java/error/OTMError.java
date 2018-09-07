/**
 * Copyright (c) 2018, Gabriel Gomes
 * All rights reserved.
 * This source code is licensed under the standard 3-clause BSD license found
 * in the LICENSE file in the root directory of this source tree.
 */
package error;

public class OTMError {
    public enum Level {Warning,Error}
    String description;
    Level mylevel;
    public OTMError(String description, Level mylevel){
        this.description = description;
        this.mylevel = mylevel;
    }
}