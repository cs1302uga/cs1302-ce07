# ce07 Evolving an Interface

This class exercise explores how to evolve an interface in Java without the need to
modify all of implementing classes. It also touches on how to commit and view changes
to a local Git repository.

## Prerequisite Knowledge

* A basic understanding of creating and implementing interfaces in Java.
* CSCI 1302 [Default Methods Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/default-methods/default-methods.md)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce07`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce07.git
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
   
   For each Java file under the `src` subdirectory, fill out a table similar to the following:
   
   | Name of the Java file | Interface or Implementing Class? | Fully Qualified Name (FQN) | Depends On |
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|
   |-----------------------|----------------------------------|----------------------------|------------|

   The "Depends On" column should list any Java types in the `cs1302.ce07` package that the file
   is dependent upon. 
   
1. Make sure you are in the `cs1302-ce07` directory.
   Individually compile each `.java` specifying `bin` as the default package location for compiled code.
   Only specify the class path option when absolutely necessary.
   You may need to create the `bin` directory if it does not already exist.
   Write down the commands that you used in the order that you used them.
   
1. Create and document an additional class within the `cs1302.ce07` package that implements the `Drivable` 
   interface. Feel free to reuse one of the classes you or one of your group members created in a previous
   class exercise. If you do resuse a class that you already wrote, then take special care to update its
   package information, make sure it's documented properly, and ensure that implements the version of the
   interface provided by this exercise. What is the fully qualified name of the class
   that you added?

1. Make sure you are in the `cs1302-ce07` directory.
   Compile the class you added in the previous step. 
   Write down any commands that you used in the order you used them.

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce07-doc` as the name for your symbolic link.
   What is the URL to your hosted website?
   
1. Make sure you are in the `cs1302-ce07` directory.
   Use the following commands to tell Git to add and commit the changes that you made to your
   source code to your local copy of the repository for this exercise.
   Modify the string associated with the `-m` (message) option to give a brief, one sentence 
   description of the changes you made to the source code.
   
   ```
   $ git add src
   $ git commit -m "added SomeClass that represents SOMETHING and implements Drivable."
   ```

**CHECKPOINT**

1. Add an `enum` called `LicenseClass` to the interface that represents the different
   license classifications for the people who drive the things that are
   `Drivable`. Each implementing class can set its license classification accordingly.
   For example, an `Airplane` class would use the `Aircraft` specification since all
   airplane operators need that specific classification on their license.
   Below is a list of license classification descriptions that must
   be supported. Your group should decide on reasonable names for the actual
   enumeration constants:

   * Non-Commercial Roadway
   * Commercial Roadway
   * Watercraft
   * Aircraft
   * Unclassified

   Make sure to provide a Javadoc comment for the `enum` that describes the type
   itself as well as the constants that it enumerates.

1. Modify the `Drivable` interface to include a default method called `getLicenseClass`
   that takes no parameters and returns a `LicenseClass`. Among the enumeration
   constants that your group included in `LicenseType`, pick one that you would consider
   is a safe choice to use as a default value. Your default method should return that
   constant.

1. Fully document all aspects of the `getLicenseClass` method using a Javadoc comment.
   Remember, most people will not see the inside of your method--they will only use it.
   Be sure to consider this when writing your Javadoc comment.

1. Update the `cs1302.ce07.Driver` class.

   * Update the `test` method to print the return value of the `Drivable` object's
     `getLicenseClass` method. Be sure to update the corresponding Javadoc
     comment.

   * Update the `main` method to create an object of the class you added for
     the previous checkpoint and test it with the `test` method. Please use `Drivable`
     for the variable type so as to remain consistent with other objects.

   Recompile all code and test it by running `cs1302.ce07.Driver`.
   Is the output what you expected?

1. Regenerate the API documentation website for all of the code in the `cs1302` package.
   What is the direct URL to the API documentation for the default  method that you wrote
   for this checkpoint?

1. Use Git to commit your source code changes to your local copy of the exercise repository.
   Since you haven't added any new source code files for this checkpoint, you can skip the
   `git add` step if, and only if, you add an additional `-a` option with `git commit`.
   Modify the string associated with the `-m` (message) option to give a brief, one sentence 
   description of the changes you made to the source code.
   What was the command you used to commit?

**CHECKPOINT**

1. Create and document yet another additional class within the `cs1302.ce07` package that
   implements the `Drivable` interface. In this class, provide an implementation of the
   `getLicenseClass` method. It should return a license classification that differs from
   the one returned by the default method in the interface.
   What is the fully qualified name of the class that you added?

1. Update the `main` method in the `cs1302.ce07.Driver` class:

   * Instead of creating multiple `Drivable` variables in the `main` method, refactor 
     the code to take a single array of `Drivable` objects. Something like the following 
     (may need to be modified):

     ```java
     Drivable drivables = new Drivable[] {
         new Car(185.5), // fast car
         new Car(75.0)   // slow car
     };
     ```

   * Loop over the array, and call the `test` method twice one each array element with
     different `speedupAmount` and `slowdownAmount` values.

   * Add an object of the class you added in the previous step to the end of the array.

   Recompile all code and test it by running `cs1302.ce07.Driver`.
   Is the output what you expected?

1. Regenerate the API documentation website for all of the code in the `cs1302` package.
   What is the direct URL to the API documentation for the class that you wrote
   for this checkpoint?

1. Use Git to commit your source code changes to your local copy of the exercise repository.
   Since you haven't added any new source code files for this checkpoint, you can skip the
   `git add` step if, and only if, you add an additional `-a` option with `git commit`.
   Modify the string associated with the `-m` (message) option to give a brief, one sentence 
   description of the changes you made to the source code.
   What was the command you used to commit?

1. Use Git to view your commit log:

   ```
   $ git log
   ```
   
   For more concise output, use the following:
   
   ```
   $ git log --graph --oneline --all
   ```

1. For now, we are using the `git` commands to log your modifications to your code on your
   local computer so that you (and the instructors/TAs) can see what you've done. There are 
   many additional features of git that we will explore in future tutorials and exercises. 
   These features include, but are not limited to, rolling back to an older version 
   of the code, collaborating with teammates, and branching.
   
**CHECKPOINT**
    
1. If you want to create beautiful ASCII text, then try the FIGlet tool:

   ```
   $ figlet hello!
   ```
   
1. The FIGlet tool also reads from standard input!

   ```
   $ figlet
   ```
   
   Just as with `cat`, use `C-d` to send the `EOF`.
   
1. Let its standard input come from another program using a pipe:

   ```
   $ find src -name "*.java" | figlet -w 100 -f slant
   ```

1. Read the manual page:

   ```
   $ man figlet
   ```
   
1. You can see the list of available fonts using the following command:

   ```
   $ showfigfonts
   ```

**NOT A CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
