package com.javarush.task.task19.task1918;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String file = input.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder build = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    build.append(line);
                }
                String tag = args[0];
//                Elements element = Jsoup.parse(build.toString(), "", Parser.xmlParser()).select(tag);
//                System.out.println(element);
                File XMLfile = new File(build.toString());
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                Document doc = null;
                try {
                    doc = dbf.newDocumentBuilder().parse(XMLfile);
                } catch (SAXException e) {
                    e.printStackTrace();
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                }
                Node node = doc.getFirstChild();
                NodeList childs = node.getChildNodes();

                for (int i = 0; i < childs.getLength(); i++) {
                    System.out.println(childs.item(i).getNodeName());
                }
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt