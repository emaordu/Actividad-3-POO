# Java Interfaces Exercises

This repository contains solutions for a series of Java programming exercises focusing on the use of interfaces. Below is an overview of each exercise.

## Exercise 1: Video Playback Interface

### Description
This exercise involves implementing a `VideoClip` interface. The interface defines three methods related to video playback:

- `play()`: Starts the playback of a video.
- `bucle()`: Repeats the video in an infinite loop.
- `stop()`: Stops the video playback.

The goal is to create a class named `ReproductorMultimedia` that implements this interface, providing specific behavior for each method.

## Exercise 2: Frequency Interface

### Description
In this exercise, you are required to work with a `Frecuencia` interface, which defines two methods:

- `millas()`: Returns the total miles accumulated by the entity.
- `ultimoViaje()`: Provides the date of the last trip made by the entity.

Two classes, `Pasajero` and `Vehículo`, are to be created, each implementing the `Frecuencia` interface. `Pasajero` represents a passenger and `Vehículo` represents a vehicle, both needing to provide specific implementations for the methods defined in the interface.

## Exercise 3: Animal Communication

### Description
This exercise focuses on creating a flexible system for making different entities "speak." 

1. **Abstract Class and Subclasses:**
   - An abstract class `Animal` is defined with an abstract method `hablar()`, which must be implemented by any subclass.
   - Two subclasses, `Gato` and `Perro`, override the `hablar()` method to provide specific behaviors for a cat and a dog, respectively.

2. **Interface Implementation:**
   - To make the solution more extensible, an interface `Hablador` is introduced, which includes the `hablar()` method.
   - The `Animal` class implements this interface, and a new class `RelojCuCu` (a cuckoo clock) is added, which also implements the `Hablador` interface.

The `TalkAdmin` class demonstrates how to use the interface to make different entities, including `Gato`, `Perro`, `RelojCuCu` and `Campana` "speak" by calling their respective `hablar()` methods.

## How to Use

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile and run the Java classes according to the instructions provided in the repository.

