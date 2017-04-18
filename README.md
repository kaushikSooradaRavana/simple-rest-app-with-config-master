# Simple REST Sample Application using Spring Cloud Config Server

A simple Spring Boot based sample application that uses Spring Cloud Config Server. The application uses the following:

- A config server repository named [simple-rest-app-with-config-config](https://git.diconium.com/org-mbusa/simple-rest-app-with-config-config) with some sample configuration for property `simple.greeting`.
- A user-provided service instance in the target space that references the global config server in the GLOBAL-SERVICE-* PCF org. The user-provided service must be named `ow-config-server`. The corresponding service binding can be found in the `services` section of the `manifest.yml` file.  

## Build the application

Build the project with Maven:

```
mvn clean package
```

## Run the application

Deploy the application to Cloud Foundry:

```
cf push
```

Access the application remotely at: https://simple-rest-app-with-config-v1.apps.dev.api.mbusa.oneweb.mercedes-benz.cinteo.de/simple-rest-app-with-config/v1/hello/MBUSA
