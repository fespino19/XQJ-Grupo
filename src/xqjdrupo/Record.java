package xqjdrupo;

import java.util.List;

public class Record {
    private List<Record> ListaRc = null;
    String dc_contributor_author;
    String dc_coverage_spatial;
    String dc_date_created;
    String dc_date_issued;
    String dc_identifier_citation;

    String dc_identifier_uri;
    String dc_description;
    String dc_format_extent;
    String dc_lenguage;
    String dc_relation_replaces;
    String dc_relation_isreplacedby;
    String dc_rights;
    String dc_rights_uri;
    String dc_subject;
    String dc_title;
    String dc_title_alternative;
    String dc_type;
    String dc_subject_category;
    String dc_date_validinici;
    String dc_rights_accessrights;
    String dc_identifier_ab;
    String dc_subject_forma;
    String dc_date_validfinal;
    String dc_coverage_vigencia;
    String dc_description_legislationchangedby;
    String dc_description_legislationchanged;

    String dc_description_tableofcontents;

    String dc_relation_isbasedon;

    String dc_identifier_bg;

    String dc_relation_isrequiredby;


    public Record(String dc_contributor_author, String dc_coverage_spatial, String dc_date_created,String dc_date_issued,String dc_identifier_citation,String dc_identifier_uri,String dc_description,String dc_format_extent,String dc_lenguage,String dc_relation_replaces, String dc_relation_isreplacedby, String dc_rights,
    String dc_rights_uri, String dc_subject, String dc_title, String dc_title_alternative, String dc_type, String dc_subject_category, String dc_date_validinici, String dc_rights_accessrights, String dc_identifier_ab, String dc_subject_forma, String dc_date_validfinal, String dc_coverage_vigencia, String dc_description_legislationchangedby, String dc_description_legislationchanged,String dc_description_tableofcontents, String dc_relation_isbasedon, String dc_identifier_bg, String dc_relation_isrequiredby){

        this.dc_contributor_author= dc_contributor_author;
        this.dc_coverage_spatial = dc_coverage_spatial;
        this.dc_date_created = dc_date_created;
        this.dc_date_issued = dc_date_issued;
        this.dc_identifier_citation = dc_identifier_citation;
        this.dc_identifier_uri = dc_identifier_uri;
        this.dc_description = dc_description;
        this.dc_format_extent = dc_format_extent;
        this.dc_lenguage = dc_lenguage;
        this.dc_relation_replaces =dc_relation_replaces;
        this.dc_relation_isreplacedby = dc_relation_isreplacedby;
        this.dc_rights = dc_rights;
        this.dc_rights_uri = dc_rights_uri;
        this.dc_subject = dc_subject;
        this.dc_title = dc_title;
        this.dc_title_alternative = dc_title_alternative;
        this.dc_type = dc_type;
        this.dc_subject_category = dc_subject_category;
        this.dc_date_validinici = dc_date_validinici;
        this.dc_rights_accessrights = dc_rights_accessrights;
        this.dc_identifier_ab = dc_identifier_ab;
        this.dc_subject_forma = dc_subject_forma;
        this.dc_date_validfinal = dc_date_validfinal;
        this.dc_coverage_vigencia = dc_coverage_vigencia;
        this.dc_description_legislationchangedby = dc_description_legislationchangedby;
        this.dc_description_legislationchanged = dc_description_legislationchanged;
        this.dc_description_tableofcontents = dc_description_tableofcontents;
        this.dc_relation_isbasedon = dc_relation_isbasedon;
        this.dc_identifier_bg = dc_identifier_bg;
        this.dc_relation_isrequiredby = dc_relation_isrequiredby;











    }


    public Record() {

    }

    public List<Record> getRecord() {
        return ListaRc;

    }
    public  String getDc_contributor_author(){
        return dc_contributor_author;
    }
    public void setDc_contributor_author( String dc_contributor_author){
        this.dc_contributor_author = dc_contributor_author;
    }




