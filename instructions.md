## FileLab Instructions
In src/FileLab.java, implement the following methods using their listed purpose.

Implement using methods of the File class.

## Grading
Public tests are available in /test.
For grading, there are also hidden tests to score the lab, so make sure the code follows the guidelines exactly.

## Methods
Implement these methods:

#### 1. public static boolean fileExists(File f)
   
   - Return whether the given file exists on the file system.


#### 2. public static boolean fileIsReadable(File f)

   - Determine whether the given file both exists and is readable.


#### 3. public static long fileSize(File f)

   - Return the size of the given file in bytes.
   - If the file does not exist, indicate this by returning -1


#### 4. public static String fileName(File f)

   - Return the name of the file (not its path).
   - Works whether the file exists or not.


#### 5. public static boolean deleteFile(File f)

   - Attempt to delete the given file from the file system.
   - Return true if the deletion succeeds, false otherwise.
   - Deletion shouldn't succeed if file is missing.

#### 6. public static boolean renameFile(File source, File target)

   - Attempt to rename the source file to the target file name or path.
   - Return true if the rename succeeds, false otherwise.
   - Renaming shouldn't succeed if file is missing.
