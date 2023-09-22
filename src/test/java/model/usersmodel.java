package model;

import java.util.ArrayList;

public class usersmodel {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
    public class Datum{
        public int id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;
    }

    public class Root{
        public int page;
        public int per_page;
        public int total;
        public int total_pages;
        public ArrayList<Datum> data;
        public Support support;
    }

    public class Support{
        public String url;
        public String text;
    }


}
