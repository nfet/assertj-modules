# Release Process

# Use batch mode to auto update versions
```shell script
./mvnw --batch-mode release:prepare
```

# Release
```shell script
./mvnw release:perform
```

# Rolling back a release
```shell script
./mvnw release:rollback
./mvnw release:clean
```

## Miscellaneous

### Delete a local tag and push
```shell script
git tag -d <tag-name> 
git push origin :refs/tags/<tag-name>
```

### Delete a remote tag

```shell script
git push --delete origin <tag-name> 
```

.