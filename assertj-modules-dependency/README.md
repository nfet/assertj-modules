# assertj-modules-dependency

This project contains the maven dependencies used for **assertj-modules**.  
This module will be released and versioned manually of the main 
assertj-modules assertion library.  The [assert-module-dependency/pom.xml](pom.xml)
is expect to released manually to github.

## Release Process

> Make sure that the pom version is incremented and the `-SNAPSHOT` or any
> other qualifier is removed.  For example, it should always have the format 
> of `{MajorVersion}.{MinorVersion}.{IncrementalVersion}`, i.e. 1.0.0. 

### Manual Release Deployment

```shell script
./mvnw deploy
```

