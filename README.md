# intellij-example

## Reproduction steps:

1. Open this project in IntelliJ
2. "Generate Sources and Resync Project"
3. Observe `HelloTest.java` still shows red imports for junit
4. Right click `HelloTest.java` and "Run all tests"
5. Observe `HelloTest.java` imports are now resolved properly
