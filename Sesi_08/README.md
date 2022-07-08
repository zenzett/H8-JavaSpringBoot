>**DISCLAIMER**\
>Semua informasi di sini diterbitkan dengan tujuan baik dan murni hanya untuk informasi umum.\
>Benar atau tidaknya, kembali kepada referensi masing-masing individu.\
>Sekian, terima kasih.
>
>>**Panduan Penggunaan Aplikasi :**\
>		1. Aplikasi dapat dijalankan terpisah sesuai dengan keinginan user.\
>		2. Compile terlebih dahulu file java kemudian jalankan class dengan nama yang sama pada file java.\
>		3. Perhatikan pada bagian console untuk melihat hasil ataupun memasukkan inputan ke dalam program.

&nbsp;
## Multithreading and Synchronized Java

&nbsp;
### Multithreading Introduction
Konsep untuk dapat menjalankan task atau tugas lebih dari satu secara paralel, sehingga dengan konsep ini task yang banyak akan cepat selesai karena tidak saling tunggu untuk menyelesaikan task. Untuk menciptakan Thread di Java dapat dilakukan dengan dua cara, yaitu mengimplement interface Runnable dan meng-extends class Thread.

&nbsp;
### Synchronized Introduction
Contoh penggunaan method synchronized misalkan ketika mengakses resource secara bersama-sama, hal ini akan sangat berbahaya ketika thread tidak bisa dikontrol. Misalkan ada tugas untuk menulis ke sebuah file yang sama, proses ini thread harus dipastikan selesai terlebih dahulu kemudian bisa dilanjutkan thread yang lain untuk menulis juga.

&nbsp;
#### Latihan yang dilakukan pada materi ini:
- Tulis semua kode progran dari modul

- Buat project dengan cara buka terminal (CMD) di direktori yang diinginkan, lalu ketikkan ini:\
`mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

`mvn clean`

`mvn compile`

`mvn install`

`mvn test`

- Tambahkan kode ini di `pom.xml`, di paling bawah:
```
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
```

&nbsp;