    public String getDc_coverage_spatial(){
        return  dc_coverage_spatial;
    }
    public  void setDc_coverage_spatial( String dc_coverage_spatial){
        this.dc_coverage_spatial = dc_coverage_spatial;
    }



    public String getDc_date_created(){
        return  dc_date_created;
    }
    public void setDc_date_created(){
        this.dc_date_created = dc_date_created;
    }



    public String getDc_date_issued(){
        return  dc_date_issued;
    }
    public void setDc_date_issued(){
        this.dc_date_issued = dc_date_issued;
    }



    public String getDc_identifier_citation(){
        return  dc_identifier_citation;
    }
    public void setDc_identifier_citation(){
        this.dc_identifier_citation = dc_identifier_citation;
    }


    public String getDc_identifier_uri(){
        return  dc_identifier_uri;
    }
    public void setDc_identifier_uri(){
        this.dc_identifier_uri = dc_identifier_uri;
    }


    public String getDc_description(){
        return  dc_description;
    }
    public void setDc_description(){
        this.dc_description = dc_description;
    }



    public String getDc_format_extent(){
        return  dc_format_extent;
    }
    public void setDc_format_extent(){
        this.dc_format_extent = dc_format_extent;
    }



    public String getDc_lenguage(){
        return  dc_lenguage;
    }
    public void setDc_lenguage(){
        this.dc_lenguage = dc_lenguage;
    }



    public String getDc_relation_replaces(){
        return  dc_relation_replaces;
    }
    public void setDc_relation_replaces(){
        this.dc_relation_replaces = dc_relation_replaces;
    }




    public String getDc_relation_isreplacedby(){
        return  dc_relation_isreplacedby;
    }
    public void setDc_relation_isreplacedby(){
        this.dc_relation_isreplacedby = dc_relation_isreplacedby;
    }


    public String getDc_rights(){
        return  dc_rights;
    }
    public void setDc_rights(){
        this.dc_rights = dc_rights;
    }



    public String getDc_rights_uri(){
        return  dc_rights_uri;
    }
    public void setDc_rights_uri(){
        this.dc_rights_uri = dc_rights_uri;
    }




    public String getDc_subject(){
        return  dc_subject;
    }
    public void setDc_subject(){
        this.dc_subject = dc_subject;
    }


    public String getDc_title(){
        return  dc_title;
    }
    public void setDc_title(){
        this.dc_title = dc_title;
    }



    public String getDc_title_alternative(){
        return  dc_title_alternative;
    }
    public void setDc_title_alternative(){
        this.dc_title_alternative = dc_title_alternative;
    }



    public String getDc_type(){
        return  dc_type;
    }
    public void setDc_type(){
        this.dc_type = dc_type;
    }




    public String getDc_subject_category(){
        return  dc_subject_category;
    }
    public void setDc_subject_category(){
        this.dc_subject_category = dc_subject_category;
    }



    public String getDc_date_validinici(){
        return  dc_date_validinici;
    }
    public void setDc_date_validinici(){
        this.dc_date_validinici = dc_date_validinici;
    }



    public String getDc_rights_accessrights(){
        return  dc_rights_accessrights;
    }
    public void setDc_rights_accessrights(){
        this.dc_rights_accessrights = dc_rights_accessrights;
    }


    public String getDc_identifier_ab(){
        return  dc_identifier_ab;
    }
    public void setDc_identifier_ab(){
        this.dc_identifier_ab = dc_identifier_ab;
    }



    public String getDc_subject_forma(){
        return  dc_subject_forma;
    }
    public void setDc_subject_forma(){
        this.dc_subject_forma = dc_subject_forma;
    }


    public String getDc_date_validfinal(){
        return  dc_date_validfinal;
    }
    public void setDc_date_validfinal(){
        this.dc_date_validfinal = dc_date_validfinal;
    }


