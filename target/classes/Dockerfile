# Use an OpenJDK image that includes both JRE and JDK
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source file into the container
COPY RemainderCalculator.java .

# Compile the Java program
RUN javac RemainderCalculator.java

# Command to run the Java program when the container starts
CMD ["java", "RemainderCalculator"]