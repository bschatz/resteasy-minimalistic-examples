* Default tomcat installation listening on 8080.
* ``gradle war``
* Copy (or link) the war file to the webapps folder of your tomcat, e.g. ``cp build/libs/resteasy-minimalistic-examples.war /usr/local/tomcat11/webapps/.``
* Call http://localhost:8080/resteasy-minimalistic-examples/rest/op/ping
* result: ``PONG``
