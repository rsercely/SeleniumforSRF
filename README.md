# SeleniumforSRF  

This repository is for learning how to use Selenium with StormRunner Functional (SRF), 
Micro Focus's new SaaS solution that provides an execution lab for web and mobile testing.

The master branch is a Selenium test ready to run, except that it needs one object added, which
is easily done within LeanFT.

The SRF_RemoteExecution branch contains all of the modification necessary for remote execution in SRF.

The SRF_WebExecution branch contains all of the modifications necessary to build a jar file which
can be uploaded to SRF and added to a test, then run within SRF.

Note that this work was done during a transition, with some work done on LeanFT 14.2, and some 14.3. As a result, you might have to modify the pom to get the version you are using.

<dependency>
            <groupId>com.hpe.lft</groupId>
            <artifactId>selenium-sdk</artifactId>
            <version>14.2.0</version>
        </dependency>
