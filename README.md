# repl-from-java

A Java library designed to let you easily inject a CIDER enhanced NRepl into any JVM based project you work on.

## Usage

Maven `pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project ...>
  ...
  <dependencies>
    ...
    <dependency>
      <groupId>com.github.kyleburton</groupId>
      <artifactId>repl-from-java</artifactId>
      <version>1.0.1</version>
    </dependency>
  </dependencies>
</project>
```

Leiningen `project.clj`:

```clojure
(defproject your-project "1.0.0-AWESOME"
  :description "Your project is AWESOME"
  :url "https://github.com/your/project"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    ...
    [com.github.kyleburton/repl-from-java "1.0.1"]
  ])
```

## License

Copyright © 2016 Kyle Burton <kyle.burton@gmail.com>

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
