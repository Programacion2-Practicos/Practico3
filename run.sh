
# Java Example
#javac *.java
#java Main
clear
cd Unidad2
printf "Compiling..."
javac -d bin src/consola/*.java src/logica/*.java
if [ $? == 0 ] 
then
    clear
    java -cp bin consola.Principal
else
    printf "\n\n\nError - Exit code $?"
fi

