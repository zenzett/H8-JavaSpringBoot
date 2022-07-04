<<<<<<< HEAD
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.challenge;

import java.io.File;
import java.io.IOException;

import java.nio.file.Paths;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
// import java.util.logging.MemoryHandler;

public class MyRunner {
    
    private SAXParser createSAXParser() {
        
        SAXParser saxParser = null;

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();

            return saxParser;
        } catch (ParserConfigurationException | SAXException ex) {

            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return saxParser;
    }

    public List<User> parseUsers() {

        MyHandler handler = new MyHandler();
        String fileName = "src/main/resources/users.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try {

            SAXParser parser = createSAXParser();
            parser.parse(xmlDocument, handler);

        } catch (SAXException | IOException ex) {

            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return handler.getUsers();
    }
}
=======
// package DemoSAX.src.main.java.com.learning.sax;
package com.learning.challenge;

import java.io.File;
import java.io.IOException;

import java.nio.file.Paths;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
// import java.util.logging.MemoryHandler;

public class MyRunner {
    
    private SAXParser createSAXParser() {
        
        SAXParser saxParser = null;

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();

            return saxParser;
        } catch (ParserConfigurationException | SAXException ex) {

            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return saxParser;
    }

    public List<User> parseUsers() {

        MyHandler handler = new MyHandler();
        String fileName = "src/main/resources/users.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try {

            SAXParser parser = createSAXParser();
            parser.parse(xmlDocument, handler);

        } catch (SAXException | IOException ex) {

            Logger lgr = Logger.getLogger(MyRunner.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return handler.getUsers();
    }
}
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