    public String getDc_coverage_vigencia(){
        return  dc_coverage_vigencia;
    }
    public void setDc_coverage_vigencia(){
        this.dc_coverage_vigencia = dc_coverage_vigencia;
    }


    public String getDc_description_legislationchangedby(){
        return  dc_description_legislationchangedby;
    }
    public void setDc_description_legislationchangedby(){
        this.dc_description_legislationchangedby = dc_description_legislationchangedby;
    }


    public String getDc_description_legislationchanged(){
        return  dc_description_legislationchanged;
    }
    public void setDc_description_legislationchanged(){
        this.dc_description_legislationchanged = dc_description_legislationchanged;
    }


    public String getDc_description_tableofcontents(){
        return  dc_description_tableofcontents;
    }
    public void setDc_description_tableofcontents(){
        this.dc_description_tableofcontents = dc_description_tableofcontents;
    }

    public String getDc_relation_isbasedon(){
        return  dc_relation_isbasedon;
    }
    public void setDc_relation_isbasedon(){
        this.dc_relation_isbasedon = dc_relation_isbasedon;
    }

    public String getDc_identifier_bg(){
        return  dc_identifier_bg;
    }
    public void setDc_identifier_bg(){
        this.dc_identifier_bg = dc_identifier_bg;
    }

    public String getDc_relation_isrequiredby(){
        return  dc_relation_isrequiredby;
    }
    public void setDc_relation_isrequiredbys(){
        this.dc_relation_isrequiredby = dc_relation_isrequiredby;
    }

    @Override
    public String toString() {
        return "Record{" +
                "ListaRc=" + ListaRc +
                ", dc_contributor_author='" + dc_contributor_author + '\'' +
                ", dc_coverage_spatial='" + dc_coverage_spatial + '\'' +
                ", dc_date_created='" + dc_date_created + '\'' +
                ", dc_date_issued='" + dc_date_issued + '\'' +
                ", dc_identifier_citation='" + dc_identifier_citation + '\'' +
                ", dc_identifier_uri='" + dc_identifier_uri + '\'' +
                ", dc_description='" + dc_description + '\'' +
                ", dc_format_extent='" + dc_format_extent + '\'' +
                ", dc_lenguage='" + dc_lenguage + '\'' +
                ", dc_relation_replaces='" + dc_relation_replaces + '\'' +
                ", dc_relation_isreplacedby='" + dc_relation_isreplacedby + '\'' +
                ", dc_rights='" + dc_rights + '\'' +
                ", dc_rights_uri='" + dc_rights_uri + '\'' +
                ", dc_subject='" + dc_subject + '\'' +
                ", dc_title='" + dc_title + '\'' +
                ", dc_title_alternative='" + dc_title_alternative + '\'' +
                ", dc_type='" + dc_type + '\'' +
                ", dc_subject_category='" + dc_subject_category + '\'' +
                ", dc_date_validinici='" + dc_date_validinici + '\'' +
                ", dc_rights_accessrights='" + dc_rights_accessrights + '\'' +
                ", dc_identifier_ab='" + dc_identifier_ab + '\'' +
                ", dc_subject_forma='" + dc_subject_forma + '\'' +
                ", dc_date_validfinal='" + dc_date_validfinal + '\'' +
                ", dc_coverage_vigencia='" + dc_coverage_vigencia + '\'' +
                ", dc_description_legislationchangedby='" + dc_description_legislationchangedby + '\'' +
                ", dc_description_legislationchanged='" + dc_description_legislationchanged + '\'' +
                ", dc_description_tableofcontents='" + dc_description_tableofcontents + '\'' +
                ", dc_relation_isbasedon='" + dc_relation_isbasedon + '\'' +
                ", dc_identifier_bg='" + dc_identifier_bg + '\'' +
                ", dc_relation_isrequiredby='" + dc_relation_isrequiredby + '\'' +
                '}';
    }
}
