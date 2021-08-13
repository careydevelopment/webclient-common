![Carey Development Logo](http://careydevelopment.us/img/branding/careydevelopment-logo-sm.png)

# Carey Development API Flyweights 
![](https://img.shields.io/badge/jdk-11-blue.svg) ![license](https://img.shields.io/badge/license-MIT-blue.svg) 
![](https://img.shields.io/badge/maven-3.6.3-blue.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/us.careydevelopment.model.api/api-flyweights/badge.svg)](https://search.maven.org/artifact/us.careydevelopment.model.api/api-flyweights/1.2.0-RELEASE/jar)




Carey Development API Flyweights includes lightweight objects from downstream APIs.

This package exists because some APIs produce very large objects (I'm looking at you, YouTube API). Most upstream services
don't need all that data.


## Latest Release
You can pull it from the central Maven repositories:

```xml
 <dependency>
    <groupId>us.careydevelopment.model.api</groupId>
    <artifactId>api-flyweights</artifactId>
    <version>1.0.0-RELEASE</version>
 </dependency>
```

## License
This code is under the [MIT License](https://github.com/careydevelopment/api-flyweights/blob/main/LICENSE).
