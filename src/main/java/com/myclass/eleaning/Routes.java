package com.myclass.eleaning;

import java.util.HashMap;
import java.util.Map;

public class Routes {

    private static Map<String, String> routes;

    public static final String host = "/eleaning";
    public static final String home = "/home";
    public static final String login = "/login";
    public static final String logout = "/logout";

    private static void setRoutes()
    {       
        if(routes == null)
        {
            routes = new HashMap<>();

            routes.put("host", host);
            routes.put("home", host + home);
            routes.put("entrar", host );
            routes.put("sair", host);
        }
    }   

    public static Map<String, String> getRoutes()
    {
        setRoutes();

        return routes;
    }

    public static String getRoute(String name)
    {
        setRoutes();

        return routes.get(name);
    }

}
