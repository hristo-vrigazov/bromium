package com.hribol.bromium.demo.app;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class App {

    public static void main(String[] args)  {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.hribol.bromium.demo.app");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(3000);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{ "ajax.html" });

        resourceHandler.setResourceBase(".");

        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] {
                resourceHandler,
                context
        });
        server.setHandler(handlers);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.destroy();
        }
    }

}
