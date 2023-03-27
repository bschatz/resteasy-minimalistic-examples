package server;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Application;

@Path("op")
public class MyRestService extends Application
{
   @GET
   @Path("ping")
   public String ping()
   {
      return "PONG";
   }
}
