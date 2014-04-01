package com.springapp.app

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext


/**
 * Created with IntelliJ IDEA.
 * User: Mohsan
 * Date: 20-03-14
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
class Runner {


    public static void main(String[] args) throws Exception
    {
        System.setProperty("org.eclipse.jetty.LEVEL","DEBUG")
        Server server = new Server(8080)
        WebAppContext webapp = new WebAppContext()
        webapp.setContextPath("/")
        webapp.setWar("src/main/webapp")
        server.setHandler(webapp)
        server.start()
        server.join()

    }

}
