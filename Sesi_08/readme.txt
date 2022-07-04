<<<<<<< HEAD
Sesi 08

- Tulis semua kode program dari kode.id

- Buat project dengan cara buka terminal (CMD) di direktori yang diinginkan, lalu ketikkan ini:
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn clean
mvn compile
mvn install
mvn test

- Tambahkan kode ini di pom.xml, di paling bawah:
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  <build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>2.3.2</version>
            <configuration>
                <archive>
                    <manifest>
                        <mainClass>com.learning.thread.App</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
=======
Sesi 08

- Tulis semua kode program dari kode.id

- Buat project dengan cara buka terminal (CMD) di direktori yang diinginkan, lalu ketikkan ini:
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn clean
mvn compile
mvn install
mvn test

- Tambahkan kode ini di pom.xml, di paling bawah:
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  <build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>2.3.2</version>
            <configuration>
                <archive>
                    <manifest>
                        <mainClass>com.learning.thread.App</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
>>>>>>> f4057c49296405e8d39733d095f2ace084f59623
  </build>