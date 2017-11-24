package com.hribol.bromium.demo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * An example HTTP endpoint that waits for 2 seconds on purpose to demonstrate
 * the case when Selenium fails, but Bromium does not
 */
@Path("/")
public class Resource {

    private static Logger logger = LoggerFactory.getLogger(Resource.class);

    @GET
    @Path("http-queue.js")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        try {
            // Slow down response on purpose to demonstrate the race condition
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        return "\t\tconsole.log('Resource: http-queue.js loaded');\n" +
                "\t\tvar elemDiv = document.createElement('button');\n" +
                "\t\telemDiv.addEventListener('click', function() { this.innerHTML = 'I was clicked'});\n" +
                "\t\telemDiv.innerHTML = 'I was created when AJAX request was answered';\n" +
                "\t\telemDiv.id = \"ajax-button\";\n" +
                "\t\tdocument.body.appendChild(elemDiv);";
    }
}