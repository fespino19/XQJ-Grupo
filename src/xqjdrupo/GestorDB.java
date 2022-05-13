package xqjdrupo;

import net.xqj.exist.ExistXQDataSource;

import javax.xml.stream.XMLStreamException;
import javax.xml.xquery.*;

public class GestorDB {
    public XQConnection conectado;

    public GestorDB() throws XQException {
        XQDataSource xqs = new ExistXQDataSource();
        xqs.setProperty("serverName", "192.168.251.17");
        xqs.setProperty("port", "8080");
        conectado = xqs.getConnection();
    }
    public void tancarSessió() throws XQException {
        conectado.close();
    }

    public void getAyuntamientos( String nombre) throws  XQException, XMLStreamException{

        XQExpression expression = conectado.createExpression();

        String queryGeneral = "count(doc('/db/record/Plans_Especials_360.xml')//ListRecords/record[dc.contributor.author='"+nombre+"'])";

        expression.executeQuery(queryGeneral);


        XQResultSequence queryLocalitat = expression.executeQuery(queryGeneral);
        while (queryLocalitat.next()) {
            System.out.println("Hay "+queryLocalitat.getItemAsString(null)+" record del "+nombre);
        }

        expression.close();

    }

    public void getAyuntamientosTotal() throws  XQException, XMLStreamException{

        XQExpression expression = conectado.createExpression();

        String queryGeneral = """
                for $i in doc('/db/record/Plans_Especials_360.xml')
                let $nombres:=distinct-values(//ListRecords/record/dc.contributor.author/text())
                return
                    $nombres
                """;

        expression.executeQuery(queryGeneral);


        XQResultSequence queryLocalitat = expression.executeQuery(queryGeneral);
        while (queryLocalitat.next()) {
            System.out.println(queryLocalitat.getItemAsString(null));
        }

        expression.close();

    }


    public void getDataCreate( String fecha) throws  XQException, XMLStreamException{

        XQExpression expression = conectado.createExpression();

        String queryGeneral = "count(doc('/db/record/Plans_Especials_360.xml')//ListRecords/record[dc.date.created='"+fecha+"'])";

        expression.executeQuery(queryGeneral);


        XQResultSequence queryLocalitat = expression.executeQuery(queryGeneral);
        while (queryLocalitat.next()) {
            System.out.println("Hay "+queryLocalitat.getItemAsString(null)+"  Records publicados e en la fecha del "+fecha);
        }

        expression.close();

    }









                   
               



}