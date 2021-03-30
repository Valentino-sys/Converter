import org.testng.Assert;
import org.testng.annotations.Test;
import parser.XMLParser;

public class XMLParserTest {
    @Test
    public void testXmlMonth() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Month.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        // Знак "\", закрывающий тег , проверяется не правильный (смотрит не в ту сторону, должен проверяться знак "/")
        // Файл валидный, но тест падает!!! Проблема в методе "closeTag"
    }

    @Test
    public void testXmlSchool() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Month.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
         // Знак "\", закрывающий тег , проверяется не правильный (смотрит не в ту сторону, должен проверяться знак "/")
        // Нет ошибки , но в теге class и атрибуте  teacher нет кавычек!!
    }

    @Test
    public void testXmlCar() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Car.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        // Знак "\", закрывающий тег , проверяется не правильный (смотрит не в ту сторону, должен проверяться знак "/")
       // Тег stamp прошел проверку
    }

    @Test
    public void testXmlHome() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Home.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        // Нет знака "?" в корне, но тест проходит
    }

    @Test
    public void testXmlLocomotiveDepot() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\LocomotiveDepot.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        // Нет закрывающего корневого тега, но тест падает из - за того , что не правильно записаны закрывающие
        // теги (repair shop и operation shop), хотя они закрыты правильно

    }
    @Test
    public void testXmlAnimal() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Animal.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        // Знак "\", закрывающий тег , проверяется не правильный (смотрит не в ту сторону, должен проверяться знак "/")
        //Нет открывающего корневго тега animal, сообщение выводится , все ок
    }
    @Test
    public void testXmlVoid() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Void.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        //  Нет обработки исключения на пустой xml файл

    }
    @Test
    public void testXmlText() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\Text.xml");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        //Тест падает правильно
    }
    @Test
    public void testXmlTXTFile() {
        XMLParser xmlParser = new XMLParser("C:\\XmlFiles\\TXTFile.txt");
        xmlParser.parseDocument();
        Assert.assertTrue(xmlParser.getErrors().isEmpty());
        //Тест падает правильно
    }

}
