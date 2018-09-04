/**
 * Copyright (c) 2018, Gabriel Gomes (gomes@me.berkeley.edu)
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package xml;

import error.OTMException;
import jaxb.Scenario;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.InputStream;

public class JaxbLoader {

    public static jaxb.Scenario load_scenario(String filename, boolean validate) throws OTMException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Scenario.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            if(validate) {
                SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                InputStream resourceAsStream = JaxbLoader.class.getResourceAsStream("/otm.xsd");
                Schema schema = sf.newSchema(new StreamSource(resourceAsStream));
                unmarshaller.setSchema(schema);
            }

            Scenario jaxb_scenario = (Scenario) unmarshaller.unmarshal(new File(filename));
            return jaxb_scenario;
        } catch(org.xml.sax.SAXException e){
            throw new OTMException(e);
        }  catch (JAXBException e) {
            throw new OTMException(e);
        }
    }

//    public static jaxb.OutputRequests load_output_request(String filename, boolean validate) throws OTMException {
//        try {
//            JAXBContext jaxbContext = JAXBContext.newInstance(OutputRequests.class);
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//            // I am having trouble with this him loading into otm-sim.
//            // It claims it cannot find otm.xsd
//            if(validate) {
//                SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//                String schemaName = JaxbLoader.class.getResource("/outputs.xsd").getFile();
//                File schemaFile = new File(schemaName);
//                Schema schema = sf.newSchema(schemaFile);
//                unmarshaller.setSchema(schema);
//            }
//
//            OutputRequests jaxb_outputrequests = (OutputRequests) unmarshaller.unmarshal(new File(filename));
//            return jaxb_outputrequests;
//        } catch(org.xml.sax.SAXException e){
//            throw new OTMException(e);
//        }  catch (JAXBException e) {
//            throw new OTMException(e);
//        }
//    }

}