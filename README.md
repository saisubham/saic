# saic
Toy compiler with a recursive descent parser. Has support for:
- expressions
- statements
- conditional constructs (if-else)
- loops (for, while)
- functions
- closures

This is a standalone program without any external dependencies. The main function is [here](https://github.com/saisubham/saic/blob/main/src/com/sudosai/saic/Saic.java).

## Quickstart

### Getting the source
```
git clone https://github.com/saisubham/saic.git
```
### Building
Requires Java 11 or higher.

### Running the release version

#### Interactive prompt
```
java -jar saic
```
#### Executing a script
```
java -jar saic <filename>
```
