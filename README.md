# ce07 Evolving an Interface

This class exercise is designed to get you aquainted with TODO.

## Prerequisite Knowledge

* A basic understanding of creating and implementing interfaces in Java.
* https://github.com/cs1302uga/cs1302-tutorials/blob/master/interfaces/interfaces.md
* ANYTHING ELSE?

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce07`:

   ```
   $ git clone https://github.com/cs1302uga/cs1302-ce07.git
   ```
   
1. **[ALL GROUP MEMBERS]**
   Setup your Git username and email on Nike by modifiying and executing the commands below. 
   When setting the `user.name` property, please provide your name as it appears on eLC and
   Athena. If you have a preferred name, then you may include it in parentheses. For the
   `user.email` property, please use your `@uga.edu` email address:

   ```
   $ git config --global user.name "Mona Lisa (Liz)"
   $ git config --global user.email "email@uga.edu"
   ```
   
   You can verify that these properties were setup correctly by observing the output of
   the following commands:
   
   ```
   $ git config --global user.name
   $ git config --global user.email
   ```

1. Change into the `cs1302-ce07` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```
   
   For each Java file under the `cs1302-ce07` subdirectory, fill out a table similar to the following:
   
   | Name of the Java file | Interface or Implementing Class? | Fully Qualified Name (FQN) | Depends On |
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|
   
1. Make sure you are in the `cs1302-ce07` directory.
   Individually compile each `.java` file to `bin`. 
   Only specify the class path option when absolutely necessary.
   Write down the commands that you used in the order that you used them.
   
1. Create and document an additional class within the `cs1302.ce07` package that implements the `Driveable` 
   interface. Feel free to reuse one of the classes you or one of your group members created in a previous
   class exercise. If you do resuse a class that you already wrote, then take special care to update its
   package information and ensure it's documented properly.

1. Make sure you are in the `cs1302-ce07` directory.
   Compile the class you added in the previous step. 
   Write down the commands that you used in the order you used them.

1. Generate the API documentation website for all of the code in the `cs1302` package. 
   Host the documentation on Nike using `cs1302-ce07-doc` as the name for your symbolic link.
   What is the URL to your hosted website?
   
1. Make sure you are in the `cs1302-ce07` directory.
   Use the following commands to tell Git to add and commit the changes that you made to your
   source code to your local copy of the repository for this exercise.
   Modify the string associated with the `-m` option to give a brief, one sentence description
   of the changes you made to the source code.
   
   ```
   $ git add src
   $ git commit -m "added SomeClass that represents SOMETHING and implements Driveable."
   ```

**CHECKPOINT**

Add a `default` method to the interface.

1.

1. 

1. Use Git to commit your source code changes to your local copy of the exercise repository.

**CHECKPOINT**

Create new class that overrides the default method.

1. 

1. 

1. Use Git to commit your source code changes to your local copy of the exercise repository.

1. Use Git to display the log... 

**CHECKPOINT**
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
