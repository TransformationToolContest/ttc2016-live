To build the standalone .jar, follow these steps:

1. From Eclipse, export as a runnable JAR file and save to an Ant script.

2. Run the Ant script manually: the generated JAR file is not usable, as
   it does not include the .xtextbin file required by Xtext for some reason.
