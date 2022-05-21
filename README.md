# JAR Runner

This simple Java program will run another `.jar` file that has a part of the file name that changes (ex: version).

Using this will make it so you don't have to keep updating your start command whenever you update your main program.

## How to use

`java -jar jar_runner-VERSION.jar BEGINNING END`

- Replace `VERSION` with the version of JAR Runner. This will rarely change.
- Replace `BEGINNING` with the part of the file name that's before the dynamic part.
- Replace `END` with the part of the file name that's after the dynamic part (do not include `.jar`).
